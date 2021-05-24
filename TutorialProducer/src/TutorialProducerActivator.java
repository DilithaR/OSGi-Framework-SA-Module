import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.institute.tutorialProducer.TutorialService;
import com.institute.tutorialProducer.TutorialServiceImpl;

public class TutorialProducerActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration TutorialReg;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		TutorialProducerActivator.context = bundleContext;
		
		TutorialService TuteServer = new TutorialServiceImpl();
		TutorialReg = bundleContext.registerService(TutorialService.class.getName(), TuteServer,null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		TutorialProducerActivator.context = null;
		TutorialReg.unregister();
	
	}

}
