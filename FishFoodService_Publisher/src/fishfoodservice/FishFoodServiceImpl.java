package fishfoodservice;

import java.util.Scanner;

public class FishFoodServiceImpl implements FishFoodService {
	
	Scanner sc = new Scanner(System.in);
	
	float tprice;
	float fprice;
	float price;
	int quantity;
	
	
	public void FishFoodService() {
		
		String decision = "Y";
		
		FishFoodServiceImpl Object = new FishFoodServiceImpl();
		
		while (decision.equalsIgnoreCase("Y")) {
			Object.availableFishFood();
			Object.selectFishFood();
			Object.quantity();
			Object.totalPrice();
			
			System.out.print("Do you want to add another category of fish food? (Y/N): ");
			decision = sc.next();
			
		}

	}

	public void availableFishFood() {
		
		String FishFoods[] = {"Apex Fish Feed 1kg Pack - Rs.1000", "Alltech Coppens 1kg Pack - Rs.2000", "Apex Fish Feed 1kg Pack - Rs.3000", "Okiko Black Pearl Fish Feed 1kg Pack - Rs.4000", "Skretting Til 180 Fish Food 1kg Pack - Rs.5000"};
		
		System.out.println("\n\n===============================");
		
		System.out.println("Available Fish Food Categories :-\n");
		
		for(int i = 0; i < FishFoods.length; i++) {
			System.out.println("[" + (i + 1) + "]" + FishFoods[i]);
		}	
		
		System.out.println("===============================");
		System.out.println("\n");
		
	}

	public void selectFishFood() {
		int FishFoodSelection;
		
		
		
		System.out.print("Select a Fish Food Category : ");
		FishFoodSelection = sc.nextInt();
		
		switch(FishFoodSelection) {
			case 1:
				fprice = 1000;
				
				System.out.println("\n\n==============================================");
				System.out.println("Successfully Selected 'Apex Fish Feed 1kg Pack'.");
				System.out.println("==============================================");
				
				break;
				
			case 2:
				fprice = 2000;
				
				System.out.println("\n\n==============================================");
				System.out.println("Successfully Selected 'Alltech Coppens 1kg Pack'.");
				System.out.println("==============================================");
				
				break;
				
			case 3:
				fprice = 3000;
				
				System.out.println("\n\n==============================================");
				System.out.println("Successfully Selected 'Apex Fish Feed 1kg Pack'.");
				System.out.println("==============================================");
				
				break;
				
			case 4:
				fprice = 4000;
				
				System.out.println("\n\n===========================================================");
				System.out.println("Successfully Selected 'Okiko Black Pearl Fish Feed 1kg Pack'.");
				System.out.println("===========================================================");
				
				break;
				
			case 5:
				fprice = 5000;
				
				System.out.println("\n\n===========================================================");
				System.out.println("Successfully Selected 'Skretting Til 180 Fish Food 1kg Pack'.");
				System.out.println("===========================================================");
				
				break;
		}
		
		System.out.println("\n");
	}
	
	public void quantity() {
		System.out.println("================================================");
		System.out.print("Enter Quantity of Selected Fish Food Category : ");
		quantity = sc.nextInt();
		System.out.println("================================================\n\n");
	}
	
	public void totalPrice() {
		float price = (fprice * quantity);
		float totalPrice = price + tprice;
		
		System.out.println("=====================================");
		System.out.print("Total Price for Fish Foods: Rs." + totalPrice + "0");
		System.out.println("\n=====================================\n\n");
		
		tprice = totalPrice;
	}

}
