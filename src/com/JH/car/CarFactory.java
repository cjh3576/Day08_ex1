package com.JH.car;

public class CarFactory {

	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		CarView cv = new CarView();
		Car car = new Car();
		ColorPaint cp = new ColorPaint();
		
		
		car = en.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);
		//cv.view(car);
		car.info("Blue");
		Car car2 = new Car();
		car2.color = "white";
		car2.info("RED");
	}


}
