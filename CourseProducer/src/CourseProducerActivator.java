import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.institute.courseProducer.CourseService;
import com.institute.courseProducer.CourseServiceImpl;

public class CourseProducerActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration serviceReg;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		CourseProducerActivator.context = bundleContext;
		
		CourseService course = new CourseServiceImpl();
		serviceReg = bundleContext.registerService(CourseService.class.getName(), course, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		CourseProducerActivator.context = null;
		serviceReg.unregister();
	}

}
