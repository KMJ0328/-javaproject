// �ڹ� �ְ����� Ŭ���� : Object
// Ŭ���� ���� extends�� (���)���� ������ object Ŭ������ �����!



public class Test3 {
	public static void main(String[] args) {
		Bus b1 = new Bus(10);
		Car c1 = new Car();
		
		System.out.println(b1); //Bus Ŭ����
		//System.out.println(b1.toString()); �� ����
		System.out.println("c1�� ����" + c1.toString()+"�Դϴ�.");
		
		System.out.println("b1.color="+ b1.color);
		System.out.println("b1.door="+ b1.door);
		System.out.println("b1.window="+ b1.window);

	}

}
