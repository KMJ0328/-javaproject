import java.util.*;

//����� ���α׷� 
//1~15�� ���̸� ����� 1000��
//16~30�� 2000��
//31~40�� 3000��
//41�� ~  10000��

//>> ���ȭ�� <<
//���� �Է�: 25
//25���� ����� 2000�� �Դϴ�.

public class Test9 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		age = sc.nextInt();
		
		if(age>=1) { // ���̰� 1�� �̻��̸� ��
			if(age<=15) { // 1~15��
				System.out.println(age +"���� ����� 1000���Դϴ�.");
			}else if(age <= 30) { // 16~30�� 				
				System.out.println(age +"���� ����� 2000���Դϴ�.");
			}else if(age <= 40){ // 31~40��
				System.out.println(age +"���� ����� 3000���Դϴ�.");
			}else { // 41��~
				System.out.println(age +"���� ����� 10000���Դϴ�.");
			}
		}else { // ���̰� 0�� �����̸� ����
			System.out.println("1�� �̻� �Է� �����մϴ�.");
		}
	}
}
