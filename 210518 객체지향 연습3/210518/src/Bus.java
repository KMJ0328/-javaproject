// 접근제어자(access modifier)
// public : 모든 클래스에서 접근 가능!
// protected : 같은 패키지 내에서 + 다른 패키지의 자손 클래스 접근 가능 !
// (default) : 같은 패키지 내에서만 접근 가능!
// private : 같은 클래스에서만 접근 가능!


// 자바는 단일 상속
// 가장 많이 사용할 클래스를 상속받고, 나머지 클래스는 포함관계로 사용 !

public class Bus extends Car {
	private int window; // 인스턴스변수 
	
	Bus(){
		super();//나의 조상클래스 생성자 호출!하는거랑 같음 super();는 this()가없으면 알아서  자동으로 넣어져있음
		window = 10;
	}
	void start() { // 오버 라이딩(조상 클래스에 정의된 메소드를 자식클래스에서 재정의)
		System.out.println("버스 출발합니다~");
	}
    public String toString(){ // 오버라이딩(Object 클래스의 메소드 재정의)toString은 최고조상클래스에있는 메소드
		return color +" 색상의 버스입니다.";
	}
}
