package comm;
 class Vehicle 
{
	  protected String brand = "KIA";
	  public void honk()
	  {
	    System.out.println("Gurr, Gurr!");
	  }
	}
class Cars extends Vehicle 
	{
	  private String modelName = "Innova";
	  public static void main(String[] args) 
	  {
	    Cars myFastCar = new Cars();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
	}






