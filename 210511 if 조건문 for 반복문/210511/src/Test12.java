// 오늘의 운세 프로그램
// 별 1~10 사이의 출력해줌!

import java.util.*;

public class Test12 {
	public static void main(String[] args) {
		int i, r;
		
		r = (int)(Math.random()*10)+1; //1 ~ 10 사이의 랜덤값을 r에 대입
		
		
		System.out.println(">> 내일의 운세 입니다. <<");
		
		for(i=1; i<=r; i++){// 반복문은 i의 초기값이 1이면 i가  i<=r 이기떄문에 r이 랜덤으로 10이 나왔다고 가정하에 i가  i++으로인해 10이될때까지 반복하는것  
			System.out.print("★");
		}
	}

}
