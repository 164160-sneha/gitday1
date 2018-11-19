package com.sneha.oop;

public abstract class Shape {
	abstract void draw();
		
	

	public static void main(String[] args) {
		
		
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
		
		Cube cube=new Cube();
		cube.draw();
		
		Line lin=new Line();
		lin.draw();
		
	}

}
