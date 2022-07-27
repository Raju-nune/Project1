package com;

public class LinearSearchAlgorithm {  
		public static int linearSearch(int[] abc, int key){    
		        for(int i=0;i<abc.length;i++){    
		            if(abc[i] == key){    
		                return i;    
		            }    
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){    
		        int[] a1= {10,20,30,50,70,90};    
		        int key = 50;    
		        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
		    }    
		}    


