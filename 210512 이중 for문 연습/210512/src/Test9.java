/*			��(i)		��(j,��ĭ) 	��(k, ��)
     * 		  1			1~4			1~1
    *** 	  2			1~3			1~3
   ***** 	  3			1~2			1~5
  ******* 	  4			1~1			1~7
 ********* 	  5			1~x			1~9
 */
public class Test9 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++){ // �� ����
			for(j=1;j<=5-i ;j++){// ������ (��ĭ)
				System.out.print(" ");
			}
			for(k=1;k<i*2;k++){// ������ (��)
				System.out.print("*");
			} System.out.println();
		}
		for(i=1;i<=5;i++){ // �� ����
			for(j=1;j<=i ;j++){// ������ (��ĭ)
				System.out.print(" ");
			}
			for(k=1;k<(5-i)*2;k++){// ������ (��)
				System.out.print("*");
			} System.out.println();
		}
	}

}
