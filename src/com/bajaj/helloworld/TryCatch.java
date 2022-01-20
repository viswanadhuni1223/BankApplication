package com.bajaj.helloworld;

public class TryCatch {
	 public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	  
	        }  
	            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
		        //System.out.println("rest of the code");  

	        }  
	        System.out.println("rest of the code");  
	    }  
}
