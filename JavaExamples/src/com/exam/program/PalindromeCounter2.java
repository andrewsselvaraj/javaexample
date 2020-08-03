package com.exam.program;

public class PalindromeCounter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCounter2 p = new PalindromeCounter2();
		//String policount = "tacocat";
		String policount = "abccba";
		p.polindromeCOunter(policount);
	}

	private int polindromeCOunter(String str) {
		// TODO Auto-generated method stub
		int count=0;
		
		char[] a = str.toCharArray();
		int strlength=str.length();
		
		// 1. take word
		// 2. substring n th letter 
		// 3. reverse substring with substrng content
		//OrdureBarbaIthacaRevoir
		
		
		//AcridPomelyShammyGoyim
		
		//server1.haydenmusicschool.com	104.251.217.248	Linux VPS - VD6GB7	$7.00 USD	Monthly	08/22/2020	Active
		int countpoly=0;
		for(int i=0;i<strlength;i++)
		{
			System.out.println("");
			for(int j=i+1;j<=strlength;j++)
			{
				
			//	System.out.print(i+" "+j +" -> " );
				//System.out.println(" "+str.substring(i, j));
				String polysub = str.substring(i, j);
				String revpoly = reverseString(polysub);
			//	System.out.print("poly and rev poly "+polysub);
			//	System.out.print(" = "+revpoly);
			//	System.out.println("");
				if(polysub.equalsIgnoreCase(revpoly))
				{
					countpoly = countpoly + 1;
					System.out.println(countpoly + " ANSWERRRRRRRRRRRRR => "+polysub);
				}
				
				
			}
		}
		
		
		
		return count;
	}
	
	public String reverseString(String polysub)
	{

		
		StringBuilder sb = new StringBuilder(polysub);
				
		return sb.reverse().toString();

	}

}
