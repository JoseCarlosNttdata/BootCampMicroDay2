package com.bootcamp.bootCampDay2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bootcamp.bootCampDay2.cadenaMando.Unidad;
import com.bootcamp.bootCampDay2.cadenaMando.UnidadMando;
import com.bootcamp.bootCampDay2.facade.facadePersona;
import com.bootcamp.bootCampDay2.persona.Persona;
import com.bootcamp.bootCampDay2.persona.PersonaLombok;
import com.bootcamp.bootCampDay2.proxy.PersonAbstractProxy;
import com.bootcamp.bootCampDay2.proxy.ProxyAgent;

@SpringBootApplication
@ComponentScan(value="com.bootcamp.bootCampDay2")
public class BootCampDay2Application {


	@Autowired
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		//SpringApplication.run(BootCampDay2Application.class, args);
		
		//Basic
		System.out.println(new Persona(31, "Jose Carlos").toString()+"\n");

		//Lombok
		System.out.println(PersonaLombok.builder().name("Manuel").age(80).build().getName()+"\n");
		
		//Decorator
		//System.out.println(((Persona) context.getBean("personaPrototype")).getName());
		
		//Facade
		List<facadePersona> personas = new ArrayList<facadePersona>();
		personas.add(new facadePersona("pepe",20));
		personas.add(new facadePersona("juan",27));
		personas.add(new facadePersona("antonio",10));
		personas.add(new facadePersona("manolo",30));
		for(facadePersona p :personas) {
			System.out.println("Cumple la media entre 20 y 30? - "+p.mediaEdad()+"\n");			
		}
		
		//Proxy
		Persona p = new Persona(20,"pepe");
		PersonAbstractProxy pAgent = new ProxyAgent(p);
		pAgent.operation();
		
		//Cadena de mando
		Unidad u = new Unidad("Comandante");
		Unidad u1 = new Unidad("Capitan");
		Unidad u2 = new Unidad("Soldado");
		
		//Capitan a Soldado
		u1.estableMando(u2);
		// Comandante a Capitan
		u.estableMando(u1);
		
		UnidadMando um = new UnidadMando();
		//Soldado no manda a nadie
		//um.anadirEjercito(u2);
		
		//Capitan a soldado
		//um.anadirEjercito(u1);
		
		//Comandante a Capitan
		um.anadirEjercito(u);

		um.ejecutarOrden(" Fuegooooo");
		
		
		
		
	}

}
