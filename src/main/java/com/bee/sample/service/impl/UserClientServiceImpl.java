package com.bee.sample.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;

public class UserClientServiceImpl implements UserClientService {

	
	public UserClientServiceImpl() {
		System.out.println("正在调用构造方法:"+this.getClass().getName());
	}
	public UserClientServiceImpl(String arg0) {
		this.arg0 = arg0;
	}
	@Override
	public void saveCustom() {
		

		System.out.println("正在调用:"+this.getClass().getName());
		/*
		 * UserClientDao userClientDao = new UserClientDaoImpl();
		 * userClientDao.saveCustom();
		 */
		System.out.println("String[]:"+Arrays.toString(strArray));
		System.out.println("List:"+dataLst);
		System.out.println("Set:"+dataSet);
		System.out.println("Map:"+dataMap);
		System.out.println("Prop:"+dataProp);
		
		System.out.println("arg0:"+arg0);
		userClientDao.saveCustom();
	}
	
	public List getDataLst() {
		return dataLst;
	}

	public void setDataLst(List dataLst) {
		this.dataLst = dataLst;
	}

	public Set getDataSet() {
		return dataSet;
	}

	public void setDataSet(Set dataSet) {
		this.dataSet = dataSet;
	}

	public Map getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map dataMap) {
		this.dataMap = dataMap;
	}

	public Properties getDataProp() {
		return dataProp;
	}

	public void setDataProp(Properties dataProp) {
		this.dataProp = dataProp;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}

	public UserClientDao getUserClientDao() {
		return userClientDao;
	}

	public void setUserClientDao(UserClientDao userClientDao) {
		this.userClientDao = userClientDao;
	}

	
	private List dataLst;
	private Set  dataSet;
	private Map dataMap;
	private Properties dataProp;

	private String[] strArray;
	
	private UserClientDao userClientDao;
	
	private String arg0;
}
