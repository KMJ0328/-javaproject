package com.jin.WebPage;

/*
 * spring���� controller�� �������� �б⸦ �ð� �ȴ�.
 * ��ɿ� ���� ������ Service���� ������ ó���� Model(controller�� model�� �ٸ�)���� ó���Ѵ�.
 * ��� ������ interface + class �������� ����ϴ�.
 * interface�� �޼ҵ��� ������ �ۼ��ϰ� class�� interface�� ��� �޾� ������ �����Ѵ�.
 */
//interface�� �޼ҵ��� ������ �����Ѵ�.
public interface ITestService {
//	�޼ҵ��� ���Ǵ� ������ ���� �������� �ۼ��Ѵ�.
//	public [��ȯ�ڷ���] �޼ҵ��([�Ķ����])
//	void�� ��ȯ�ڷ����� ���� ��� ����Ѵ�.
	public void TestMethod();
}
