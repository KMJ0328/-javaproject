


public class Test4 {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// �� ���� ���: ����/�μ��� �⺻���� ���
		// �ּ� ���� ���: ����/�μ��� �������� ��� 
		change(d);// �޼ҵ� ȣ��
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

		
	static void change(Data d){ // Ŭ���� �޼ҵ� ����
		d.x =1000;
		System.out.println("change() : x = " + d.x);
	}
		
}
