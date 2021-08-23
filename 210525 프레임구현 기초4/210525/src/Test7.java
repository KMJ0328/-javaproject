import java.awt.*;
import java.awt.event.*;

public class Test7 extends Frame {
	Image sol,img;
	Test7(String title){
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-200,screenSize.height/2-150,400,300);
		img = tk.getImage("images/java.jpg");
		sol = tk.getImage("sol.jpg");
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				System.exit(0); // ���α׷� ����
			}
		});
		
		
		
		
		
		
		
		
		setVisible(true);
	}
	
	public void paint(Graphics g){
		int imgWidth,imgHeight;
		
		if(img == null){
			return;
		}
		
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);
		
		g.drawImage(img,(getWidth()-imgWidth)/2,(this.getHeight()-imgHeight)/2,this);
	}
	
	
	public static void main(String[] args) {
		new Test7("�̹��� ���̱�");

	}

}
