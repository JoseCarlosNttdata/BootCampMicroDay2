package com.bootcamp.bootCampDay2.cadenaMando;

public class Unidad {

	protected Unidad mando;
	protected String nombre;
	
	public Unidad(String nombre) {
		this.nombre = nombre;
	}
	
	public void estableMando(Unidad mando) {
		this.mando = mando;
	}
	
	public void ejecutaOrden(String orden) {
		if(mando != null) {
			System.out.println("\nMando de " + this.nombre + " ordena la orden a " + mando.nombre + orden);
		}else {
			System.out.println("\nNo existe un mando, para realizar esa orden.");
		}
	}
	

}
