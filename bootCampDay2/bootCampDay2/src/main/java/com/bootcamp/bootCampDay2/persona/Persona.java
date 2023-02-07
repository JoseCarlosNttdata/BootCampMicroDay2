package com.bootcamp.bootCampDay2.persona;

import com.bootcamp.bootCampDay2.proxy.iPersonaProxy;

import lombok.Builder;

@Builder
public class Persona implements Cloneable, iPersona, iPersonaProxy{
	private static Persona INSTANCE = null;
	private int age;
	private String name;
	
	
	public static Persona getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Persona();
		}
		return INSTANCE;
	}
	
	public Persona(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// Este siempre tienes que ser private para seguridad
	public Persona() {}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Persona [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public Persona clone() {
		return new Persona();
	}

	@Override
	public void operation() {
		System.out.println("Usuario " + getName() + " con la edad de " + getAge() + " está iniciando la operacion...");		
	}
	
	
	
}
