package edu.grcy.patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		Volvo volvo = new Volvo("S40", 240); // w domyśle prędkość jest w kmh

		Jeep jeep = new Jeep("Renegade", 160); // w domyśle prędkość jest w mph

		System.out.println(volvo.getName()+" max speed: "+ volvo.getSpeed());
		System.out.println(jeep.getName() + " max speed: " + jeep.getSpeed());
		System.out.println(jeep.getName() + " max speed for Europe: " + jeep.getSpeedKMH());



		System.out.println(volvo.getName()+" max speed for US: "+ volvo.getSpeedMPH());
	}
}
