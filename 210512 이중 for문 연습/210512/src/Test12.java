/*			행(i)	    열(k,빈칸)   열(j,숫자감소)  열(j,숫자증가)
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
			for(k=1;k<6-i;k++){ //열 제어 (빈칸) 
				System.out.print(" ");
			}for(j=i;j>=1;j--){ //열 제어 (숫자감소)
				System.out.print(j);
			}for(j=2;j<=i;j++){// 열제어 (숫자증가)
				System.out.print(j);
			}System.out.println();
		}
	}

}
