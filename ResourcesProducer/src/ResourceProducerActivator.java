import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.institute.resourcesProducer.ResourcesService;
import com.institute.resourcesProducer.ResourcesServiceImpl;

public class ResourceProducerActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration serviceReg;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ResourceProducerActivator.context = bundleContext;
		
		ResourcesService resource = new ResourcesServiceImpl();
		serviceReg = bundleContext.registerService(ResourcesService.class.getName(), resource, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ResourceProducerActivator.context = null;
		serviceReg.unregister();
	}

}
