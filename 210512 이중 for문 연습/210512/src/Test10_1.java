/*			행(i)		열(j,숫자)
 5 			1			5~5	
 54 		2			5~4
 543		3			5~3
 5432		4			5~2
 54321	 	5			5~1
 */

public class Test10_1 {

	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++){// 행제어
			for(j=5;j>=6-i ;j--){//열제어
				System.out.print(j);
			}
			System.out.println();	
		}

	}

}
