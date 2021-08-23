import java.awt.*;
import java.awt.event.*;





public class Test3 extends Frame {
	TextField tf; // �� �ٷ� �Է��� ��
	Label money,result;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Font f2 = new Font("Serif",Font.BOLD+Font.ITALIC, 50);
	Panel p1;
	
	Test3(String title){
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-350,screenSize.height/2-250,700,500);
				this.setLayout(null);
				setBackground(Color.DARK_GRAY);
				
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						System.exit(0); // ���α׷� ����
					}
				});
				//              label �κ� //
		money = new Label("���� �Է��ϼ���");
		money.setBackground(Color.DARK_GRAY);
		money.setForeground(Color.white);
		money.setAlignment(Label.CENTER);
		money.setFont(f1);
		//      TextField tf �κ�                                          //
		tf = new TextField(""); // 1. �̺�Ʈ �ҽ�
		tf.addActionListener(new EventMoney());
		tf.setBackground(Color.ORANGE);
		tf.setFont(f2);
		//     result label �κ�//
		result = new Label("");
		result.setBackground(Color.green);
		result.setAlignment(Label.CENTER);
		result.setFont(f1);
		// panel �κ�
		p1 = new Panel();
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(new GridLayout(3,1));
		p1.setBounds(200,100,300,200);
		p1.add(money);
		p1.add(tf);
		p1.add(result);
				
		
		
		
		
		
		
		add(p1);
		
		setVisible(true);
	}
	
	class EventMoney implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			result.setText(tf.getText() + "��");
	         tf.requestFocus();
	         tf.selectAll();
	         tf.setText("");
	        
			result.setForeground(Color.black);
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test3("money");

	}

}
