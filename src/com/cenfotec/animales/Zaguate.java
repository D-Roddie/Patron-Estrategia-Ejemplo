package com.cenfotec.animales;

public class Zaguate extends Can {
	@Override
	protected void moveTail() {
		System.out.println("A mover la colita");

	}

	@Override
	protected void run() {
		System.out.println("Coriendooo");

	}

	@Override
	protected void layDown() {
		System.out.println("Cuerpo a tierra!");

	}

}
