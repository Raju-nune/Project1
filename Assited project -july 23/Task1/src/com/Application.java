package com;

 class Operation
 {
	
		int a,b,sum;
		Operation()
		{
			a=10;
			b=20;
		}
		Operation(int x, int y)
		{
			a=x;
			b=y;
		}
		void add() {
			sum = a+b;
		}
		void display()
		{
			System.out.println("sum is "+sum);
		}
 }


 class Application 
{

public static void main(String args[]) 
	{
	Operation op1 = new Operation();										
	Operation op2 = new Operation();
	op1.display();
	op2.add();		
	op2.display();
	}
}




