// ���� ���α׷�
// 1~9 ������ ���� 2���� ���� ���ϴ� ���α׷�
// >> ���ȭ�� <<
// 5+4 = 9
// �����Դϴ�.

// 5+4 = 10 
// Ʋ�Ƚ��ϴ�.
import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		int r1,r2,n,total;
		Scanner sc = new Scanner(System.in);
		
		
		r1 = (int)(Math.random()*9)+1; // 1~6 ������ �߻�
		r2 = (int)(Math.random()*9)+1;
		total = r1 + r2 ;
		
		System.out.print(r1 + " + " + r2 +" = ");
		n = sc.nextInt();
		if (n == total){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}

}
