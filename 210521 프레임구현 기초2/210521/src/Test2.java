import java.awt.*;


public class Test2 {
	public static void main(String[] args) {
		Frame f = new Frame("flowLayout ����"); // �������� �����̳�
		f.setLayout(new GridLayout(1,3)); // ��->����,��->�Ʒ�
		f.setBounds(400,300,600,500);
		f.setBackground(Color.ORANGE);
		
		
		Panel p1 = new Panel(); // �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ �پ ǥ��
		p1.setLayout(null); // ��ǥ �� ���!
		p1.setBackground(Color.PINK);
		p1.setSize(200,200);
		
		Panel p2 = new Panel(); // �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ �پ ǥ��
		p2.setLayout(null); // ��ǥ �� ���!
		p2.setBackground(Color.GREEN);
		p2.setSize(200,200);
		p2.setLayout(new GridLayout(2,2)); // 2�� 2���� ����
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		
		btn1.setSize(50,90);
		btn2.setSize(50,90);
		
		
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		
		
		
		Button b1 = new Button("��ư1");
		b1.setBackground(Color.yellow);
		b1.setBounds(50,50,100,50);
		
		Button b2 = new Button("��ư1");
		b2.setBackground(Color.yellow);
		b2.setBounds(50,50,100,50);
		
		
		p1.add(b1);

		
		
		
		f.add(p1); f.add(p2);f.add(b1);
		f.setVisible(true);
	}

}
 