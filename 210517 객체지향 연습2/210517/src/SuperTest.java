class Parent {
	int x = 10;
	
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x = "+ x); //20
		System.out.println("this.x = "+ this.x); // 20
		System.out.println("super.x = "+ super.x); // 10
	}
}

public class SuperTest {
	public static void main(String[] args) {
		//Parent p1 = new Parent();
		Child c1 = new Child();
		c1.method();
	}

}
