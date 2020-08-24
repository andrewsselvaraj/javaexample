package com.exam.mutuableImutable;

public class MutableClass {
	
	public int x;
	
	public int passprimitiveDataType(int x)
	{
		x= x+10;
		return x;
	}
	
	public Integer passObjectDataType(Integer x)
	{
		Integer x1= x+10;
		return x1;
	}
	
	public void printPrimitiveValuepassByvalue()
	{
		int pvalue= 90;
		System.out.println("before update"+pvalue);
		
		System.out.println("return agter update"+passprimitiveDataType(pvalue));
		
		System.out.println("return Pass  update"+pvalue);
	}
	
	public void printPrimitiveValuepassByReference()
	{
		Integer pvalue= new Integer(90);
		System.out.println("\n before update"+pvalue);
		
		System.out.println("return Pass  update"+passObjectDataType(pvalue));
		
		System.out.println("return Pass  update"+pvalue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		MutableClass m = new MutableClass();
		m.printPrimitiveValuepassByvalue();
		m.printPrimitiveValuepassByReference();
		
		System.out.println(m.hashCode());
	}

}
