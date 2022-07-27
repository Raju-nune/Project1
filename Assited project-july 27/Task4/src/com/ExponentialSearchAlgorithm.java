package com;


	import java.util.Arrays;
	  
	public class ExponentialSearchAlgorithm
	{
	    static int exponentialSearch(int pqr[], int n, int x)
	    {
	       
	        if (pqr[0] == x)
	            return 0;
	        int i = 1;
	        while (i < n && pqr[i] <= x)
	            i = i*2;
	        return Arrays.binarySearch(pqr, i/2,Math.min(i, n-1), x);
	    }
	     
	    public static void main(String args[])
	    {
	        int pqr[] = {2, 3, 4, 10, 40};
	        int x = 10;
	        int result = exponentialSearch(pqr, pqr.length, x);
	          
	        System.out.println((result < 0) ?"Element is not present in array" :"Element is present at index " +result);
	    }
	}
