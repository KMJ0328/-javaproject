// 숫자(1~50) 맞추기 프로그램
// >> 결과화면 <<
// 정수 입력 : 30
// 30보다 작습니다.
//
// 정수 입력 : 20
// 20보다 큽니다.
//
// 정수 입력: 25
// 정답입니다.
import java.util.*;
public class Test13 {
	public static void main(String[] args) {
		int r, n;
		Scanner sc = new Scanner(System.in);
		r = (int)(Math.random()*50)+1;
		
		
		for( ; ; ){ // 무한루프
			System.out.print("정수 입력 : "); // 무한루프 코드는 계속 반복되지 않고 정수입력을 해야 다시 실행이 되는 이유는 문장을 다 읽고  틀렸을때 다시 올라오는데
			n = sc.nextInt();			  //System.out.print("정수 입력 : ");을 써주었기 떄문에 사용자가 입력을해야 다시 내려감 
			if( n == r){
				System.out.println(" 정답입니다. ");
			}else if( n<r ){
				System.out.println( n +"보다 큽니다.");
			}else {
				System.out.println( n +"보다 작습니다.");
			}
		}
	}

}
