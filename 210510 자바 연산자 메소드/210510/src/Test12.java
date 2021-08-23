//  자판기 프로그램
// >> 결과화면 <<
//=====메뉴=====
//1.아메리카노
//2.카페라떼
//3.카푸치노
//4.종료
//========
//메뉴:1
//아메리카노를 선액하셨습니다.
import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====메뉴=====");
		System.out.println("1.아메리카노");
		System.out.println("2.카페라떼");
		System.out.println("3.카푸치노");
		System.out.println("4.종료");
		System.out.println("========");
		System.out.println("메뉴 입력: ");
		n = sc.nextInt();
		if(n == 1){
			System.out.println("아메리카노를 선택하셨습니다.");
		} else if(n == 2) {
			System.out.println("카페라떼를 선택하셨습니다.");
		} else if(n == 3) {
			System.out.println("카푸치노를 선택하셨습니다.");
		} else if(n == 4){
			System.out.println("종료합니다.");
		} else { // else문에는 조건식 없음 !!
			System.out.println("1~4번만 입력 가능합니다.");
		}
	}
}
