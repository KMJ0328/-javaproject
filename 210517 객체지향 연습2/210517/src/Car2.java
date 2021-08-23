




public class Car2 { // Car 클래스 정의
	String color = "pink"; // 멤버변수(초기값 없으면 기본 null으로 설정),인스턴스 변수
	int door = 10; //1. 명시적 초기화 방법 
	//3. 초기화 블럭을 이용한 방법!
	//3-1. 인스턴스 초기화 블럭 { }
	// 객체(인스턴스) 생성시마다 호출됨, 생성자 보다 먼저 호출 
	{
		System.out.println("인스턴스 초기화 블럭입니다.");
	}
	//3-2. 클래스 초기화 블럭 { }
	//클래스 로딩되는 순간 단 1회 호출 됨! (프로그램 시작시)
	static {
		System.out.println("클래스 초기화 블럭입니다."); // 0
	}
	
	
	Car2(){ // 2. 생성자 초기화 방법, 기본생성자
		this("black"); // Car("black");와 같지만 this();로 사용해야 함!!
						  // 첫 문장에 작성해 야 함!
						  // 나와 같은 클래스에 다른 생성자 호출!
		door = 4;
		System.out.println("기본 생성자 입니다.");
	}
	
	
	
	Car2(String color){ // 매개변수 있는 생성자
		this.color = color; // this.은 객체 자신의 주소
		door = 3;
		System.out.println("Car(String) 생성자 입니다.");
	}
	Car2(String color,int door){ // 매개변수 있는 생성자
		this.color = color; // this.은 객체 자신의 주소
		this.door = door;
		System.out.println("Car(String ,int ) 생성자 입니다.");
	}
	Car2(Car2 c){ // 매개변수 있는 생성자
		this(c.color,c.door);
		//this.color = c.color;
		//this.door = c.door;
		System.out.println("Car(Car) 생성자 입니다.");
	}
	
	void start(){ // 멤버메소드, 인스턴스 메소드
	System.out.println("출발합니다~");
	}
	void stop(){
	System.out.println("멈춥니다~");
	}
}
