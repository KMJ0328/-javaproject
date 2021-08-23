// 사용자에게 돈을 입력받아서 만,천.백.십.원 단위로 표시하는 프로그램
// >> 결과 화면 <<
// 돈입력: 12345
// 1만 2천 3백 4십 5원
// 만원은 money/10000
// 천원은 money%10000
// 백원은 money%100
// 일원은 money%10
import java.util.*;
public class Test18 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 입력: ");
		n = sc.nextInt();
		System.out.print(n/10000+"만"+ ((n/1000)%10)+"천"+((n/100)%10)+"백"+((n/10)%10)+"십"+(n%10)+"원 입니다.");
	}

}
