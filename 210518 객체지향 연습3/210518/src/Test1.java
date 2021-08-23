// final 제어자
// 지역변수 : 처음 대입한 값(초기화) 이후에 값변경 불가!
// 멤버변수 : 처음 대입한 값(1.명시적초기화, 2. 생성자초기화)이후에 값변경 불가!
// 메소드 : 변경할 수 없는 메소드, 오버라이딩 금지!
// 클래스 : 변경할 수 없는 클래스, final 클래스는 어느 누구의 조상클래스가 될 수 없음 !

public class Test1 {
	public static void main(String[] args) {
		final int NUM =123; // final로 선언한 지역변수는 초기화 이후에 값변경 불가 !
		
		
		
		
		Car c1 = new Car(); // 객체(인스턴스) c1 생성
		Car c2 = new Car("pink", 2, false); // 객체(인스턴스) c2 생성
		Bus b1 = new Bus();
		
		System.out.println();
		
		System.out.println(b1.toString());
		
		b1.start();
		
		c1.powerOn();
		System.out.println("c1.power = " + c1.power);
		
		c2.powerOn();
		System.out.println("c2.power = " + c2.power);
		
		
	}

}
