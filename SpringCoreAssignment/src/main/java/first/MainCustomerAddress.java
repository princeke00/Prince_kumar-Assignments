package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomerAddress {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("Config.xml");
		Costomer cost = (Costomer) c.getBean("costomer");
		System.out.println(cost);
	}

}
