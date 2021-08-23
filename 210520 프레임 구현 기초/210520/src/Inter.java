// 추상클래스: abstract 메소드가 1개 이상 있는 클래스
// 인터페이스: 멤버변수가 상수이고, 멤버메소드가 추상메소드임!
public interface Inter {
	int N = 10; // public static final int N= 10; 와 같음
	public static final int N2= 20;
	final int N3 = 30;
	
	void testMethod1();// abstract void testMethod1(); 와 같음
	public abstract void testMethod2();
	
}
