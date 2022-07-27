package com;
	import java.io.*; 
	import java.util.*; 
	  
	class Collection { 
	  
	    public static void main(String[] args) 
	    { 
	       
	        int arr[] = new int[] { 1, 2, 3, 4 }; 
	        Vector<Integer> v = new Vector(); 
	        Hashtable<Integer, String> h = new Hashtable(); 
	  
	        v.addElement(1); 
	        v.addElement(2); 
	  
	      
	        h.put(1, "Dhoni"); 
	        h.put(2, "Virat"); 
	  
	     
	        System.out.println(arr[0]); 
	        System.out.println(v.elementAt(0)); 
	        System.out.println(h.get(1)); 
	        System.out.println(h.get(2));
	  
	        
	    } 
	} 

