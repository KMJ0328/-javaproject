/*			행(i)		열(j,숫자)
 1 			1			1~1	
 12 		2			1~2
 123		3			1~3
 1234		4			1~4
 12345		5			1~5
 */




public class Test10 {
	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++){// 행제어
			for(j=1;j<=i ;j++){//열제어
				System.out.print(j);
			}
			
			
			
			System.out.println();	
		}

	}

}
