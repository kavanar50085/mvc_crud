package helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyWebxmlConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] a= {MyConfiguration.class};
		return a;
	}

	@Override
	protected String[] getServletMappings() {
		String[] a= {"/"};
		return a;
	}

}
