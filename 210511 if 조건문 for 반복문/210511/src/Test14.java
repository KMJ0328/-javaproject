// >> 결과 화면 <<
// 1~10 까지의 누적합은 55입니다.

// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 =55
public class Test14 {
	public static void main(String[] args) {
		int i, total = 0;
		
		
		for(i=1; i<=10; i++){ //i가 1~10까지 10회 반복
			total += i;
		 if( i == 10 ) {
			System.out.print(i + "=");
		}else {
			System.out.print(i + "+");}
		} 
		System.out.println(total);
	}
}

	


