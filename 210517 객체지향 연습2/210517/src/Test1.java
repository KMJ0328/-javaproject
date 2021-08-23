//생성자는 멤버 초기화를 담당
// 생성자는 클래스명과 같고, 반드시 1개 이상의 생성자가 있어야 함!
// 생성자는 메소드는 아님, 리턴타입 없음.



import java.lang.*;//  컴파일러가 자동 추가


public class Test1 { // test1 클래스 정의
	Test1(){}// 기본생성자,  컴파일러가 생성자가 없으면 기본 생성자 추가해 줌~!
	public static void main(String[] args) {
		int n = 123; //지역변수
		Car c1 = new Car(); // 객체(인스턴스) c1 생성
		Car c2 = new Car("red"); // 객체(인스턴스) c2 생성
		//Car c3 = new Car("blue",2);// 객체(인스턴스) c3 생성
		//Car c4 = new Car(c2);// 객체(인스턴스) c4 생성
		
		//System.out.println("c1.color = "+c1.color);
		//System.out.println("c1.door = "+c1.door);
		//System.out.println("c2.color = " + c2.color);
		//System.out.println("c2.door = "+c2.door);
		//System.out.println("c3.color = " + c3.color);
		//System.out.println("c3.door = "+c3.door);
		
		
	}

}
