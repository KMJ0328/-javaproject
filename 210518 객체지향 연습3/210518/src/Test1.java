// final ������
// �������� : ó�� ������ ��(�ʱ�ȭ) ���Ŀ� ������ �Ұ�!
// ������� : ó�� ������ ��(1.������ʱ�ȭ, 2. �������ʱ�ȭ)���Ŀ� ������ �Ұ�!
// �޼ҵ� : ������ �� ���� �޼ҵ�, �������̵� ����!
// Ŭ���� : ������ �� ���� Ŭ����, final Ŭ������ ��� ������ ����Ŭ������ �� �� ���� !

public class Test1 {
	public static void main(String[] args) {
		final int NUM =123; // final�� ������ ���������� �ʱ�ȭ ���Ŀ� ������ �Ұ� !
		
		
		
		
		Car c1 = new Car(); // ��ü(�ν��Ͻ�) c1 ����
		Car c2 = new Car("pink", 2, false); // ��ü(�ν��Ͻ�) c2 ����
		Bus b1 = new Bus();
		
		System.out.println();
		
		System.out.println(b1.toString());
		
		b1.start();
		
		c1.powerOn();
		System.out.println("c1.power = " + c1.power);
		
		c2.powerOn();
		System.out.println("c2.power = " + c2.power);
		
		
	}

}
