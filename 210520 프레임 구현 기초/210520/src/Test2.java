// 예외 처리
// try-catch-finally문
// 강제로 예외 발생 !

public class Test2 {
	public static void main(String[] args) {
		//Exception ex = new Exception(); // 예외 객체 생성
		
		try {
			System.out.println("try문 입니다."); // 1
			throw new Exception("예외입니다."); // throw은 예외를 강제로 발생시킴!
		} catch(Exception e){
			System.out.println("catch문 입니다.");// 2
			System.out.println(e.getMessage()); // 에외 메시지!
		}

	}

}
