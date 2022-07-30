package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
		while(true)
		{
			System.out.println("1.Retrieve current file  2.Business level operation menu  3.Exit from the application");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice");
			int a=sc.nextInt();
			if(a==1)
			{
				if(al.isEmpty()) 
				{
					System.out.println("Empty folder");
				}
				else
				{
				System.out.println("files in ascending order ");
			    Collections.sort(al);
			    Iterator<String> ir = al.iterator();
				while(ir.hasNext())
				{
					System.out.println(ir.next());	
				}
			}
			}
			else if(a==2)
			{
				while(true) {
					System.out.println("1.Add file  2.Delete file  3.Serching file  4.Exit from Menu ");
					System.out.println("enter your choice");
					int b=sc.nextInt();
					if(b==1) {
					     try {
					    	 System.out.println("enter your file name  ");
					    	 Scanner sc1=new Scanner(System.in);
					    	 String str=sc1.nextLine();			        
					    	 File Obj = new File(str);
					         if (Obj.createNewFile())
					         {
					             System.out.println("File create " + Obj.getName());
					             FileWriter myWriter = new FileWriter(str);
					             System.out.println("enter your data to add  ");
					             String str1=sc1.nextLine();
					             myWriter.write(str1);
					             myWriter.close();
					             System.out.println("Successfully wrote to the file.");
					             al.add(str);
					         }
					         else {
					             System.out.println("File already exists.");
					         }
					     }
					     catch (IOException e) {
					         System.out.println(e);
					         
					     }
					 
					}
					else if(b==2) {
						System.out.println("enter your file name  ");
				    	 Scanner sc2=new Scanner(System.in);
				    	 String str2=sc2.nextLine();			
						File myObj = new File(str2);
				        if (myObj.delete()) 
				        {
				            System.out.println("The deleted file is : "+ myObj.getName());
				            al.remove(str2);
				        }
				        else {
				            System.out.println( "Failed in deleting the file.");
				  
				        }
					}
					else if (b==3) {
						int c=0;
						System.out.println("enter filename for search ");
						Scanner sc3 = new Scanner(System.in);
						String str3=sc3.nextLine();
						Iterator<String> ir = al.iterator();
						while(ir.hasNext()) {
							if(str3.compareTo(ir.next())==0) {
								System.out.println("search found  ");							    
								c=1;
								break;
							}
							
						}
						if(c==0) {
							System.out.println("String not found ");
						}
						else {
							try 
							{
							FileReader reader = new FileReader(str3);
						    int data;
						    System.out.println("Read data from file: "+str3);
						    while((data=reader.read())!=-1) {
								System.out.print((char)data);
								
							}
						   System.out.println("\n");
							}
							catch(Exception e) {
								System.out.println(e);
							}

						}
					}
					else if (b==4) {
						System.out.println("Exit from Menu ");
						break;
					}
					else{
						System.out.println("invalid choice! ");
					}
					
				}
				
			}
			else if(a==3)
			{
				System.out.println("Exit from Application ");
				break;

			}
			else{
				System.out.println("Invalid choice");
			}
			
			
			
		}
	

	}

}
