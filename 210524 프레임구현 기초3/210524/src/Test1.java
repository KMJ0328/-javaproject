import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����

class EventA implements WindowListener{ // 3. �̺�Ʈó����(�������� x��ư ���� �� ó���Ǵ� Ŭ����)
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("�������� �����մϴ�."); 
		System.exit(0); // ���α׷� ����
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}

// 2�� �̻��� �߻�޼ҵ带 ������ �ִ� �������̽��� �̸� Adapter Ŭ������ �����Ǿ� �ֱ� ������
// Adapter Ŭ������ ��� �޾Ƽ� ���ϴ� �ݹ�޼ҵ常 �������̵� �ϸ� ��!
class EventB extends WindowAdapter{
	public void windowClosing(WindowEvent e) { // �������̵�
		System.exit(0); // ���α׷� ����
	}
}
public class Test1 extends Frame{
	Button b1;
	Test1 (String title){ // �����ڴ� ��� ���� �ʱ�ȭ ���!
		super("title"); // 1. �̺�Ʈ �ҽ� (���)-Frame
		b1 = new Button("Ȯ��");
		//this.addWindowListener(new EventB()); // 2. �̺�Ʈ ������ (������)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
	public void windowClosing(WindowEvent e) { // �������̵�
		System.exit(0); // ���α׷� ����
	}
});
		setBounds(500,300,500,400); // �������� ������ġ(500,300),�ʺ�� ���� ����!	 
		this.setVisible(true); // ȭ�鿡 ������ ���̱�
	}
	public static void main(String[] args) {
		new Test1 ("�̺�Ʈ ó�� ������");
		
		
	}

}
