package com;


public class ArrayRotate {
    
	 public static void main(String[] args) 
	 {    
	        int abc[] = new int [] {1, 2, 3, 4, 5};        
	        int n = 3;         
	        System.out.println("Original array: ");    
	        for (int i = 0; i < abc.length; i++)
	        {     
	            System.out.print(abc[i] + " ");     
	        }      
	        for(int i = 0; i < n; i++)
	        {    
	            int j, last;        
	            last = abc[abc.length-1];    
	            for(j = abc.length-1; j > 0; j--)
	            {    
   
	                abc[j] = abc[j-1];    
	            }        
	            abc[0] = last;    
	        }    
	        
	        System.out.println();       
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< abc.length; i++){    
	            System.out.print(abc[i] + " ");    
	        }    
	    }    
	}    