import java.util.*;
// 연산자 활용
// >> 결과화면 <<
// 초 입력: 12345
// 12345초는 xx시간 xx분 xx초 입니다.
public class Test10 {

	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		s = sc.nextInt();
		System.out.println(s + "초는");
		System.out.println((s/(60*60)) + "시간");
		System.out.println(s/60%60 + "분");
		System.out.println((s%60) + "초 입니다.");
	}

}
