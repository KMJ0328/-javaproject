import java.util.*;
// 최대값/최솟값 구하는 프로그램
// >> 결과 화면  <<
// 정수 1: 10
// 정수 2: 20
// 정수 3: 30
//
// 최대값: 30
// 최솟값: 10


public class Test11 {
	public static void main(String[] args) {
		int n1, n2,n3,max,min;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		n1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		n2 = sc.nextInt();
		System.out.print("정수3 입력: ");
		n3 = sc.nextInt();
		
		/////////////// if문으로 구현하는 부분
		if(n1 >=n2 && n1>=n3){
			max = n1;
			
		}else if(n2>=n1 && n2>=n3){
			max = n2;
		}else{
			max = n3;
		if(n1 <=n2 && n1<=n3){
			min = n1;
		}else if (n2 <=n1 && n2<=n3){
			min = n2;
		}else {
			min = n3;
		}
			System.out.println();
			System.out.println("최대값: " + max);
			System.out.println("최솟값: " + min);
		}
	}
}
	
