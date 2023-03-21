package fishfoodservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration<?> FishFoodServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("FishFoodService Started.");
		FishFoodService FishFoods = new FishFoodServiceImpl();
		FishFoodServiceRegistration = context.registerService(FishFoodService.class.getName(), FishFoods, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("FishFoodService Stoped.");
		FishFoodServiceRegistration.unregister();
	}

}
