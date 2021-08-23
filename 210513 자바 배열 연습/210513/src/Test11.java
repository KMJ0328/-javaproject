// 사칙연산 프로그램
// >>결과 화면 <<
// 정수1 : 10
// 정수2 : 20
//
//==== 사칙연산 ====
//1.덧셈
//2.뺄셈
//3.곱셈
//4.종료
//===============
//선택:1
//10+20 = 30
//선택:2
//10 -20 = -10



import java.util.*;
public class Test11 {
	public static void main(String[] args) {
		int i,j,arr[]= new int[2]; // 지역 변수는 초기화 않으면 쓰레기값
		Scanner sc =new Scanner(System.in);
		
		
		
		for(i=0;i<arr.length;i++){
		System.out.print("정수"+ (i+1)+ ":");
		arr[i] = sc.nextInt();
		}System.out.println("==== 사칙연산 ====");
		System.out.print("1.덧셈\n2.뺄셈\n3.곱셈\n4.종료\n");
		System.out.println("===============");
		System.out.print("선택: ");
		for(i=0;i<arr.length;i++){
			j = sc.nextInt();
			if(j == 1){
				System.out.println(arr[i]+arr[(i+1)]);
			}else if(j == 2){
				System.out.println(arr[i]-arr[(i+1)]);
			}else if(j == 3){
				System.out.println(arr[i]*arr[(i+1)]);
			}else if(j == 4){
				System.out.println("종료를 선택하셨습니다.");
				System.exit(0);
			}else{
				System.out.println("1~4만 입력가능합니다.");
			}
		}
		
		
	}

}
