import java.util.*;
// 입장료 프로그램 
// 1~15세 사이면 입장료 1000원
// 16~30세 2000원
// 31~40세 3000원
// 41세 ~  10000원

// >> 결과화면 <<
// 나이 입력: 25
// 25세는 입장료 2000원 입니다.

public class Test8 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		
		if(age>0 && age<16){
			System.out.println(age +"세는 입장료 1000원입니다.");
		}else if(age>15 && age<31){
			System.out.println(age +"세는 입장료 2000원입니다.");
		}else if(age>30 && age<41){
			System.out.println(age +"세는 입장료 3000원입니다.");
		}else if(age>40){
			System.out.println(age +"세는 입장료 10000원입니다.");
		}else {
			System.out.println("1세 이상만 입력 가능합니다.");
		}
	}

}
