/*			��(i)	��(j)
 ***** 		1		5~1
 ****		2		5~2
 ***		3		5~3
 **			4		5~4
 *			5		5~5
 */


public class Test3 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=5;i++){ //  �� ����
			for(j=5;j>=i;j--){ // �� ����
				System.out.print("*");
			}System.out.println();// �� �� �� �ٹٲ�
		}
	}

}
