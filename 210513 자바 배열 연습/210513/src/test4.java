// 1���� �迭 ����
// >> ��� ȭ�� <<
// �л�1 ���� �Է�:
// �л�2 ���� �Է�:
// �л�3 ���� �Է�:

// ��ȣ  ����
// 1 : 98
// 2 : 75
// 3 : 100
import java.util.*;
public class test4 {
	public static void main(String[] args) {
		int score[] = new int[3]; // 0 , 1 , 2
		int i;
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0; i<score.length; i++){ // i�� 0,1,2
			System.out.print("�л� ���� "+(i+1)+" �Է�: ");
			score[i] = sc.nextInt(); // score[i]�� ����ڰ� ���� ��
		}
			System.out.println(); // �ٹٲ�
			
			System.out.println("��ȣ\t����");
			for(i=0; i<score.length; i++){
				System.out.printf("%2d\t%3d\n",(i+1),score[i]);
			}
	}

}
