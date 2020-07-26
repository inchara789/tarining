package com.cruds.demo;

public class DepthofJSON {
	
	 static int maxDepth(String S) { 
	        int current_max = 0; // current count  
	        int max = 0; // overall maximum count  
	        int n = S.length(); 
	  
	        // Traverse the input string  
	        for (int i = 0; i < n; i++) { 
	            if (S.charAt(i) == '{') { 
	                current_max++; 
	  
	                // update max if required  
	                if (current_max > max) { 
	                    max = current_max; 
	                } 
	            } else if (S.charAt(i) == '}') { 
	                if (current_max > 0) { 
	                    current_max--; 
	                } else { 
	                    return -1; 
	                } 
	            } 
	        } 
	  
	        // finally check for unbalanced string  
	        if (current_max != 0) { 
	            return -1; 
	        } 
	  
	        return max; 
	    } 
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}}";
		System.out.println("depth="+maxDepth(s));
		
		
				

	}

}
