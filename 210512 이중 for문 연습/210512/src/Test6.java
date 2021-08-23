/*			행(i)   열(j)(빈칸)   열(k)별
     *		1		1~4			5~5
    **		2		1~3			4~5
   ***		3		1~2			3~5
  ****		4		1~1			2~5
 *****		5		1~x			1~5
 */
import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("행 입력: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++){ //행 제어
			for(j=1; j<=n-i; j++){// 열 제어 (빈칸)
				System.out.print(" ");
			}
			for(k=(n+1)-i ; k<=n; k++){ // 열 제어 (별)
				System.out.print("*");
			}
			
			System.out.println();// 각 행 끝 줄바꿈
		}
	}

}
