import java.util.*; // Scanner Ŭ���� ����ϱ� ���� import


public class Test4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		n = sc.nextInt();
		
		if(n < 0) { // n�� 0���� ũ�� �� n�� 0���� ������ ����  
			System.out.println(n + "��(��) ���� �Դϴ�.");
		} else if(n > 0){
			System.out.println(n + "��(��) ��� �Դϴ�.");
			
		}else { //�̵����� �ƴ� �� 
			System.out.println(n + "��(��) 0 �Դϴ�.");
		}
	}

}
