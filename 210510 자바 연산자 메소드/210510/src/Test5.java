import java.util.*; // Scanner Ŭ���� ����ϱ� ���� import

// Ȧ/¦ ���� ���α׷�
// >> ��� ȭ�� <<
// �Է��Ͻ� 15�� Ȧ�� �Դϴ�.

public class Test5 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
		if(n % 2 == 0 ){
			System.out.println("�Է��Ͻ� " + n +"��(��) ¦�� �Դϴ�.");
			
		}else {
			System.out.println("�Է��Ͻ� " + n +"��(��) Ȧ�� �Դϴ�.");
		}
	}

}
