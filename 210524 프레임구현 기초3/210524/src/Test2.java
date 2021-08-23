import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����

public class Test2 extends Frame{

	Label location; // ��� ����
	
	Test2(String title){
		super(title);
		//                   Font �κ�                               // 
		Font f1 = new Font("Serif", Font.BOLD,20);
		//                   Color �κ�                           //
		Color c1 = new Color(0,64,128);
		
		//                    Frame �κ�                                    //
		this.setBounds(500,300,500,400);
		this.setLayout(null); // ������ ���̾ƿ� ��� ���� (���� ��ǥ �� ���)
		this.setBackground(Color.LIGHT_GRAY);
		
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				System.exit(0); // ���α׷� ����
			}
		});
		/************ label �κ� *********/
		location = new Label("Mouse Pointer Location: ");
		location.setBounds(10,30,300,20);
		location.setBackground(Color.white);
		location.setFont(f1);
		location.setForeground(c1);
		//                 ���콺 �̺�Ʈ ó�� �κ�                              //
		addMouseMotionListener(new EventC()); {
			
				
			}
		
		 
		/************ �����ӿ� ������Ʈ ���̴� �κ� ***************/
		add(location);
		
		
		setVisible(true);
	}
	
	// ���� Ŭ������ EventC Ŭ���� �ۼ�
	// ���� Ŭ������ ����ϸ� �ܺ� Ŭ������ ��� ���� ����!
	class EventC implements MouseMotionListener{

		
		public void mouseDragged(MouseEvent e) {
			System.out.println("(" + e.getX() + " ," + e.getY() +")");
		}
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location: (" + e.getX() + " ," + e.getY() +")");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test2("Mouse Event Test");

	}

}
