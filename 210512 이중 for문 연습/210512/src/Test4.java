/*			��(i)	��(j)
 ***** 		1		5~1
 ****		2		5~2
 ***		3		5~3
 **			4		5~4
 *			5		5~5
 */
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		int i,j,n; // �ݺ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++){ // ������(1~n���� nȸ�ݺ�)
			for(j=1; j<=(n+1)-i; j++){ // ������
				System.out.print("*");// �� ���	
			}
			System.out.println(); // �� �� �� �ٹٲ�!
		}
	}

}
