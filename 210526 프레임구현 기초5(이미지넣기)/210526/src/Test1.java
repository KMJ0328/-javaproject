import java.awt.*;

import java.awt.event.*;


public class Test1 extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Canvas c1,c2,c3;
	Panel p1; 
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	//Image img1 �κ�
	Image img = tk.getImage("images/help.jpg");
	Image im1,img2,img3;
	//Image img1 = tk.getImage("images/img2.gif");
	//Image img2 = tk.getImage("images/img2.gif");
	//Image img3 = tk.getImage("images/img3.gif");
	Button b1,b2,b3,b4;
	
	Test1(String title){ 
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
				
				
				setBounds((screenSize.width)/2-350, 
						(screenSize.height)/2-350, 700, 700);
				setLayout(null);
				// �ݱ�x ��ư �̺�Ʈ ó��
				addWindowListener(new WindowAdapter() { 
					public void windowClosing(WindowEvent e) { 
						System.exit(0); // ���α׷� ���� 
					}
				});
			
		
				//Canvas �κ�
		c1 = new Canvas(){
			public void paint(Graphics g){
				g.drawImage(img,0,0,this);
			}
		};
		c1.setBackground(Color.white);
		c1.setBounds(50,50,360,360);
		//c1.repaint();
		
				// ��ư �κ�
		
		b1 = new Button("��ư1");
		b1.addActionListener(new EventCanvas());
		b1.setBackground(Color.GREEN);
		b1.setFont(f1);
		b2 = new Button("��ư2");
		b2.addActionListener(new EventCanvas());
		b2.setBackground(Color.GREEN);
		b2.setFont(f1);
		b3 = new Button("��ư3");
		b3.addActionListener(new EventCanvas());
		b3.setBackground(Color.GREEN);
		b3.setFont(f1);
		b4 = new Button("���� �̹���");
		b4.addActionListener(new EventCanvas());
		b4.setBackground(Color.GREEN);
		b4.setFont(f1);
		
		
				// Panel �κ�
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(300,50,360,360);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		// �����ӿ� ������Ʈ,�����̳� ���̱�
	    add(c1);add(p1);
	
		setVisible(true);
	}
	
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			int r = (int)(Math.random()*3);
			String imgArr[] = {"images/img1.gif","images/img2.gif","images/img3.gif"};
			
			if(b.getLabel() == "��ư1"){
			//    img = tk.getImage("images/img1.gif");
				img = tk.getImage(imgArr[0]);
				c1.repaint(); 
			}else if(b.getLabel() == "��ư2"){
			//    img = tk.getImage("images/img2.gif");
				img = tk.getImage(imgArr[1]);
				c1.repaint();
			}else if(b.getLabel() == "��ư3"){
			//	img = tk.getImage("images/img3.gif");
				img = tk.getImage(imgArr[2]);
				c1.repaint();
			}else {
				img = tk.getImage(imgArr[r]);
				c1.repaint();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Test1("Canvas ����");

	}

}
