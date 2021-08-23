


public class Test4 {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// 값 전달 방식: 인자/인수가 기본형일 경우
		// 주소 전달 방식: 인자/인수가 참조형일 경우 
		change(d);// 메소드 호출
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

		
	static void change(Data d){ // 클래스 메소드 정의
		d.x =1000;
		System.out.println("change() : x = " + d.x);
	}
		
}
