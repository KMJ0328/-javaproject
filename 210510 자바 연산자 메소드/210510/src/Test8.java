import java.util.*;
// ����� ���α׷� 
// 1~15�� ���̸� ����� 1000��
// 16~30�� 2000��
// 31~40�� 3000��
// 41�� ~  10000��

// >> ���ȭ�� <<
// ���� �Է�: 25
// 25���� ����� 2000�� �Դϴ�.

public class Test8 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		age = sc.nextInt();
		
		if(age>0 && age<16){
			System.out.println(age +"���� ����� 1000���Դϴ�.");
		}else if(age>15 && age<31){
			System.out.println(age +"���� ����� 2000���Դϴ�.");
		}else if(age>30 && age<41){
			System.out.println(age +"���� ����� 3000���Դϴ�.");
		}else if(age>40){
			System.out.println(age +"���� ����� 10000���Դϴ�.");
		}else {
			System.out.println("1�� �̻� �Է� �����մϴ�.");
		}
	}

}
