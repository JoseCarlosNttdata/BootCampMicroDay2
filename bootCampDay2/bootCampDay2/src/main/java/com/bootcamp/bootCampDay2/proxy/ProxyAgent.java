package com.bootcamp.bootCampDay2.proxy;

public class ProxyAgent extends PersonAbstractProxy{

	public ProxyAgent(iPersonaProxy p) {
		super(p);
	}

	@Override
	public void before() {
		System.out.println("Ejecutando comprobacion...");
	}

	@Override
	public void after() {
		System.out.println("Cerrando procesos...");		
	}
}
