package comm;
import java.io.File; 

public class DeleteToFile {
    public static void main(String[] args)
    {
        File myObj = new File("myfile.txt");
        if (myObj.delete()) 
        {
            System.out.println("The deleted file is : "+ myObj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
    }
}
