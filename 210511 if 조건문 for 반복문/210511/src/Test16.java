// �ֻ���(1~6) 2���� ������ ���� ���ߴ� ���α׷�
// 5ȸ ��ȸ�� ��!(
// >> ��� ȭ�� <<
// [1�� ����]
// ���� �Է�: 10
// Ʋ�Ƚ��ϴ�. 10���� �۽��ϴ�.
//
// [2��° ����]
// �����Է�: 8
// Ʋ�Ƚ��ϴ�.
//......
// [5���� ����]
// �����Է�: 7
// Ʋ�Ƚ��ϴ�.
// ������ 9�Դϴ�.
import java.util.*;
public class Test16 {
	public static void main(String[] args) {
		int i, r1, r2, n;
		
		
		r1 = (int)((Math.random())*6)+1; // 1`6 ������
		r2 = (int)((Math.random())*6)+1;
		
		for(i=1; i<=5; i++) {// i�� 1~5���� 5ȸ �ݺ�
			System.out.println("["+ i + "��° ����]");
			Scanner sc= new Scanner(System.in);
			System.out.print("���� �Է�: ");
			n = sc.nextInt();
			
			if(n == (r1 + r2)){
				System.out.println("�����Դϴ�."); //break; // if�� �����ϰ� ���� ���� ����� for �� ������ ������.
				System.exit(0); // ���α׷� ����
			}else if(n > (r1 + r2)){
				System.out.println("Ʋ�Ƚ��ϴ�" + n + "���� �۽��ϴ�.");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�" + n + "���� Ů�ϴ�.");
			}
		} System.out.println("5�� ��ȸ�� �� ���̽��ϴ�.\n ������ : "+ (r1 + r2) + "�Դϴ�.");
	}

}
