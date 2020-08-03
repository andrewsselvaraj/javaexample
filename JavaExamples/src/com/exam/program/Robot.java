package com.exam.program;

public class Robot {
	int x;
	int y;
	int px;
	int py;
	public Robot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Current Location"+"x="+x +"y="+y);
	}
	public void moveX(int dx)
	{
		this.px = this.x;
		this.py = this.y;
		//System.out.println("Previous Location x="+this.px +"y="+this.py);
		
		this.x= this.x+dx;
 
		
		System.out.println("Current Location"+"x="+x +"y="+y);
	}
	public void moveY(int dy)
	{
		this.px = this.x;
		this.py = this.y;
	//	System.out.println("Previous Location x="+this.px +"y="+this.py);
		
		this.x= this.x+dy;
 
		
		System.out.println("Current Location"+"x="+x +"y="+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot(0,5);
		r.set(2, 1);
		r.moveX(1);
		r.moveY(0);
		
		r.printCurrentCoordinates();
		r.printLastCoordinates();
		r.printLastMove();
		r.moveX(2);
		r.printCurrentCoordinates();
		r.printLastCoordinates();
		r.printLastMove();
		
		

	}
	private void printLastMove() {
		// TODO Auto-generated method stub
		
		System.out.println("Previous Location x="+this.x +"y="+this.y);
		
	}
	private void printLastCoordinates() {
		// TODO Auto-generated method stub
		System.out.println("Previous Location x="+this.px +"y="+this.py);
		
	}
	private void printCurrentCoordinates() {
		// TODO Auto-generated method stub
		
	}
	private void set(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Current Location"+"x="+x +"y="+y);// TODO Auto-generated method stub
		
	}

}
