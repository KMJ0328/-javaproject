/*			��(i)	    ��(k,��ĭ)   ��(j,���ڰ���)  ��(j,��������)
     1   	1			1~4 		5~5			2~x
    212		2		    1~3			5~4			2~2
   32123	3		    1~2 		5~3			2~3
  4321234 	4			1~1  		5~2			2~4
 543212345 	5			1~x			5~1			2~5
 */
public class Test12 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++){
			for(k=1;k<6-i;k++){ //�� ���� (��ĭ) 
				System.out.print(" ");
			}for(j=i;j>=1;j--){ //�� ���� (���ڰ���)
				System.out.print(j);
			}for(j=2;j<=i;j++){// ������ (��������)
				System.out.print(j);
			}System.out.println();
		}
	}

}
