package com.jin.AWS;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Service
public class AWSServiceImpl implements IAWSService{
	@Value("${aws.accessKey}")
	private String accessKey;
	@Value("${aws.secretkey}")
	private String secretkey;
	
	@Override
	public String getRegionName() {
		AmazonS3 s3 = getS3();
		return s3.getRegionName();
	}
//	�� �޼ҵ�� credential���� ������ ������ s3�� ������ �ڵ�� ���� �ڵ�� ������ �ʴ´�.
	private AmazonS3 getS3() {
//		credential�� provider�� �׻� �������� ���Ǹ� provider�� ���� AWS�� ���񽺸� ȣ���Ͽ� ����� �� �ִ�.
//		����
		AWSCredentials credential = new BasicAWSCredentials(accessKey, secretkey);
//		provider
		AWSStaticCredentialsProvider provider = new AWSStaticCredentialsProvider(credential);
//		S3 ���� ��ȯ, Regions.AP_NORTHEAST_2�� ���� ������ �ǹ���
//		withCredentials(provider)�� ���� ������ ���� �����. �̷� ���� �� ������ S3 ���񽺸� �̿��� �� ����.
		return AmazonS3ClientBuilder.
				standard().
				withRegion(Regions.AP_NORTHEAST_2).
				withCredentials(provider).build();
	}

}
