/*			��(i)	    ��(k,��ĭ)    ��(j,����)     ��(j,����)
 543212345	1			1~x 		5~1			2~5
  4321234	2		    1~1			5~2			2~4
   32123	3		    1~2 		5~3			2~3
    212 	4			1~3  		5~4			2~2
     1	 	5			1~4			5~5			2~x
 */
public class Test11_1 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++){
			for(k=1;k<i;k++){ //�� ���� ��ĭ
				System.out.print(" ");
			}for(j=6-i; j>=1; j--){
				System.out.print(j);// ���ڰ���
			}for(j=2;j<=6-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
