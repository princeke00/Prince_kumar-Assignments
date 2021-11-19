package tenth;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
public class Build {

	
		private ApplicationContext context;
		
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
		{
			context = applicationContext;
		}
		
		public void Slow()
		{
			Application a =  (Application) context.getBean("app");
			
			a.go();
		}

	}

