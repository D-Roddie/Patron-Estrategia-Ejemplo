package com.cenfotec.seguridad;

import com.cenfotec.animales.Ave;
import com.cenfotec.animales.Chihuahua;
import com.cenfotec.animales.Gorrion;
import com.cenfotec.animales.Yiguirro;
import com.cenfotec.animales.Zaguate;
import com.cenfotec.sonidos.BarkSoundGuau;
import com.cenfotec.sonidos.DoubleBarkSoundGuau;

public class AppLineaDeComando {

	public static void main(String[] args) {
		Yiguirro unYigui = new Yiguirro();
		Gorrion unGorrion = new Gorrion();
		Zaguate zaguate = new Zaguate();
		Chihuahua enano = new Chihuahua();
		
		zaguate.setBarker(new BarkSoundGuau());
		enano.setBarker(new DoubleBarkSoundGuau());
				
		System.out.println(unYigui.sing());
		System.out.println(unGorrion.sing());
		System.out.println(zaguate.bark());
		System.out.println(enano.bark());
		
		zaguate.play();
		enano.play();
	}

}
