package com.alibaba.dubbo.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.demo.DemoService;

@RestController
public class WebController {

	private DemoService demoService;
	
	@Autowired
	public WebController(DemoService demoService){
		this.demoService = demoService;
	}
    @RequestMapping("/")
    public String home() {
    	return this.demoService.sayHello("home");
    }
    
    @RequestMapping("/{name}")
    public String name(@PathVariable("name") String name) {
    	return this.demoService.sayHello(name);
    }
}
