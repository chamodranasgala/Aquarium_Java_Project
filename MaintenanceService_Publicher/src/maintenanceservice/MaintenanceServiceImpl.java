package maintenanceservice;

import java.util.Scanner;

public class MaintenanceServiceImpl implements MaintenanceService {

	Scanner sc = new Scanner(System.in);

	float cost;
	float tcost;

	public void MaintenanceService() {

		String decision = "Y";

		MaintenanceServiceImpl Object = new MaintenanceServiceImpl();

		while (decision.equalsIgnoreCase("Y")) {

			Object.availableMaintenance();
			Object.selectMaintenance();
			Object.totalCost();

			System.out.print("Do you want to add another maintenance service? (Y/N) ");
			decision = sc.next();

		}
		
	}

	public void availableMaintenance() {

		String Maintenance[] = { "Water Change - Rs.4500", "Fish Tank Repair - Rs.5000", "Water Testing - Rs.3500", "Plants Cleaned and Maintained - Rs.2500",
				"Fish Health Check - Rs.4000" };

		System.out.println("\n\n========================================");

		System.out.println("Available Maintenance Service Categories: \n");

		for (int i = 0; i < Maintenance.length; i++) {
			System.out.println("[" + (i + 1) + "]" + Maintenance[i]);
		}

		System.out.println("========================================\n\n");

	}

	public void selectMaintenance() {

		int MaintenanceSelection;

		System.out.print("Select a Maintenance Service Category: ");
		MaintenanceSelection = sc.nextInt();

		switch (MaintenanceSelection) {
		case 1:
			cost = 4500;
			tcost = tcost + cost;
			
			System.out.println("\n\n===========================================");
			System.out.println("Successfully Selected 'Water Change Service'.");
			System.out.println("===========================================");
			break;
			
		case 2:
			cost = 5000;
			tcost = tcost + cost;
			
			System.out.println("\n\n===============================================");
			System.out.println("Successfully Selected 'Fish Tank Repair Service'.");
			System.out.println("===============================================");
			break;
			
		case 3:
			cost = 3500;
			tcost = tcost + cost;
			
			System.out.println("\n\n===========================================");
			System.out.println("Successfully Selected 'Water Testing Service'.");
			System.out.println("===========================================");
			break;
			
		case 4:
			cost = 2500;
			tcost = tcost + cost;
			
			System.out.println("\n\n==============================================================");
			System.out.println("Successfully Selected 'Plants Cleaning and Maintaining Service'.");
			System.out.println("==============================================================");
			break;
			
		case 5:
			cost = 4000;
			tcost = tcost + cost;
			
			System.out.println("\n\n================================================");
			System.out.println("Successfully Selected 'Fish Health Check Service'.");
			System.out.println("================================================");
			break;
		}
		
		System.out.println("\n");

	}

	public void totalCost() {
		float totalCost = tcost;
		System.out.println("==============================================");
		System.out.print("Total cost for Maintenance Services: Rs." + totalCost + "0");
		System.out.println("\n==============================================\n\n");
	}

}
