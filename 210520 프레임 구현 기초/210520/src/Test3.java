// throw: ������ ���� �߻�!
// throws: ���ѱ��(���� ������)

public class Test3 {
	public static void main(String[] args) {
		try{
		method1(); // method1()ȣ��
		}catch(Exception e){
			System.out.println("main()���� ���� ó���մϴ�.");
		}
	}
	static void method1()throws Exception{
		method2(); // method2()ȣ��
		
	}
	static void method2() throws Exception {
			throw new Exception("���ܹ߻�!");
		}
			
			
		
	
}
