import java.util.*;

//입장료 프로그램 
//1~15세 사이면 입장료 1000원
//16~30세 2000원
//31~40세 3000원
//41세 ~  10000원

//>> 결과화면 <<
//나이 입력: 25
//25세는 입장료 2000원 입니다.

public class Test9 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		
		if(age>=1) { // 나이가 1세 이상이면 참
			if(age<=15) { // 1~15세
				System.out.println(age +"세는 입장료 1000원입니다.");
			}else if(age <= 30) { // 16~30세 				
				System.out.println(age +"세는 입장료 2000원입니다.");
			}else if(age <= 40){ // 31~40세
				System.out.println(age +"세는 입장료 3000원입니다.");
			}else { // 41세~
				System.out.println(age +"세는 입장료 10000원입니다.");
			}
		}else { // 나이가 0세 이하이면 실행
			System.out.println("1세 이상만 입력 가능합니다.");
		}
	}
}
