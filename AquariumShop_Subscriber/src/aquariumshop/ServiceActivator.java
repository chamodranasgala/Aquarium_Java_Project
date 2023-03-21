package aquariumshop;

import java.util.ArrayList;
import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import fishfoodservice.FishFoodService;
import maintenanceservice.MaintenanceService;

public class ServiceActivator implements BundleActivator {
	
	ServiceReference<?> serviceReference;
	Scanner sc = new Scanner(System.in);
	
	public int serviceSelection() {
		
		ArrayList<String> availableServices = new ArrayList<String>();
		availableServices.add("FishFoodService");
		availableServices.add("MaintenanceService");
		
		int selection = -1;
		
		while(selection < 0 || selection > 2) {
			
			System.out.println("\nAvailable Services");
			System.out.println("------------------");
			
			for (String service : availableServices) {
				System.out.println("[" + (availableServices.indexOf(service)+1) + "] " + service);
			}
			
			System.out.print("\nSelect the service you want to check the price : ");
			selection = sc.nextInt() - 1;			
		}
		
		return selection;
	}

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Subscriber (AquariumShop).");
		
		String decision = "n";
		
		while(decision.equalsIgnoreCase("n")) {
			
			int selectService = serviceSelection();
			
			switch(selectService) {
				case 0:
					serviceReference = context.getServiceReference(FishFoodService.class.getName());
					FishFoodService fishFood = (FishFoodService)context.getService(serviceReference);
					fishFood.FishFoodService();
					break;
					
				case 1:
					serviceReference = context.getServiceReference(MaintenanceService.class.getName());
					MaintenanceService maintenance = (MaintenanceService) context.getService(serviceReference);
					maintenance.MaintenanceService();
					break;
			}
			
			System.out.print("Do you want to exit? (Y/N) ");
			decision = sc.next();
		}
		
	}
	
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop subscriber (AquariumShop).");
		context.ungetService(serviceReference);

	}
	
}
