// 3���� (double��) ������ �Է� �޾Ƽ� ������ ����� ���ϴ� ���α׷�
//  >> ���ȭ�� <<
// �л�1 ���� �Է�: 90.5
// �л�2 ���� �Է�: 90.5
// �л�3 ���� �Է�: 90.5
//
// 3���� ����: xxx.x //"%.1d", ����
// 3���� ���: xx.x // "%.1d", ����
import java.util.*;
public class Test17 {
	public static void main(String[] args) {
		int i;
		double s1,s2,s3,total,total2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� 1 ���� �Է�: ");
		s1 = sc.nextDouble();
		System.out.print("�л� 2 ���� �Է�: ");
		s2 = sc.nextDouble();
		System.out.print("�л� 3 ���� �Է�: ");
		s3 = sc.nextDouble();
		
		total = s1+s2+s3;
		System.out.printf("3���� ������: "+"%.1f",total);
		System.out.println();
		System.out.printf("3���� ���������: "+"%.1f",total/3);
	}

}
