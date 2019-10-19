package com.bee.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.UserClientService;

/**
 * 
 * Spring������ע�룺�����͡����顢���ϵ�ע�뷽��
 * ��һ�����⣺spring �����ļ�����ʧ��ʹ��ע��
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
