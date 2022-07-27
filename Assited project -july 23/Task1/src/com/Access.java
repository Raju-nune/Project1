package com;

class A
{
   public int b=2;
   private int p=10;
   protected void display()
   {
   	System.out.println("Love everyone!");
   }
}
   class B extends A
   {
      int a=5;
   }

class Access
{
public static void main(String[] args)
	{
	    
       B obj = new B();
       System.out.println(obj.b); //default element
      // System.out.println(obj.p);//throws an error private variable of another class
       System.out.println(obj.a);//public element
       obj.display();//protected element
	}
}









