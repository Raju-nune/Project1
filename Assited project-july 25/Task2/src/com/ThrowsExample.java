package com;
public class ThrowsExample
{
    void Division() throws ArithmeticException
    {
        int a=45,b=0,res;
         res = a / b;
        System.out.print(" \n\tThe result is : " + res);
    }
     public static void main(String[] args)
    {
ThrowsExample Ex = new ThrowsExample();
         try
        {
            Ex.Division();
        }
        catch(ArithmeticException E)
        {
            System.out.print("\n\tError : " + E.getMessage());
        }
        System.out.print("\n\tByee!!.");
    }
}

