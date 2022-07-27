package com;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	class RegularExp {
	    public static void main(String args[])
	    {   
	        Pattern p1 = Pattern.compile("newspaper", Pattern.CASE_INSENSITIVE);
	         Matcher m = p1.matcher("Visit Newspaper!");
	         boolean matchFound=m.find();
	         if(matchFound) 
	         {
	        	 System.out.println("Match found");
	         }
	         else
	         {
	        	 System.out.println("Match not found");
	         }
	 
	     
	}
}
