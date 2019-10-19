package com.bee.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.UserClientService;

/**
 * 
 * Spring的依赖注入：类类型、数组、集合等注入方法
 * 下一个问题：spring 配置文件能消失吗？使用注解
 * @author hhluci
 *
 */

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		UserClientService userClientService = ac.getBean("userClientService") instanceof UserClientService? 
				(UserClientService)ac.getBean("userClientService"):null;

		userClientService.saveCustom();
		
		
		UserClientService userClientServiceu1 = ac.getBean("userClientServiceU1") instanceof UserClientService? 
				(UserClientService)ac.getBean("userClientServiceU1"):null;
				userClientServiceu1.saveCustom();
	}

}
