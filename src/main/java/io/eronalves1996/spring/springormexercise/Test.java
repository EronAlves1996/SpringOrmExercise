package io.eronalves1996.spring.springormexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("io/eronalves1996/spring/springormexercise/config.xml");
		PassengerDAO bean = (PassengerDAO) ctx.getBean("dao");
		bean.create(new Passenger(2, "Eron", "Alves"));
		System.out.println(bean.readOne(1));
		System.out.println(bean.readAll());
		bean.update(new Passenger(1, "Raquel", "Cunha"));
		System.out.println(bean.readAll());
		bean.delete(new Passenger(2, "Eron", "Alves"));
		System.out.println(bean.readAll());
		
	}

}
