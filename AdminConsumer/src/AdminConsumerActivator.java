import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.institute.midServer.MidServerService;

public class AdminConsumerActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceReference midServiceRef;

	//static BundleContext getContext() {
		//return context;
	//}

	public void start(BundleContext bundleContext) throws Exception {
		//AdminConsumerActivator.context = bundleContext;
		
		Scanner scan = new Scanner(System.in);
		
		midServiceRef = bundleContext.getServiceReference(MidServerService.class.getName());
		MidServerService mid = (MidServerService) bundleContext.getService(midServiceRef);
		
		while(true) {
			
			System.out.println("1. Add new tutors");
	        System.out.println("2. Add new educational resources");
	        System.out.println("3. Add new course");
	        System.out.println("4. Exit\n Select an option(1-3):");
	        
	        int selection = scan.nextInt();
	        
	        if(selection == 4) break;
			
	        switch(selection) {
	        case 1:
	        	mid.addTutor();
	        	break;
	        case 2:
	        	mid.addEducationResources();
	        	break;
	        case 3:
	        	mid.addcourse();
	        	break;

	        default:
	        	System.out.println("Invalid input.please try again.");
	        }
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//AdminConsumerActivator.context = null;
		bundleContext.ungetService(midServiceRef);
	}

}
