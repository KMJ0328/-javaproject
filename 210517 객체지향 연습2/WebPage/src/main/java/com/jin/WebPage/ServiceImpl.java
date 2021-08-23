package com.jin.WebPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService{
	private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);
	
	@Override
	public void HelloWorld() {
		logger.info("Hello World!!!");
	}

	@Override
	public String ReturnMethod() {
		// TODO Auto-generated method stub
//		��ȯ�� ���� return���� ����
		return "hello world";
	}
}
