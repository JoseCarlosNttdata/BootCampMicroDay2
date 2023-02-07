package com.bootcamp.bootCampDay2.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bootcamp.bootCampDay2.persona.Persona;

@Configuration
public class Config {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Persona prototypePerson() {
		return new Persona();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Persona singletonPerson() {
		return new Persona();
	}
	
	
}
