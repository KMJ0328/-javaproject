/*			��(i)   ��(j)(��ĭ)   ��(k)��
     *		1		1~4			5~5
    **		2		1~3			4~5
   ***		3		1~2			3~5
  ****		4		1~1			2~5
 *****		5		1~x			1~5
 */
public class Test5 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++){ //�� ����
			for(j=1; j<=5-i; j++){// �� ���� (��ĭ)
				System.out.print(" ");
			}
			for(k=6-i ; k<=5; k++){ // �� ���� (��)
				System.out.print("*");
			}
			
			System.out.println();// �� �� �� �ٹٲ�
		}
	}

}
