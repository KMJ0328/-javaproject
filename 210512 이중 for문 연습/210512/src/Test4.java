/*			행(i)	열(j)
 ***** 		1		5~1
 ****		2		5~2
 ***		3		5~3
 **			4		5~4
 *			5		5~5
 */
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		int i,j,n; // 반복 제어 변수
		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++){ // 행제어(1~n까지 n회반복)
			for(j=1; j<=(n+1)-i; j++){ // 열제어
				System.out.print("*");// 별 출력	
			}
			System.out.println(); // 각 행 끝 줄바꿈!
		}
	}

}
