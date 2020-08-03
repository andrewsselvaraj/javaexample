package com.exam.program;

public class WholeMinuteDilemma {
	
	public static void main(String args[])
	{
		WholeMinuteDilemma wmin = new WholeMinuteDilemma();
		//int[] data = {4,10,50,90,30};
		//int[] data = {5,30,20,150,100,40};
		int[] data = {3,60,60,60};
		wmin.pairMinutes(data);
	}

	private void pairMinutes(int data[]) {
		
		int size = data[0];
		
		int matchCount =0;
		
		for(int i=1;i<size;i++)
		{
		// TODO Auto-generated method stub
			for(int j=i+1;j<=size;j++)
			{
				int total = data[i] + data[j];
				if(total%60==0)
				{
					matchCount= matchCount + 1;
					System.out.println(data[i]+ " , " + data[j] +" = "+total);
				}
			}
		}
		System.out.println("Sample output "+matchCount);
		
		
	}

}
