// ����ڿ��� ���� �Է¹޾Ƽ� ��,õ.��.��.�� ������ ǥ���ϴ� ���α׷�
// >> ��� ȭ�� <<
// ���Է�: 12345
// 1�� 2õ 3�� 4�� 5��
// ������ money/10000
// õ���� money%10000
// ����� money%100
// �Ͽ��� money%10
import java.util.*;
public class Test18 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		System.out.print(n/10000+"��"+ ((n/1000)%10)+"õ"+((n/100)%10)+"��"+((n/10)%10)+"��"+(n%10)+"�� �Դϴ�.");
	}

}
