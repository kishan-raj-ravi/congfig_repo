package spring_intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] agrs) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Billcollector bc = context.getBean("billcollector", Billcollector.class);
		bc.collectpayment(1200);

	}

}
