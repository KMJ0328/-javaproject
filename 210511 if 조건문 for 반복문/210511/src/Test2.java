// 랜덤(난수)발생 연습
// Math.random(): 0.0 <= r <1.0
// 1~45 사이의 랜덤값  6개 발생!
public class Test2 {
	public static void main(String[] args) {
		double r1,r2,r3,r4,r5,r6;
		
		r1 =	(int) (Math.random()*45)+1; // 1~10 사이의 랜덤값 발생시켜 r에 대입
		r2 =	(int) (Math.random()*45)+1;
		r3 =	(int) (Math.random()*45)+1;
		r4 =	(int) (Math.random()*45)+1;
		r5 =	(int) (Math.random()*45)+1;
		r6 =	(int) (Math.random()*45)+1;
		// Math.random()	 	   : 0.0 <= R < 1.0
		// Math.random()*45  	   :0.0 <= R < 45.0
		// (int)Math.random()*45   :0 <= R < 45
		// (int)Math.random()*45+1 :1 <= R < 46
		// 1~45 랜덤값 추출 가능!
		
		System.out.println("1번째 번호: " + (int)r1 + " 입니다.");
		System.out.println("2번째 번호: " + (int)r2 + " 입니다.");
		System.out.println("3번째 번호: " + (int)r3 + " 입니다.");
		System.out.println("4번째 번호: " + (int)r4 + " 입니다.");
		System.out.println("5번째 번호: " + (int)r5 + " 입니다.");
		System.out.println("6번째 번호: " + (int)r6 + " 입니다.");
	}

}
