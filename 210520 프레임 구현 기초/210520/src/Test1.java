//����ó�� (Exception Handling)

   
public class Test1 {
	public static void main(String[] args) {
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		try { // ���ܰ� �߻��� �� ���ְ�, ���� �� ���ִ� ������� ��!
			System.out.println(3/0);
			System.out.println(4);
		} catch (ArithmeticException ae){ // ����� ���� ó�� Ŭ����
			System.out.println(0);
			System.out.println(ae.getMessage()); // ���� �޽���
			ae.printStackTrace(); // ���� �޽��� + ���� ���
		} catch(Exception e){ // ��� ���� ó�����ִ� Ŭ����
			System.out.println(5);
		} finally{ // ���ܹ߻��ϰų� ���ϰų� ������ finally�� �����ϰ� ����!
			System.out.println(6);
		}
		
	}

}
