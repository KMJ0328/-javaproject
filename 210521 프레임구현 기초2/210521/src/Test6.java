import java.awt.*;// AWT 컨포넌트 사용하기 위해서 꼭 넣기
import java.awt.event.*;// 이벤트 처리하기 위해서 꼭 넣기


class Event1 implements WindowListener { // 3. 이벤트 처리기
	
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("프레임 종료합니다.");
		e.getWindow().setVisible(false);// 화면에서 안보이기
		e.getWindow().dispose();// 메모리에서 해제
		System.exit(0);// 프로그램 종료
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
class Event2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.out.println("프레임 종료합니다.");
		System.exit(0);// 프로그램 종료
	}
}


public class Test6 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리");// 1. 이벤트 소스 (대상)
		f.setBounds(500,300,500,400);
		f.setBackground(Color.ORANGE);
		
		Event1 ee = new Event1();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 프로그램 종료
			}
		}); // 2. 감지기(리스너)
		
		
		
		
		
		f.setVisible(true);
	}

}
