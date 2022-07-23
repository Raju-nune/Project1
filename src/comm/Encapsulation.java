package comm;
 class Car
{  
        private String name; 
        public String getName()
    {
           return name;
          
    }
        public void setName(String name)
    {
           this.name = name  ;
    }
      
}
public class Encapsulation
{
       public static void main(String[] args)
    {  
            Car car = new Car();
            car.setName("Honda");
            System.out.println(car.getName());
          
    }
      
}
