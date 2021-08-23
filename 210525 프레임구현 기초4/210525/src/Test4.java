import java.awt.*;
import java.awt.event.*;



public class Test4 extends Frame{
	Panel p1;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Test4(String title){
		
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-200,screenSize.height/2-150,400,300);
		this.setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				System.exit(0); // ���α׷� ����
			}
		});
		
		
		
		
		
		
		
		setVisible(true);
	}
	// paint() �ڵ�ȣ�� �ñ�
	// 1. ó�� ȭ�鿡 ��Ÿ�� ��
	// 2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ���� ��
	// 3. �ּ�ȭ->���� ũ��� �ٽ� ��Ÿ�� ��
	
	public void paint(Graphics g){ // �������̵�
		g.setFont(f1);
		g.drawString("hello java", 50, 100);
		g.setColor(Color.green);
		g.drawLine(50, 150, 100, 200);
	//	g.fillRoundRect(200, 150, 100, 100, 50, 50);
		g.fillPolygon(new int[]{200,250,230,200},
					  new int[]{150,170,220,170},4); // �ٰ��� ���� x1,y1,x2,y2
		 											 //         x3,y3,x4,y4   
	}
	
	public static void main(String[] args) {
		new Test4("�׷��� ����");

	}

}
