// �������� ���α׷�

// A: 90~100, B: 80~89 C: 70~79, D: 60~69 F: 0~59
// ����ڿ��� ������ �Է¹޾� ����� �˷��ִ� ���α׷�
// ������ 0~100�� ���̸� �Է� �޾ƾ� ��! (�����޽��� �߰�)
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("����(0~100) �Է�: ");
		score = sc.nextInt();// Ű����� ���� 1�� �Է¹޾�
		System.out.println("����� ������" + score + "�� �Դϴ�.");
		System.out.println("=============================");
		if(score>=90 && score<101){
			System.out.println(score+"���� A����Դϴ�.");
		}else if (score>79 && score<90){
			System.out.println(score+"���� B����Դϴ�.");
		}else if (score>69 && score<80){
			System.out.println(score+"���� C����Դϴ�.");{
		}
		}else if (score>59 && score<70){
			System.out.println(score+"���� D����Դϴ�.");
			}else if(score>=0 && score<60){
				System.out.println(score+"���� F����Դϴ�.");
			}else{
				System.out.println("0~100�� ���̸� �Է��ϼ���");
			}
	}
}


