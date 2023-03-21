package maintenanceservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration<?> MaintenanceServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Maintenance Service Started.");
		MaintenanceService maintenance = new MaintenanceServiceImpl();
		MaintenanceServiceRegistration = context.registerService(MaintenanceService.class.getName(), maintenance, null);
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("MaintenanceService Stoped.");
		MaintenanceServiceRegistration.unregister();
	}

}
