import java.awt.*;
import java.awt.event.*;





public class Test5 extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	
	Test5(String title){
		super(title);
		
				// �������� ȭ�� �߾ӿ� ���̱�
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-250,500,500);
				this.setLayout(null);
				setBackground(Color.white);
				
				// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						System.exit(0); // ���α׷� ����
					}
				});
		
			
				
				
				
				
				
				
				
				
				
				//�����ӿ� ���콺 ������ ��� �̺�Ʈ ������(������) ���̱�
				this.addMouseMotionListener(this) ;
			
							setVisible(true);
	}
	
	public void paint(Graphics g){ // �������̵�
		g.setFont(f1);
		g.drawString("���콺�� ������ ������", 10, 60);
		g.drawString("�޷�", x, y);
	}
	// repaint()->update()->paint() ȣ�� ��!
	// �⺻ update()�� ȭ���� �����, paint()�� ȣ���ϴ� �޼ҵ���!
	public void update(Graphics g){ // �������̵�
		paint(g);
	}
	
	
	
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		repaint(); // repaint()->update()->paint() ȣ�� ��!
	}
	
	public static void main(String[] args) {
		new Test5("�׷��� ����2");

	}


}
