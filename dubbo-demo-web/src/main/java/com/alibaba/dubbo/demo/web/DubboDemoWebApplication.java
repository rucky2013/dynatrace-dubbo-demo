package com.alibaba.dubbo.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:spring/spring-dubbo.xml" })
public class DubboDemoWebApplication {

	// private static final Logger logger =
	// LoggerFactory.getLogger(DubboDemoWebApplication.class);

	// @Bean
	// public CountDownLatch closeLatch() {
	// return new CountDownLatch(1);
	// }

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(DubboDemoWebApplication.class);

		// CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
//		new CountDownLatch(1).await();
	}
}
