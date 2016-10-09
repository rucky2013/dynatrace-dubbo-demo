package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.DemoService;

public class DemoServiceDelegate implements DemoService {

	private DemoService demoService;
	
	public DemoServiceDelegate(DemoService demoService) {
		this.demoService = demoService;
	}

	public String sayHello(String name) {
		return demoService.sayHello(name);
	}
}
