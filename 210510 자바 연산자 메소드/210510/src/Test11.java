import java.util.*;
// �ִ밪/�ּڰ� ���ϴ� ���α׷�
// >> ��� ȭ��  <<
// ���� 1: 10
// ���� 2: 20
// ���� 3: 30
//
// �ִ밪: 30
// �ּڰ�: 10


public class Test11 {
	public static void main(String[] args) {
		int n1, n2,n3,max,min;
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է�: ");
		n1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		n2 = sc.nextInt();
		System.out.print("����3 �Է�: ");
		n3 = sc.nextInt();
		
		/////////////// if������ �����ϴ� �κ�
		if(n1 >=n2 && n1>=n3){
			max = n1;
			
		}else if(n2>=n1 && n2>=n3){
			max = n2;
		}else{
			max = n3;
		if(n1 <=n2 && n1<=n3){
			min = n1;
		}else if (n2 <=n1 && n2<=n3){
			min = n2;
		}else {
			min = n3;
		}
			System.out.println();
			System.out.println("�ִ밪: " + max);
			System.out.println("�ּڰ�: " + min);
		}
	}
}
	
