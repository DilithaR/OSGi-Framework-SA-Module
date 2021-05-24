import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.institute.midServer.MidServerService;
import com.institute.midServer.MidServerServiceImpl;

public class InstituteMidserverActivator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration serviceReg;

	//static BundleContext getContext() {
		//return context;
	//}

	public void start(BundleContext bundleContext) throws Exception {
		//InstituteMidserverActivator.context = bundleContext;
		MidServerService mid = MidServerServiceImpl.getMidServer();
		serviceReg = bundleContext.registerService(MidServerService.class.getName(), mid, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		//InstituteMidserverActivator.context = null;
		serviceReg.unregister();
	}

}
