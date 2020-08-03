package com.exam.program;

 abstract class Shape 
{
	public abstract  void drawShape(); 
}
class Square extends Shape
{

	@Override
	public void drawShape() {
		System.out.println("Drwa Square");
		
	}
	
}
class Circle extends Shape
{

	@Override
	public void drawShape() {
		System.out.println("Drwa cricle");
		
	}
	
}
class Rectangle extends Shape
{

	@Override
	public void drawShape() {
		System.out.println("Drwa rectanle");
		
	}
	
}
class ShapeFactory
{
	public void drawShape(String type)
	{
		Shape s =null;
		if(type.equalsIgnoreCase("CIRLCE"))
		{
			s = new Circle();
		}
		if(type.equalsIgnoreCase("SQUARE"))
		{
			s=  new Square();
		}
		else {
	
		}
		s.drawShape();
	}
}
public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory a = new ShapeFactory();
		a.drawShape("CIRLCE");
	}

}
