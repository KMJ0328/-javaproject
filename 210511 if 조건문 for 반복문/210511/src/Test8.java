// �������� ���α׷� (switch��)

// A: 90~100, B: 80~89 C: 70~79, D: 60~69 F: 0~59
// ����ڿ��� ������ �Է¹޾� ����� �˷��ִ� ���α׷�
// ������ 0~100�� ���̸� �Է� �޾ƾ� ��! (�����޽��� �߰�)
import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		score = sc.nextInt();
		
		if(score>=0 && score<=100){ // 0~100�� ���̸� ��
		switch(score/10){
		case 10:
		case 9 : System.out.println(score + "���� A��� �Դϴ�.");break;
		case 8 : System.out.println(score + "���� B��� �Դϴ�.");break;
		case 7 : System.out.println(score + "���� C��� �Դϴ�.");break;
		case 6 : System.out.println(score + "���� D��� �Դϴ�.");break;
		default: System.out.println(score + "���� F��� �Դϴ�.");
	}
		}else{
			System.out.println("0~100�� ���̸� �Է� �����մϴ�.");
			
		}
	}

}
