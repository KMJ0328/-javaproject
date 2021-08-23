import java.awt.*;


public class Test3 {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout ����");
		f.setLayout(new GridLayout(3,1)); // 3��1��
		f.setBounds(100,100,500,700);
		
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,20);
		
		Panel p1 = new Panel(); // �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ �پ ǥ��
		p1.setLayout(null); // ��ǥ �� ���!
		p1.setBackground(Color.PINK);
		p1.setSize(200,200);
		
		Label label1 = new Label("����� �������� ������");
		label1.setBounds(50,50,400,100);
		label1.setBackground(Color.white);
		label1.setFont(new Font("Serif",Font.BOLD,20));
		label1.setForeground(Color.magenta);
		label1.setAlignment(Label.CENTER);
		
		Button b1 = new Button("Ȯ��1");
		Button b2 = new Button("Ȯ��2");
		
		b1.setBounds(50,160,190,50);
		b2.setBounds(260,160,190,50);
		
		Panel p2 = new Panel(); // �������� �����̳ʷ� �ٸ� ������ �� �����̳ʿ� �پ �پ ǥ��
		p2.setLayout(null); // ��ǥ �� ���!
		p2.setBackground(Color.green);
		p2.setSize(200,200);
		
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb5 = new Checkbox("A��",abc,true);
		Checkbox cb6 = new Checkbox("B��",abc,false);
		Checkbox cb7 = new Checkbox("O��",abc,false);
		Checkbox cb8 = new Checkbox("AB��",abc,false);
		cb5.setFont(f2);cb6.setFont(f2);cb7.setFont(f2);cb8.setFont(f2);
		cb5.setForeground(Color.red);cb6.setForeground(Color.red);
		cb7.setForeground(Color.red);cb8.setForeground(Color.red);
		
		cb5.setBounds(90,50,70,50);
		cb6.setBounds(170,50,70,50);
		cb7.setBounds(250,50,70,50);
		cb8.setBounds(330,50,70,50);
		
		Button b3 = new Button("Ȯ��");
	
		b3.setFont(f2);
		b3.setBounds(180,110,100,50);
		b3.setBackground(Color.WHITE);
		
		
		Panel p3 = new Panel(); // �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ �پ ǥ��
		p3.setLayout(null); // ��ǥ �� ���!
		p3.setBackground(Color.blue);
		p3.setSize(200,200);
		
		Label label2 = new Label("����� �������� ...");
		label2.setBounds(50,80,400,100);
		label2.setBackground(Color.white);
		label2.setFont(new Font("Serif",Font.BOLD,20));
		label2.setForeground(Color.BLUE);
		label2.setAlignment(Label.CENTER);
		
		//p1�� ������Ʈ ���̱�
		p1.add(label1);p1.add(b1);p1.add(b2);
		//p2�� ������Ʈ ���̱�
		p2.add(cb5);p2.add(cb6);p2.add(cb7);p2.add(cb8);
		p2.add(b3);
		//p3�� ������Ʈ ���̱�
		p3.add(label2);
		
		f.add(p1);f.add(p2);f.add(p3);
		f.setVisible(true);
	}

}
