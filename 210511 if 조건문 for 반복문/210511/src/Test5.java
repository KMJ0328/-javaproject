// 덧셈 프로그램
// 1~9 사이의 숫자 2개의 덧셈 구하는 프로그램
// >> 결과화면 <<
// 5+4 = 9
// 정답입니다.

// 5+4 = 10 
// 틀렸습니다.
import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		int r1,r2,n,total;
		Scanner sc = new Scanner(System.in);
		
		
		r1 = (int)(Math.random()*9)+1; // 1~6 랜덤값 발생
		r2 = (int)(Math.random()*9)+1;
		total = r1 + r2 ;
		
		System.out.print(r1 + " + " + r2 +" = ");
		n = sc.nextInt();
		if (n == total){
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
	}

}
