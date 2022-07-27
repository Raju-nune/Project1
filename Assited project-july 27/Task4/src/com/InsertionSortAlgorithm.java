package com;
public class InsertionSortAlgorithm 
{
	    public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) 
	        {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) )
	            {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	       
	    public static void main(String a[]){    
	        int[] arr1 = {11,21,31,51,61,19,10,07,02,81};    
	        System.out.println("Before Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	        insertionSort(arr1);   
	        System.out.println("After Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	    }    
	}    

