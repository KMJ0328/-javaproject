//  ���Ǳ� ���α׷�
// >> ���ȭ�� <<
//=====�޴�=====
//1.�Ƹ޸�ī��
//2.ī���
//3.īǪġ��
//4.����
//========
//�޴�:1
//�Ƹ޸�ī�븦 �����ϼ̽��ϴ�.
import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====�޴�=====");
		System.out.println("1.�Ƹ޸�ī��");
		System.out.println("2.ī���");
		System.out.println("3.īǪġ��");
		System.out.println("4.����");
		System.out.println("========");
		System.out.println("�޴� �Է�: ");
		n = sc.nextInt();
		if(n == 1){
			System.out.println("�Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
		} else if(n == 2) {
			System.out.println("ī��󶼸� �����ϼ̽��ϴ�.");
		} else if(n == 3) {
			System.out.println("īǪġ�븦 �����ϼ̽��ϴ�.");
		} else if(n == 4){
			System.out.println("�����մϴ�.");
		} else { // else������ ���ǽ� ���� !!
			System.out.println("1~4���� �Է� �����մϴ�.");
		}
	}
}
