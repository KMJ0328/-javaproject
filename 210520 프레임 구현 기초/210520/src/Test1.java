//예외처리 (Exception Handling)

   
public class Test1 {
	public static void main(String[] args) {
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		try { // 예외가 발생할 수 도있고, 안할 수 도있는 문장들이 옴!
			System.out.println(3/0);
			System.out.println(4);
		} catch (ArithmeticException ae){ // 산술적 예외 처리 클래스
			System.out.println(0);
			System.out.println(ae.getMessage()); // 예외 메시지
			ae.printStackTrace(); // 예외 메시지 + 스택 경로
		} catch(Exception e){ // 모든 예외 처리해주는 클래스
			System.out.println(5);
		} finally{ // 예외발생하거나 안하거나 무조건 finally문 실행하고 나감!
			System.out.println(6);
		}
		
	}

}
