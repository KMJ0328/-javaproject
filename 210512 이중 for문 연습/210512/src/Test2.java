/*			��(i)	��(j)

 * 			1		1~1
 **			2		1~2
 ***		3		1~3
 ****		4		1~4
 *****		5		1~5
 */
import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		int i,j,n; // �ݺ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++){ // ������(1~n���� nȸ�ݺ�)
			for(j=1; j<=i; j++){ // ������
				System.out.print("*");// �� ���	
			}
			System.out.println(); // �� �� �� �ٹٲ�!
		}
	}

}
