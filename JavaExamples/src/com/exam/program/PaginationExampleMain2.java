 package com.exam.program;

import java.util.*;
import java.io.*;

class PData {

	String[][] items= null;
	int sortParamer;		
	int sortOrder;		
	int itemPerPage;		
	int pageNumber;


}

public class PaginationExampleMain2 {
	

	String[][] items= null;
	int sortParamer;		
	int sortOrder;		
	int itemPerPage;		
	int pageNumber;

	public static void main(String args[])
	{
		
		
		//String[] items = null;
		
		//String[] cart1= null;
		
		String[][] items= null;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter no of total item");		
		int item = s.nextInt();
		System.out.println("No of items in each item");		
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
		
		System.out.println(" Enter SortParameter");
		int sortParamer = s.nextInt();
		System.out.println("Enter SortOrder");
		int sortOrder = s.nextInt();
		System.out.println("Enter itemPerPage");
		int itemPerPage = s.nextInt();
		System.out.println("Enter page no");
		int pageNumber = s.nextInt();
		
		
		
		
		
		

		

	}

}
