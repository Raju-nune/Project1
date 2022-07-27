package com;
public class FinallyExample
{
    public static void main(String[] args)
    {
        int a=45,b=0,res=0;
        try
        {
            res = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + res);
        }
    }
}