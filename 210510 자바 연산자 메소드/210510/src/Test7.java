import java.util.*;
// 사용자에게 정수 1개를 입력받아 3의배수인지 아닌지 구하는 프로그램
//>> 결과하면 <<
// 정수 입력: 12
// 12는 3의 배수 입니다.

// >> 결과하면2 <<
// 정수 입력: 11
// 11는 3의 배수가 아닙니다.
public class Test7 {

	public static void main(String[] args) {
		int n = 12;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		if(n % 3 == 0){
			System.out.println(n + "는 3의 배수 입니다.");
			}else {
				System.out.println(n + "는 3의 배수가 아닙니다.");
			}
	}

	
}
