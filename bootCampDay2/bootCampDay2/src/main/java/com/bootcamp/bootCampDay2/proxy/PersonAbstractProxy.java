package com.bootcamp.bootCampDay2.proxy;

public abstract class PersonAbstractProxy implements iPersonaProxy{
	
	private iPersonaProxy p;
	
	public PersonAbstractProxy(iPersonaProxy p) {
		this.p = p;
	}

	@Override
	public void operation() {
		before();
		p.operation();
		after();
	}

	public abstract void before();
	
	public abstract void after();
}
