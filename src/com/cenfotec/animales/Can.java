package com.cenfotec.animales;

import com.cenfotec.sonidos.MakeNoise;

public abstract class Can {
	protected String name;
	protected boolean isLongHair;
	protected MakeNoise barker;

	public void setBarker(MakeNoise soundEmitter) {
		this.barker = soundEmitter;
	}

	public String bark() {
		return this.barker.sound();
	}

	//Template Method / Metodo Plantilla
	public final void play() {
		bark();
		moveTail();
		run();
		layDown();
		bark();
	}

	protected abstract void moveTail();

	protected abstract void run();

	protected abstract void layDown();

}
