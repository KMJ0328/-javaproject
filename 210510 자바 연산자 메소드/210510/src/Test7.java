import java.util.*;
// ����ڿ��� ���� 1���� �Է¹޾� 3�ǹ������ �ƴ��� ���ϴ� ���α׷�
//>> ����ϸ� <<
// ���� �Է�: 12
// 12�� 3�� ��� �Դϴ�.

// >> ����ϸ�2 <<
// ���� �Է�: 11
// 11�� 3�� ����� �ƴմϴ�.
public class Test7 {

	public static void main(String[] args) {
		int n = 12;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		if(n % 3 == 0){
			System.out.println(n + "�� 3�� ��� �Դϴ�.");
			}else {
				System.out.println(n + "�� 3�� ����� �ƴմϴ�.");
			}
	}

	
}
