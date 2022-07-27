package com;
import java.util.*;
	public class InfoMap
	{
	    public static void main(String[] args)
	    {
	    	Map<String, Integer> map = new HashMap<>();
	        map.put("MsDhoni", 07);
	        map.put("Virat", 18);
	        map.put("Raju", 07);
	        for (Map.Entry<String, Integer> e : map.entrySet())
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
	    }
}
