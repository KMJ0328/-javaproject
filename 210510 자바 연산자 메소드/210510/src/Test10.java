import java.util.*;
// ������ Ȱ��
// >> ���ȭ�� <<
// �� �Է�: 12345
// 12345�ʴ� xx�ð� xx�� xx�� �Դϴ�.
public class Test10 {

	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		s = sc.nextInt();
		System.out.println(s + "�ʴ�");
		System.out.println((s/(60*60)) + "�ð�");
		System.out.println(s/60%60 + "��");
		System.out.println((s%60) + "�� �Դϴ�.");
	}

}
