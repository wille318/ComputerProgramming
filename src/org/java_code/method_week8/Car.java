package org.java_code.method_week8;

public class Car {
	
	String color;
	int speed = 0;
	
	String getcolor() {
		return color;
	}
	
	int getspeed() {
		return speed;
	}
	
	void upspeed(int value) {
		speed = speed + value;
		if(speed>200) speed =200;
	}
	
	void downspeed(int value) {
		speed -= value;
		if (speed<0) speed = 0;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "Red";
		car1.speed = 0;
		
		System.out.println(car1.getcolor());
		car1.upspeed(50);
		car1.upspeed(100);
		car1.upspeed(100);
		System.out.println(car1.getspeed());
		car1.downspeed(300);
		System.out.println(car1.getspeed());

	}

}
