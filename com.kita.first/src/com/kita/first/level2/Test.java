package com.kita.first.level2;

import com.kita.first.level2.hyori.*;
import com.kita.first.level2.mamamoo.*;

public class Test {
	public static void main(String[] args) {
		
		Hwasa hs=new Hwasa();
		LeeHyoRi hr=new LeeHyoRi();
		
		Car car1 =new Car(30); //생성시킬때 값을 넣어나
//		car1.speed=50;
//		System.out.println(car1.speed);
		int car1Speed = car1.getSpeed();
		System.out.println(car1Speed);
		
		car1.setSpeed(40);
		System.out.println(car1Speed);
		car1Speed = car1.getSpeed();
		System.out.println(car1Speed);
		
		car1.setColor("검정");
		String carColor = car1.getColor();
		System.out.println(carColor);
	}
}
