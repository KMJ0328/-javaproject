import java.lang.*; // java.lang 패키지 내에는 System,String,Object,Math...등이있다
					//이걸 컴파일러가 자동으로 추가해줌


// 클래스 내에는 1개이상의 생성자가 있어야 함!
// 생성자 없을 경우에는 컴파일러가 자동으로 기본생성자 Car(){} 를 자동 추가!

// Object 클래스는 자바에서 최고 조상클래스

// abstract(추상) 클래스는 1개 이상의 abstract(추상) 메소드가 있는 클래스를 의미함!
// 추상클래스를 상속받을수는 없음 ! 구현해서 써야 함!

public class Car extends Object { // Car 클래스 정의
	String color;
	int door;
	boolean power;
	
	Car(){ // 기본생성자
		this("black", 4, false);// Car(String,int,boolean); 랑 같음 근데 이건 쓰면안됨
		//this ()는 꼭 !! 첫문장에 와야 함!
	}
	Car(String color, int door, boolean power){ // 매개변수 있는 생성자
		super(); // 조상 클래스에 기본 생성자를 호출 !
		this.color = color;
		this.door = door;
		this.power = power;
	}
	//abstract void method();// abstract(추상,깡통) 메소드 정의
						   // 메소드의 헤더만 있고, 바디가 없는 것 ~
	
	
	void powerOn(){
			power=true;
	}
	void powerOff(){
		power=false;
}
	void start() {
			System.out.println("출발합니다~");
	}
	void stop(){
			System.out.println("멈춥니다~");
	}
}
