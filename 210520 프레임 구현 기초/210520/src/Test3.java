// throw: 강제로 예외 발생!
// throws: 떠넘기기(예외 던지기)

public class Test3 {
	public static void main(String[] args) {
		try{
		method1(); // method1()호출
		}catch(Exception e){
			System.out.println("main()에서 예외 처리합니다.");
		}
	}
	static void method1()throws Exception{
		method2(); // method2()호출
		
	}
	static void method2() throws Exception {
			throw new Exception("예외발생!");
		}
			
			
		
	
}
