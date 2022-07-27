package com;

public class BinarySearchAlgorithm {
		 public static void binarySearch(int xyz[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( xyz[mid] < key ){  
		        first = mid + 1;     
		      }else if ( xyz[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[]){  
		        int xyz[] = {10,20,30,40,50};  
		        int key = 30;  
		        int last=xyz.length-1;  
		        binarySearch(xyz,0,last,key);     
		 }  
		}  


