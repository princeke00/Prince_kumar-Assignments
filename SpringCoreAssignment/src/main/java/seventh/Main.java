package seventh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

		public static void main(String[] args) 
		{
			@SuppressWarnings("resource")
			ApplicationContext context = new  ClassPathXmlApplicationContext("spel.xml");
	        Spel value = context.getBean("spel",Spel.class);
	        
	        System.out.println(value);
		}

	}

