package com.JH.car;

public class CarView {
	public void view(Car car) {
		System.out.println("엔진파워  : " +car.engine.hp );
		for(int i = 0; i<car.wheels.length; i++) {
			System.out.println("Wheel color : " + car.wheels[i].color);
			System.out.println("Wheel size : " + car.wheels[i].size);
		}
		System.out.println("Color : " +car.color);
	}
}
