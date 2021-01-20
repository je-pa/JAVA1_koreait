package com.kita.first.level2;

public class Car {
	private int speed;
	private String color;
	
	Car(int speed){
		this.speed =speed;
	}
	Car(String color){
		this.color=color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setColor(String color) {
		this.color=color;
	}
	
	int getSpeed() {
		return speed;
	}
	String getColor() {
		return color;
	}
}
