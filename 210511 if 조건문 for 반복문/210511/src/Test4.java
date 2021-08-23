// 주사위 (1~6) 2개 던져서 나온 숫자의 합 맞추는 프로그램
// >> 결과 화면 <<
// (6,3)의 합은 9입니다.

// >> 결과 화면 #2-1 <<
// 주사위 2개의 합(2~12) 입력:10
// (6,3)의 합은 9입니다.
// 틀렸습니다.

// >> 결과 화면 #2-2<<
// 주사위 2개의 합(2~12) 입력:9
// (6,3)의 합은 9입니다.
// 정답입니다.
import java.util.*;
public class Test4 {
	public static void main(String[] args) {
		int r1,r2, total, n;
		Scanner sc = new Scanner(System.in);
		
		r1 = (int)(Math.random()*6)+1; // 1~6 랜덤값 발생
		r2 = (int)(Math.random()*6)+1;
		total = r1 + r2;
		
		System.out.print("주사위 2개의 합(2~12)"+ "입력 : ");
		n = sc.nextInt();
		
		if(total == n){
			System.out.println("(" + r1 + " , " + r2 +") 의 합은 "+ total + "입니다.");
			
			System.out.println("정답입니다.");
		} else {
			System.out.println("(" + r1 + " , " + r2 +") 의 합은 "+ total + "입니다.");
			System.out.println("틀렸습니다.");
		}
		// 스캐너는 어떨떄 사용하는지 물어보기
		// r1 r2 사이에 + 를 왜쓴건지
		
		
		
		
		
	}

}
