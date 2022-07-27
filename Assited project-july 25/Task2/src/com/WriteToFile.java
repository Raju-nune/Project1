package com;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Programs in java are tough to understand!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 


