package com.cruds.demo;

public class TokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String input="10,14,67,78";
		int sum=0;
		
		String[] tokens=input.split(",");
		for(String s:tokens)
		{
			System.out.println(s);
			int x=Integer.parseInt(s);
			sum+=x;
			
		}
		System.out.println(sum);*/
		
		String input="100 5,100 5,100 5|1 100 5|0 100 5";
		
	    String[] tokens=input.split("[|\\,\\ ]");
		for( String m:tokens)
				{
					int x=Integer.parseInt(m);
					System.out.println(x);
					
				}
		

		}

}
