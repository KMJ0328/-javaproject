// �л� 3���� ������ �Է¹޾� ������ ����� ���ϴ� ���α׷�
//>>���ȭ��<<
// 3���� ������ xx xx xx�Դϴ�.
// ����:xx
// ���:xx.x


import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		int total = 0,i,score[] = {88,99,78,80,99,77,77,45,52,85,65,72,88};
		System.out.print(score.length +"���� ������ ");
		for(i=0;i<score.length;i++){
			total += score[i];
			System.out.print(score[i]+" ");
		}System.out.println("�Դϴ�.");
		System.out.println("���� : "+ total);
		System.out.printf("��� : "+("%.1f\n"),(double)total/score.length);
	}

}
