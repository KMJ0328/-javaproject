// 팩토리얼 (5! = 5*4*3*2*1 = 120)
// >> 결과화면 <<
// 정수 입력: 5
// 5! = 120
import java.util.*;
public class Test16 {
	public static void main(String[] args) {
		int i,n,total = 1; //누적 변수는 초기화 필수!!
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		n= sc.nextInt();
		System.out.print(n+"!"+"=");
		
		for(i=n; i>=1;i--){ // i = 5,4,3,2,1
			total = total*i;
			if(i == 1){
				System.out.print(i);
			}else{
				System.out.print(i + "*");
			}
		}System.out.println(" = "+ total);
		
	}
	}


