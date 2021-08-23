//자바는 단일 상속만 가능!


public class Bus extends Car{ // Car 클래스를 상속받는 Bus 클래스 정의 --->( extends )
	int window; //인스턴스 변수 
	Test1 t1 = new Test1 ();
	
	Bus(){ // 기본 생성자
		super (); // Car (); 와 같음, (super는 조상 생성자를 뜻함)
		window = 5; // this.window = 5;와 같음
	}
	Bus(int window){// 매개변수 있는 생성자
		// super()는 부모의 생성자 호출할 때 사용!
		// 모든 생성자 앞에 super()이 작성되어 있지 않으면 컴파일러가 super();을 추가해 줌 !
		// 단, this()가 있으면 super();을 추가해주지 않음!
		super ("green"); // Car (); 와 같음, (super는 조상 생성자를 뜻함)
		this.window = window; 
		}
	public String toString() {// 오버라이딩
		return "Bus 클래스";
	}
	void start() {// 오버리이딩: 조상클래스에서 정의된 메소드를 지식클래스에서 재정의
		super.start();//super.은 조상의 멤버에 접근
		System.out.println("버스 출발합니다~");
	}
	//void busStart () {
		// super.은 부모의 멤버 접근시 사용 !
		//System.out.println("n = "+ super.n);
		
		//System.out.println("버스 출발합니다~");
//	}
	
	void busStop() {
		System.out.println("버스 멈춥니다~");
	}
}
