import java.lang.*; // java.lang ��Ű�� ������ System,String,Object,Math...�����ִ�
					//�̰� �����Ϸ��� �ڵ����� �߰�����


// Ŭ���� ������ 1���̻��� �����ڰ� �־�� ��!
// ������ ���� ��쿡�� �����Ϸ��� �ڵ����� �⺻������ Car(){} �� �ڵ� �߰�!

// Object Ŭ������ �ڹٿ��� �ְ� ����Ŭ����

// abstract(�߻�) Ŭ������ 1�� �̻��� abstract(�߻�) �޼ҵ尡 �ִ� Ŭ������ �ǹ���!
// �߻�Ŭ������ ��ӹ������� ���� ! �����ؼ� ��� ��!

public class Car extends Object { // Car Ŭ���� ����
	String color;
	int door;
	boolean power;
	
	Car(){ // �⺻������
		this("black", 4, false);// Car(String,int,boolean); �� ���� �ٵ� �̰� ����ȵ�
		//this ()�� �� !! ù���忡 �;� ��!
	}
	Car(String color, int door, boolean power){ // �Ű����� �ִ� ������
		super(); // ���� Ŭ������ �⺻ �����ڸ� ȣ�� !
		this.color = color;
		this.door = door;
		this.power = power;
	}
	//abstract void method();// abstract(�߻�,����) �޼ҵ� ����
						   // �޼ҵ��� ����� �ְ�, �ٵ� ���� �� ~
	
	
	void powerOn(){
			power=true;
	}
	void powerOff(){
		power=false;
}
	void start() {
			System.out.println("����մϴ�~");
	}
	void stop(){
			System.out.println("����ϴ�~");
	}
}
