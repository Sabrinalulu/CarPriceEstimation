
public class Car {
   public String model;
   public String id;
   public int price;
   public static final double RT=1;
   public Car(String model, String id, int price) {
	   //complete the constructor using this
	   this.model=model;
	   this.id=id;
	   this.price=price;
   }
  
   //declare and define the required method for price calculation
   public double estimation() {
	   double rate=0;
	   return price*(rate/100);
   }
}   
   //write down the complete code for the 'JapCar' class
class JapCar extends Car{
	   public JapCar(String model, String id, int price) {
		   super(model,id,price);
	   }
	   public double estimation() {
		   return super.estimation();
	   }
   }
  //write down the complete code for the 'EuroCar' class, including an overridden method
class EuroCar extends Car{
	private double ER = 80;
	   public EuroCar(String model, String id, int price) {
		   super(model,id,price);
	   }
	   @Override
	   public double estimation() {
		   double rate = ER;
		   return price*(rate/100);
	   }
}

class USACar extends Car{
	public USACar(String model, String id, int price) {
		   super(model,id,price);
		   }
}

