// 자바 최고조상 클래스 : Object
// 클래스 정의 extends을 (상속)하지 않으면 object 클래스를 상속함!



public class Test3 {
	public static void main(String[] args) {
		Bus b1 = new Bus(10);
		Car c1 = new Car();
		
		System.out.println(b1); //Bus 클래스
		//System.out.println(b1.toString()); 와 같음
		System.out.println("c1의 값은" + c1.toString()+"입니다.");
		
		System.out.println("b1.color="+ b1.color);
		System.out.println("b1.door="+ b1.door);
		System.out.println("b1.window="+ b1.window);

	}

}
