




public class Car2 { // Car Ŭ���� ����
	String color = "pink"; // �������(�ʱⰪ ������ �⺻ null���� ����),�ν��Ͻ� ����
	int door = 10; //1. ����� �ʱ�ȭ ��� 
	//3. �ʱ�ȭ ���� �̿��� ���!
	//3-1. �ν��Ͻ� �ʱ�ȭ �� { }
	// ��ü(�ν��Ͻ�) �����ø��� ȣ���, ������ ���� ���� ȣ�� 
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ���Դϴ�.");
	}
	//3-2. Ŭ���� �ʱ�ȭ �� { }
	//Ŭ���� �ε��Ǵ� ���� �� 1ȸ ȣ�� ��! (���α׷� ���۽�)
	static {
		System.out.println("Ŭ���� �ʱ�ȭ ���Դϴ�."); // 0
	}
	
	
	Car2(){ // 2. ������ �ʱ�ȭ ���, �⺻������
		this("black"); // Car("black");�� ������ this();�� ����ؾ� ��!!
						  // ù ���忡 �ۼ��� �� ��!
						  // ���� ���� Ŭ������ �ٸ� ������ ȣ��!
		door = 4;
		System.out.println("�⺻ ������ �Դϴ�.");
	}
	
	
	
	Car2(String color){ // �Ű����� �ִ� ������
		this.color = color; // this.�� ��ü �ڽ��� �ּ�
		door = 3;
		System.out.println("Car(String) ������ �Դϴ�.");
	}
	Car2(String color,int door){ // �Ű����� �ִ� ������
		this.color = color; // this.�� ��ü �ڽ��� �ּ�
		this.door = door;
		System.out.println("Car(String ,int ) ������ �Դϴ�.");
	}
	Car2(Car2 c){ // �Ű����� �ִ� ������
		this(c.color,c.door);
		//this.color = c.color;
		//this.door = c.door;
		System.out.println("Car(Car) ������ �Դϴ�.");
	}
	
	void start(){ // ����޼ҵ�, �ν��Ͻ� �޼ҵ�
	System.out.println("����մϴ�~");
	}
	void stop(){
	System.out.println("����ϴ�~");
	}
}
