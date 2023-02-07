package com.bootcamp.bootCampDay2.cadenaMando;

import java.util.ArrayList;
import java.util.List;

public class UnidadMando {
	private List<Unidad> ejercito;
	
	public UnidadMando() {
		this.ejercito = new ArrayList<>();
	}
	
	public void anadirEjercito(Unidad u) {
		this.ejercito.add(u);
	}
	
	public void ejecutarOrden(String o) {
		this.ejercito.get(0).ejecutaOrden(o);
	}
}
