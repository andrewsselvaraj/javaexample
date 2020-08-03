package com.exam.program;

import java.util.*;
import java.io.*;



public class Pagination {
	

	String[][] items= null;
	int sortParamer;		
	int sortOrder;		
	int itemPerPage;		
	int pageNumber;

	public static void main(String args[])
	{
		Pagination p =new Pagination();
		
		p.getDetails();
		
	}
	
	public void inputData()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter no of total item");		
		int item = s.nextInt();
		System.out.println("No of items in each item for Name Relative Price");		
		s = new Scanner(System.in);
		int itemContent= s.nextInt();
		
		
		
		items = new String[item][itemContent];

		System.out.println("no nof items"+item);
		for(int i=0;i<item;i++)
		{
			
			for(int j=0;j<itemContent;j++)
			{
				System.out.println("Enter item "+i +" "+j + " item products");
			String itemsinItem = s.next();
			System.out.println("item "+i +" " + " item products"+j);
			items[i][j]=itemsinItem;

			}
		
		}
		
		System.out.println(" Enter SortParameter name 0 - relave - 1 price 2");
		int sortParamer = s.nextInt();
		System.out.println("Enter SortOrder 0-ascending 1 decending");
		int sortOrder = s.nextInt();
		System.out.println("Enter item Per Page any no ");
		int itemPerPage = s.nextInt();
		System.out.println("Enter pageNumber to find data");
		int pageNumber = s.nextInt();
	}
	
	private void getDetails() {
		// TODO Auto-generated method stub
		inputData();
		if(sortParamer == 0)
		{
			
		}
		else if(sortParamer == 1)
		{
			
		}
		else if(sortParamer == 2)
		{
			
		}
		
	}

}
