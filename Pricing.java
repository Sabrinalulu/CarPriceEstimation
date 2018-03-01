import java.util.Scanner;

public class Pricing {

	public static void main(String[] args) {
		int price=0;
        double estimate=0.0; 
        String model="", id="";
        
        Scanner type = new Scanner(System.in);
        System.out.println("要賣什麼車？(輸入EuroCar,JapCar,USACar)");
        String userInput = type.nextLine();
        
        
        //Scanner type1 = new Scanner(System.in);
        System.out.println("輸入車子型號：");
        model = type.nextLine();
        
        
        //Scanner type2 = new Scanner(System.in);
        System.out.println("輸入車牌號碼");
        id = type.nextLine();
        
        
        //Scanner type3 = new Scanner(System.in);
        System.out.println("原車價格多少？");
        price = Integer.parseInt(type.nextLine());
        
        
        if(userInput.equals("EuroCar")) {
        	EuroCar e = new EuroCar(model,id,price);
        	estimate=e.estimation();
        }
        else if(userInput.equals("JapCar")) {
        	JapCar j = new JapCar(model,id,price);
        	estimate=j.estimation();
        }else {
        	USACar u = new USACar(model,id,price);
        	estimate=u.estimation();
        }
        
        System.out.println("Hello,你的車子資料如下\n 型號： "+model+"\n 原價： "+price+"\n 牌照： "+id+"\n 估價為： "+estimate);
        System.exit(0);
        
	}

}
