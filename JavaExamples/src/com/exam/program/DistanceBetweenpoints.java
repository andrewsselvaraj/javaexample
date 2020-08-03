package com.exam.program;

import java.lang.Math;

public class DistanceBetweenpoints {
	
	//qrt
	public void distanceBetweenTwo(int[] no)
			{
		double x1 = no[0];
		double y1 = no[1];
		double z1 = no[2];
		double x2 = no[3];
		double y2 = no[4];
		double z2 = no[5];
		System.out.println("x1 "+x1);
		System.out.println("y1 "+y1);
		System.out.println("z1 "+z1);
		System.out.println("x2 "+x2);
		System.out.println("y2 "+y2);
		System.out.println("z2"+z2);
					
		double distance1 = java.lang.Math.pow((x2 - x1),2);
		double distance2 = java.lang.Math.pow((y2 - y1),2);
		double distance3 = java.lang.Math.pow((z2 - z1),2);
		System.out.println("Distance1 "+distance1);
		System.out.println("Distance2 "+distance2);
		System.out.println(" Distance3 "+distance3);
		
		double distance2result = distance1+distance2;
		double distance3result = distance1+distance2+distance3;
		System.out.println("2D Distance "+java.lang.Math.sqrt(distance2result));
		double dd = java.lang.Math.sqrt(distance2result);
		double dt = java.lang.Math.sqrt(distance3result);

		System.out.println("2D Distance "+ java.lang.Math.ceil(dd));
		System.out.println("3D Distance "+ java.lang.Math.ceil(dt));
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistanceBetweenpoints d = new DistanceBetweenpoints();
		int[] a= {1,2,3,4,5,6};
		int[] b= {-1,-2,4,-7,-1,-1};
		d.distanceBetweenTwo(b);
		

	}

}
