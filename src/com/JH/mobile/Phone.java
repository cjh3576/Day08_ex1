package com.JH.mobile;

public class Phone {
	String brand;
	int price;
	String color;
	int size;
	public Phone() {
		//디폴트 생성자, 빈생성자, 기본생성자
		//매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트 생성자를 하나 생성한다.
		this.brand = "LG";
		this.price = 200;
		color = "RED";
		size = 20;
		System.out.println("생성완료");
		this.info();
	}
	public void info() {
		System.out.println("phone~~~~~~~~~");
		
	}
}
