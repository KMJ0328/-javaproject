/*			��(i)	��(j)
 * 			1		1~1
 **			2		1~2
 ***		3		1~3
 ****		4		1~4
 *****		5		1~5
 */
public class Test1 {
	public static void main(String[] args) {
		int i,j; // �ݺ� ���� ����
		for(i=1; i<=5; i++){ // ������(1~5���� 5ȸ�ݺ�)
			for(j=1; j<=i; j++){ // ������
				System.out.print("*");// �� ���	
			}
			System.out.println(); // �� �� �� �ٹٲ�!
		}
	}

}
