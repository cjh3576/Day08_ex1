package com.JH.mobile;

public class MobileMain {

	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		Phone phone = new Phone();
		
		phone.brand = "Apple";
		pv.view(phone);
		
		
	}

}

