// �ڹ��� Ÿ��
//1. �⺻�� (8��)
// boolean(1),char(2),
//����: byte(1),short(2),int(4),long(8)
//�Ǽ�: float(4),double(8)




// 2. ������(Ŭ������)
// �ּҸ� ���� ������!(4byte)

public class Test2 {
	public static void main(String[] args) {
		int n = 10; // �������� (�ʱ�ȭ �ʼ� ) ���ϸ� �����Ⱚ�� ��.
		Car c1 = new Car (); // c1 ��ü =(�ν��Ͻ�)����, ��������,��������
		Car c2 = new Car ();
		c1 = c2;
		c1.color = "red";
	
		System.out.print("c1.color = " +c1.color);
		System.out.print("c2.color = " +c2.color);
		
		
	}

}
