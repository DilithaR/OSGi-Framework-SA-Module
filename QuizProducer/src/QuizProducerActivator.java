import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.instiute.quizProducer.QuizService;
import com.instiute.quizProducer.QuizServiceImpl;

public class QuizProducerActivator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration serviceReg;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		QuizProducerActivator.context = bundleContext;
		
		QuizService quiz = new QuizServiceImpl();
		serviceReg = bundleContext.registerService(QuizService.class.getName(), quiz, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		QuizProducerActivator.context = null;
		serviceReg.unregister();
	}

}
