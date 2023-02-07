package com.bootcamp.bootCampDay2.facade;

import com.bootcamp.bootCampDay2.persona.Persona;

public class facadePersona {
	private Persona p;
	
	public facadePersona(String name, int age) {
		p = new Persona(age,name);
	}
	
	public Boolean mediaEdad() {
		return (p.getAge() >= 20 && p.getAge() <= 30);
	}
}
