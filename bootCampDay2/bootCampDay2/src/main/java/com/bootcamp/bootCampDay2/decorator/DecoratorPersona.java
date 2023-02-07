package com.bootcamp.bootCampDay2.decorator;

import com.bootcamp.bootCampDay2.persona.iPersona;

public class DecoratorPersona implements iPersona{
	
	private iPersona p;
	
	public DecoratorPersona(iPersona p) {
		this.p = p;
	}

	@Override
	public String getName() {

		return "Decorator";
	}

	@Override
	public int getAge() {

		return 999;
	}
	
}
