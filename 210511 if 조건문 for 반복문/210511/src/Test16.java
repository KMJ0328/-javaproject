// 주사위(1~6) 2개를 던져서 숫자 맞추는 프로그램
// 5회 기회를 줌!(
// >> 결과 화면 <<
// [1번 도전]
// 정수 입력: 10
// 틀렸습니다. 10보다 작습니다.
//
// [2번째 도전]
// 정수입력: 8
// 틀렸습니다.
//......
// [5번쨰 도전]
// 정수입력: 7
// 틀렸습니다.
// 정답은 9입니다.
import java.util.*;
public class Test16 {
	public static void main(String[] args) {
		int i, r1, r2, n;
		
		
		r1 = (int)((Math.random())*6)+1; // 1`6 랜덤값
		r2 = (int)((Math.random())*6)+1;
		
		for(i=1; i<=5; i++) {// i는 1~5까지 5회 반복
			System.out.println("["+ i + "번째 도전]");
			Scanner sc= new Scanner(System.in);
			System.out.print("정수 입력: ");
			n = sc.nextInt();
			
			if(n == (r1 + r2)){
				System.out.println("정답입니다."); //break; // if문 제외하고 나와 가장 가까운 for 문 밖으로 나간다.
				System.exit(0); // 프로그램 종료
			}else if(n > (r1 + r2)){
				System.out.println("틀렸습니다" + n + "보다 작습니다.");
			}else {
				System.out.println("틀렸습니다" + n + "보다 큽니다.");
			}
		} System.out.println("5번 기회를 다 쓰셨습니다.\n 정답은 : "+ (r1 + r2) + "입니다.");
	}

}
