// ���� ó��
// try-catch-finally��
// ������ ���� �߻� !

public class Test2 {
	public static void main(String[] args) {
		//Exception ex = new Exception(); // ���� ��ü ����
		
		try {
			System.out.println("try�� �Դϴ�."); // 1
			throw new Exception("�����Դϴ�."); // throw�� ���ܸ� ������ �߻���Ŵ!
		} catch(Exception e){
			System.out.println("catch�� �Դϴ�.");// 2
			System.out.println(e.getMessage()); // ���� �޽���!
		}

	}

}
