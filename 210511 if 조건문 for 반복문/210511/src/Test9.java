// 반복문(for문)
// 1~100 사이의 누적합을 구하는 프로그램
// >>결과화면<<
// 1~100사이의 짝수의 누적합은 xxx입니다.



public class Test9 {
	public static void main(String[] args) {
		int i, total = 0; // 누적 변수는 초기화 필수!!
		
		
	  //for(1.초기값;2.조건식;3.증감식){문장들;}
		for( i=1; i<=100; i++){ // i는 1~100까지 100회 반복
			if( i % 2 == 1){
				total += i; // total = total + i;와 같음
			}
	
		}
		System.out.println("1~100사이의 홀수의 누적합은"+ total + "입니다.");
	}

}
