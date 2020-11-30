package com.jannet.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringDemoApplication {
	public static void main(String[] args) {
		 ConfigurableApplicationContext app =SpringApplication.run(TryStsApplication.class, args);
		 Happiness obj =app.getBean(Happiness.class);
		 obj.code();
	}


}
