package com;

	class College
	{
		void display()
		{
	      System.out.println("Cssk collge");
		}

	    class Student {
	        public void show()
	        {
	        	String Cse="250";
	            System.out.println("No of Students are there in College");
	            System.out.println("no of Students from CSE "+Cse);
	        }
	    }
	}
	class Inner {
	    public static void main(String[] args)
	    {
	       College.Student st=new College().new Student();
	        st.show();
	        //st.display();
	    }
	}



