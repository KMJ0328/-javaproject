package com.jin.WebPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/*
 * Ŭ������ �������̽��� ��ӹޱ� ���ؼ��� implements�� �̿��Ѵ�.
 * ����� �ް� �Ǹ� �������̽��� ���ǵǾ� �ִ� �޼ҵ�(�Լ�)�� Ŭ�������� �����ؾ� �Ѵ�.
 */
@Service
public class TestService implements ITestService{
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	/* 
	 * ��ӹ޾Ƽ� �����Ǿ��ٴ� �ǹ̷� @Override�� ����Ѵ�. 
	 */ 
	@Override
	public void TestMethod() {
		logger.info("TestMethod ����");
	}
}
