// ������ � ���α׷�
// �� 1~10 ������ �������!

import java.util.*;

public class Test12 {
	public static void main(String[] args) {
		int i, r;
		
		r = (int)(Math.random()*10)+1; //1 ~ 10 ������ �������� r�� ����
		
		
		System.out.println(">> ������ � �Դϴ�. <<");
		
		for(i=1; i<=r; i++){// �ݺ����� i�� �ʱⰪ�� 1�̸� i��  i<=r �̱⋚���� r�� �������� 10�� ���Դٰ� �����Ͽ� i��  i++�������� 10�̵ɶ����� �ݺ��ϴ°�  
			System.out.print("��");
		}
	}

}
