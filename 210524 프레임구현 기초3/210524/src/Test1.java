import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해

class EventA implements WindowListener{ // 3. 이벤트처리기(프레임의 x버튼 누를 때 처리되는 클래스)
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("프레임을 종료합니다."); 
		System.exit(0); // 프로그램 종료
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}

// 2개 이상의 추상메소드를 가지고 있는 인터페이스느 미리 Adapter 클래스로 구현되어 있기 때문에
// Adapter 클래스를 상속 받아서 원하는 콜백메소드만 오버라이딩 하면 됨!
class EventB extends WindowAdapter{
	public void windowClosing(WindowEvent e) { // 오버라이딩
		System.exit(0); // 프로그램 종료
	}
}
public class Test1 extends Frame{
	Button b1;
	Test1 (String title){ // 생성자는 멤버 변수 초기화 담당!
		super("title"); // 1. 이벤트 소스 (대상)-Frame
		b1 = new Button("확인");
		//this.addWindowListener(new EventB()); // 2. 이벤트 리스너 (감지기)
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
	public void windowClosing(WindowEvent e) { // 오버라이딩
		System.exit(0); // 프로그램 종료
	}
});
		setBounds(500,300,500,400); // 프레임의 시작위치(500,300),너비와 높이 설정!	 
		this.setVisible(true); // 화면에 프레임 보이기
	}
	public static void main(String[] args) {
		new Test1 ("이벤트 처리 연습중");
		
		
	}

}
