package com.lumen.LambdaDemo;



public class ShapeFactory {
	void printArea(Shaper shape,double x,double y) {
		System.out.println("printingArea");
		double area=shape.CalcArea(x, y);
		System.out.println(area);
		System.out.println("Completed");
	}
	
}

