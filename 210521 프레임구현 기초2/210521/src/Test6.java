import java.awt.*;// AWT ������Ʈ ����ϱ� ���ؼ� �� �ֱ�
import java.awt.event.*;// �̺�Ʈ ó���ϱ� ���ؼ� �� �ֱ�


class Event1 implements WindowListener { // 3. �̺�Ʈ ó����
	
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �����մϴ�.");
		e.getWindow().setVisible(false);// ȭ�鿡�� �Ⱥ��̱�
		e.getWindow().dispose();// �޸𸮿��� ����
		System.exit(0);// ���α׷� ����
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
class Event2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �����մϴ�.");
		System.exit(0);// ���α׷� ����
	}
}


public class Test6 {

	public static void main(String[] args) {
		Frame f = new Frame("�̺�Ʈ ó��");// 1. �̺�Ʈ �ҽ� (���)
		f.setBounds(500,300,500,400);
		f.setBackground(Color.ORANGE);
		
		Event1 ee = new Event1();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);// ���α׷� ����
			}
		}); // 2. ������(������)
		
		
		
		
		
		f.setVisible(true);
	}

}
