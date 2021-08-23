import java.util.*; // Scanner 클래스 사용하기 위해 import

// 홀/짝 구별 프로그램
// >> 결과 화면 <<
// 입력하신 15는 홀수 입니다.

public class Test5 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		if(n % 2 == 0 ){
			System.out.println("입력하신 " + n +"는(은) 짝수 입니다.");
			
		}else {
			System.out.println("입력하신 " + n +"는(은) 홀수 입니다.");
		}
	}

}
