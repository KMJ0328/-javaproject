// �ֻ��� (1~6) 2�� ������ ���� ������ �� ���ߴ� ���α׷�
// >> ��� ȭ�� <<
// (6,3)�� ���� 9�Դϴ�.

// >> ��� ȭ�� #2-1 <<
// �ֻ��� 2���� ��(2~12) �Է�:10
// (6,3)�� ���� 9�Դϴ�.
// Ʋ�Ƚ��ϴ�.

// >> ��� ȭ�� #2-2<<
// �ֻ��� 2���� ��(2~12) �Է�:9
// (6,3)�� ���� 9�Դϴ�.
// �����Դϴ�.
import java.util.*;
public class Test4 {
	public static void main(String[] args) {
		int r1,r2, total, n;
		Scanner sc = new Scanner(System.in);
		
		r1 = (int)(Math.random()*6)+1; // 1~6 ������ �߻�
		r2 = (int)(Math.random()*6)+1;
		total = r1 + r2;
		
		System.out.print("�ֻ��� 2���� ��(2~12)"+ "�Է� : ");
		n = sc.nextInt();
		
		if(total == n){
			System.out.println("(" + r1 + " , " + r2 +") �� ���� "+ total + "�Դϴ�.");
			
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("(" + r1 + " , " + r2 +") �� ���� "+ total + "�Դϴ�.");
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		// ��ĳ�ʴ� ��� ����ϴ��� �����
		// r1 r2 ���̿� + �� �־�����
		
		
		
		
		
	}

}
