import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.institute.tutorProducer.TutorService;
import com.institute.tutorProducer.TutorServiceImpl;

public class TutorProducerActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration serviceReg;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		TutorProducerActivator.context = bundleContext;
		
		TutorService tutor = new TutorServiceImpl();
		serviceReg = bundleContext.registerService(TutorService.class.getName(), tutor, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		TutorProducerActivator.context = null;
		serviceReg.unregister();
	}

}
