//�ڹٴ� ���� ��Ӹ� ����!


public class Bus extends Car{ // Car Ŭ������ ��ӹ޴� Bus Ŭ���� ���� --->( extends )
	int window; //�ν��Ͻ� ���� 
	Test1 t1 = new Test1 ();
	
	Bus(){ // �⺻ ������
		super (); // Car (); �� ����, (super�� ���� �����ڸ� ����)
		window = 5; // this.window = 5;�� ����
	}
	Bus(int window){// �Ű����� �ִ� ������
		// super()�� �θ��� ������ ȣ���� �� ���!
		// ��� ������ �տ� super()�� �ۼ��Ǿ� ���� ������ �����Ϸ��� super();�� �߰��� �� !
		// ��, this()�� ������ super();�� �߰������� ����!
		super ("green"); // Car (); �� ����, (super�� ���� �����ڸ� ����)
		this.window = window; 
		}
	public String toString() {// �������̵�
		return "Bus Ŭ����";
	}
	void start() {// �������̵�: ����Ŭ�������� ���ǵ� �޼ҵ带 ����Ŭ�������� ������
		super.start();//super.�� ������ ����� ����
		System.out.println("���� ����մϴ�~");
	}
	//void busStart () {
		// super.�� �θ��� ��� ���ٽ� ��� !
		//System.out.println("n = "+ super.n);
		
		//System.out.println("���� ����մϴ�~");
//	}
	
	void busStop() {
		System.out.println("���� ����ϴ�~");
	}
}
