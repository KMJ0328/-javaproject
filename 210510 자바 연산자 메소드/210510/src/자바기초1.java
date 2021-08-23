// 한줄 주석 
/* 여러줄 주석 */
public class 자바기초1 { //  클래스 Test1 정의, 보통 클래스명은 시작은 대문자! 

	public static void main(String[] args) { // 메인 메소드(프로그램 시작 위치)정의, 단 1개만 있어야 됨!  
		// 자바 기본형 (8개)
		// boolean(1byte) - true/false 만 저장 가능 (소문자만 가능)
		boolean bool = true;
		// char(2byte) - 문자 1개만 저장 가능 (따음표 사용)
		char ch = 'a';
		// byte(byte) - 정수
		// short(2byte) -정수
		// int(4byte) - 정수 (디폴트 타입)
		// long(8byte) - 정수
		// float(4byte) - 실수
		// double (8byte) - 실수 (디폴트 타입)
		
		// 참조형(클래스명으로 되어있음), 주소만 저장 가능함!
		
		int n; // 지역변수(값 초기화 하지 않으면 쓰레기값)
		n = 123; // 10을 n에 대입 변수의 값을 처음 넣는게 초기화라고 함
	
		
		
		System.out.println("n의 값은 " + n + "입니다."); // 화면 출력
		
	}

}
