import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.institute.midServer.MidServerService;

public class TutorConsumerActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceReference midServiceRef;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		TutorConsumerActivator.context = bundleContext;
		
		Scanner scan = new Scanner(System.in);
		
		midServiceRef = bundleContext.getServiceReference(MidServerService.class.getName());
		MidServerService mid = (MidServerService) bundleContext.getService(midServiceRef);
		
		if(!mid.tutorLogin()) this.stop(bundleContext);
		
		while(true) {
			
	        System.out.println("1. Add tutorials");
	        System.out.println("2. Add educational resources");
	        System.out.println("3. Add quiz");
	        System.out.println("4. Exit\n Select an option(1-4):");
	        
	        int selection = scan.nextInt();
	        
	        if(selection == 4) break;
			
	        switch(selection) {
	        case 1:
	        	mid.addTutorials();
	        	break;
	        case 2:
	        	mid.addEducationResources();
	        	break;
	        case 3:
	        	mid.addQuiz();
	        	break;
	        default:
	        	System.out.println("Invalid input.please try again.");
	        }
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		TutorConsumerActivator.context = null;
	
		bundleContext.ungetService(midServiceRef);
	}

}
