package comm;

	class MyException extends Exception 
	{ 
	    public MyException(String msg) 
	    { 
	        super(msg); 
	    } 
	} 
	public class MyexceptionExample
	{ 
	    public static void main(String args[]) 
	    { 
	    	int a=10;
	    	int b=5;
	        try
	        { 
	        	if(a>b) 
	        	{
	        	
	            throw new MyException("a>b"); 
	            }
	        }
	        catch (MyException ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}


