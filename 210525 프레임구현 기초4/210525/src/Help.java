import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;


public class Help extends Frame{
	Image sol,img = null;
	
	Help(String title){
		super(title);
		this.setIconImage(new ImageIcon("images/icon.jpg").getImage());
		
		// �������� ȭ�� �߾ӿ� ���̱�
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-350,screenSize.height/2-350,700,700);
				img = tk.getImage("images/help.jpg");
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
		
		g.drawImage(img,0,0,this);
	}
	
	public static void main(String[] args) {
		new Help("����");
	}

}
