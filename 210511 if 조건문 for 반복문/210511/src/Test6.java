// 조건문(switch문)
import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		// 찾는값 변수명, 수식, 상수
		// switch(찾는값) {문장들;}
		//break문은 조건이나 반복문 {블럭}을 빠져나감 (단, if문 제외)
		switch(n){
				case 5:
					System.out.print("*"); 
				case 4:
					System.out.print("*"); 
				case 3:
					System.out.print("*"); 
				case 2:
					System.out.print("*"); 
				case 1:
					System.out.print("*"); break;
			   default:
				    System.out.println("1~5만 입력 가능합니다."); 
		}
	}

}
