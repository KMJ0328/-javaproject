// 연산자
// 1. 단향연산자: 피연산자가 1개,예:+5,-5,++i,--i,i++,i--,!a 등
// 2. 이향연산자: 피연산자가 2개,예: 1+2, a>b
// 3. 삼향연산자: 피연산자가 3개,예: 조건 ?참일때, :거짓일때

// 산술연산자: +,-,^,/(몫),%(나머지)
// 비교연산자: >, <, >=(크거나 같다),<=(작거나 같다),==(깥으면 참),!= (같지않아야 참) 
// 논리연산자:  &&(AND), ||(or), !(NOT)
// 대입연산자: = (우선순위 가장 낮음, 오른쪽->왼쪽)
// 복합대입연산자: +=,-=,*= (a+=3;은 a=a+3;와 같음)
// 증감연산자: ++,-- (++a 선증가, --a 선감소, a++ 후증가, a--후감소)


public class Test3 {

	public static void main(String[] args) {
		boolean b = false;
		int  n = 5; 
		
		System.out.println("n = " + n ); // 5
		//                System.out.println("n = " + ++n); // 6
		// n++ or ++n은  n = n + 1;와 같음 
		//  			  System.out.println("n = " + n++); // 5 n++은 다음 연산에 적용됨
		//				  System.out.println("n = " + n ); // 6 위에서 n++을 사용하였기때문에 여기서 +1이 적용됨
		System.out.println("n = " + n--); // 5
		// n-- or --n은  n = n - 1;와 같음      // n--은 다음 연산에 적용됨
		System.out.println("n = " + n ); // 4        위에서 n--을 사용하였기때문에 여기서 -1이 적용됨
		//n += 10; // n = n+10; 와 같음
		//System.out.println("n의 값은" + n + "입니다.");
		//System.out.println(n<15 || n>25 ? "입장료 2000원" : "입장료 1000원");

	}

}
