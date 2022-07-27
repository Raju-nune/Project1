package com;

public class SelectionSortAlgorithm {
	    void sort(int pqr[])
	    {
	        int n = pqr.length;
	        for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (pqr[j] < pqr[min_idx])
	                    min_idx = j;
	            int temp = pqr[min_idx];
	            pqr[min_idx] = pqr[i];
	            pqr[i] = temp;
	        }
	    }
	    void printArray(int pqr[])
	    {
	        int n = pqr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(pqr[i]+" ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        SelectionSortAlgorithm ob = new SelectionSortAlgorithm();
	        int pqr[] = {64,25,12,22,11};
	        ob.sort(pqr);
	        System.out.println("Sorted array");
	        ob.printArray(pqr);
	    }
	}
