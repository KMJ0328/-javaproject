package com.jin.AWS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
/*
1. ��Ű�� ����� - com.jin.AWS
2. IAWSService �����
3. AWSServiceImpl
  - S3 ������ ��� ���� �Լ� ����
4. HomeController�� �����Ͽ� com.jin.AWS ��Ű���� �ٿ��ֱ�
5. HomeController�� AWSController�� ���� �� ���� �ڵ� ����
6. src->main->webapp->WEB-INF->spring->appServlet�� �ִ� servlet-context.xml ����
7. home.jsp ����
 */
@Controller
public class AWSController {
	private static final Logger logger = LoggerFactory.getLogger(AWSController.class);
	
	@Autowired
	private IAWSService iAWSServ;
	
	@RequestMapping(value = "/getS3")
	public String getS3(Model model) {
		String regionName = iAWSServ.getRegionName();
		model.addAttribute("regionName", regionName);
		return "home";
	}
}



