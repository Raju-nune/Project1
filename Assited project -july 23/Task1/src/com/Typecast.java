package com;

public class Typecast {

		public static void main(String[] args) {
			//Implicit conversion
			   byte p = 12;  
		       short q =(short) p;  
			   int r = (int)q;   
		       long s = (long)r;  
		       float t = (float)s;  
		       double u = (double)t;
		      //expilcit conversion	   
		       double d = 100.04;
			   long l = (long)d;
			   int i = (int)l;
			   short sh=(short)i;
			   byte b=(byte)sh;
			   System.out.println("short value "+q);
			   System.out.println( "int value "+r);
			   System.out.println("long value "+s); 
			   System.out.println("float value "+t); 
			   System.out.println("double value "+u); 
		       System.out.println("double value "+d);
		       System.out.println("long value "+l);
			   System.out.println( "int value "+i);
			   System.out.println( "short value "+sh);
			   System.out.println( "byte value "+b);

		}

	}


