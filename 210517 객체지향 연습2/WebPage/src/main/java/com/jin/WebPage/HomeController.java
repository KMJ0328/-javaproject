package com.jin.WebPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*
	 * controller���� Service�� ȣ���� ��� interface�� �����Ѵ�.
	 * private�� ���������� ����Ѵ�.
	 * ITestService�� Interface�� �ڷ����� �ۼ��� ���̴�.
	 * iTestServ�� �������̴�.
	 * @Autowired ���� �������� ����Ѵ�.
	 */
	@Autowired
	private ITestService iTestServ;
	
	/* 
	 * @�� annotation�̶�� �Ͽ� ���������� ó���Ǵ� �޼ҵ�(�Լ�)�̴�.
	 * aws.properties�� �ִ� ������ @Value�� ���� ���´�.
	 * @Value ���ο� �ִ� �̸���  aws.properties�� �̸��� ���ƾ� �Ѵ�.
	 * �̷��� ���� ������ �Ʒ��� �ִ� private String accessKey;�� �����Ѵ�.
	 */
	@Value("${aws.accessKey}")
	private String accessKey;
	@Value("${aws.secretkey}")
	private String secretkey;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * localhost:8080/WebPage�� Ȩ�̴�.
	 * ���� �ּҷ� ������ ������ �õ��ϸ� WebPage������ /�� �ִ°����� �νĵǾ�
	 * localhost:8080/WebPage/�� �����ϰ� �Ǹ� 
	 * value="/"���� �̸� �޾� ���� ������ ó���ϰ� �ȴ�.
	 * ��, ó�� Ȩ������(ù ������)�� �����ϰ� �Ǹ� �Ʒ��� �޼ҵ�(�Լ�)�� �̵��ϰ� �ȴ�. 
	 */
	@RequestMapping(value = "/")
	public String home() {
		logger.info("Ȩ������ ����");
		/* �޼ҵ� ���� ���� �Ʒ��� �̸��� �Ȱ��� jsp �������� ȣ���ϰ� �� */
		return "home";
	}

	/* 
	 * jsp �������� �ִ� '1. ����Ű ������(Ŭ��)'�� ������ 
	 * localhost:8080/WebPage/authKey�� �����ϰ� �ȴ�.
	 * �⺻ Ȩ�� localhost:8080/WebPage�� �����ϸ� /authKey�� �����ϰ� �Ǵ� ���̴�.
	 * controller���� /authKey�� �޴� @RequestMapping�� �־�� �ϸ� ��ҹ��ڸ� �����Ѵ�.
	 * value�� ���� �޼ҵ�(�Լ�) �̸��� ���� ����� ���� ���ϴ�.(�ߺ� ����)
	 */
	@RequestMapping(value = "/authKey")
//	Model�� Interface��(���� ��) ���� ������ �� ����ϸ� model�̶�� ������ ����
	public String authKey(Model model) {
		logger.info(accessKey + " : "+secretkey);
		iTestServ.TestMethod();
//		���� jsp�� ������ ��� model.addAttribute�� �̿��Ͽ� 
//		ù ���ڴ� ������ key�̰� �� ��° ���� value�̴�.
		model.addAttribute("authKey", accessKey + " : "+secretkey);
		return "home";
	}
	@Autowired
	private IService iServ;
	
	@RequestMapping(value = "/quiz")
	public String quiz(Model model) {
		iServ.HelloWorld();
//		ReturnMethod���� ��ȯ�� ���� ret�� ����
		String ret = iServ.ReturnMethod();
//		����� ���� quiz��� key�� home.jsp�� ����
		model.addAttribute("quiz", ret);
		return "home";
	}
}



