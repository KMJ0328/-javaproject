




public class Car extends Object { // Car Ŭ���� ����
	String color ; // �������(�ʱⰪ ������ �⺻ null���� ����),�ν��Ͻ� ����
	int door ; //1. ����� �ʱ�ȭ ��� 
	
	
	Car(){ // �⺻ ������
		this("black"); // this()�� �ٸ� ������ ȣ��, ù ���忡 �ۼ�
		door = 4;
	}
	Car(String color){ // �Ű����� �ִ� ������
		super(); // ������ �⺻ ������ Object(); ȣ��
		this.color = color; // this.�� ��ü �ڽ��� �ּ�
		this.door = 3;
	}
	
	public String toString() {// �������̵�
		return "Bus Ŭ����";
	}
	
	void start(){ // ����޼ҵ�, �ν��Ͻ� �޼ҵ�
	System.out.println("����մϴ�~");
	}
	void stop(){
	System.out.println("����ϴ�~");
	}
}
