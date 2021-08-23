




public class Car extends Object { // Car 클래스 정의
	String color ; // 멤버변수(초기값 없으면 기본 null으로 설정),인스턴스 변수
	int door ; //1. 명시적 초기화 방법 
	
	
	Car(){ // 기본 생성자
		this("black"); // this()는 다른 생성자 호출, 첫 문장에 작성
		door = 4;
	}
	Car(String color){ // 매개변수 있는 생성자
		super(); // 조상의 기본 생성자 Object(); 호출
		this.color = color; // this.은 객체 자신의 주소
		this.door = 3;
	}
	
	public String toString() {// 오버라이딩
		return "Bus 클래스";
	}
	
	void start(){ // 멤버메소드, 인스턴스 메소드
	System.out.println("출발합니다~");
	}
	void stop(){
	System.out.println("멈춥니다~");
	}
}
