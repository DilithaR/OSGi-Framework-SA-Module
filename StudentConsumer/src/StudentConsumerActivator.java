import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.institute.midServer.MidServerService;

public class StudentConsumerActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceReference midServiceRef;

	//static BundleContext getContext() {
		//return context;
	//}

	public void start(BundleContext bundleContext) throws Exception {
		//StudentConsumerActivator.context = bundleContext;
		
		Scanner scan = new Scanner(System.in);
		
		midServiceRef = bundleContext.getServiceReference(MidServerService.class.getName());
		MidServerService mid = (MidServerService) bundleContext.getService(midServiceRef);
		
		while(true) {
			
			System.out.println("1. Search for tutors");
	        System.out.println("2. Search for tutorials");
	        System.out.println("3. Search for education resources");
	        System.out.println("4. Take parctice quiz");
	        System.out.println("5. View all courses");
	        System.out.println("6. Search courses");
	        System.out.println("7. Exit\n Select an option(1-4):");
	        
	        int selection = scan.nextInt();
	        
	        if(selection == 7) break;
			
	        switch(selection) {
	        case 1:
	        	mid.seeTutors();
	        	break;
	        case 2:
	        	mid.DisplayTutorials();
	        	break;
	        case 3:
	        	mid.displayPriceList();
	        	break;
	        case 4:
	        	mid.takeQuiz();
	        	break;
	        case 5:
	        	mid.viewAllCourses();;
	        	break;
	        case 6:
	        	mid.searchCourse();;
	        	break;
	        default:
	        	System.out.println("Invalid input.please try again.");
	        }
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//StudentConsumerActivator.context = null;
		bundleContext.ungetService(midServiceRef);
	}

}
