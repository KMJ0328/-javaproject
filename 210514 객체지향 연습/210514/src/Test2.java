// 자바의 타입
//1. 기본형 (8개)
// boolean(1),char(2),
//정수: byte(1),short(2),int(4),long(8)
//실수: float(4),double(8)




// 2. 참조형(클래스명)
// 주소만 저장 가능함!(4byte)

public class Test2 {
	public static void main(String[] args) {
		int n = 10; // 지역변수 (초기화 필수 ) 안하면 쓰레기값이 됨.
		Car c1 = new Car (); // c1 객체 =(인스턴스)생성, 참조변수,지역변수
		Car c2 = new Car ();
		c1 = c2;
		c1.color = "red";
	
		System.out.print("c1.color = " +c1.color);
		System.out.print("c2.color = " +c2.color);
		
		
	}

}
