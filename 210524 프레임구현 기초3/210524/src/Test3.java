import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����


public class Test3 extends Frame{
	Checkbox cb1,cb2,cb3;
	CheckboxGroup group;
	Button b1;
	
	Test3(String title){
		super(title);
		this.setBounds(500,300,500,400);
		this.setLayout(new FlowLayout(FlowLayout.LEFT)); // �������,�¿�,���Ʒ� ���� 5 ����
		this.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						System.exit(0); // ���α׷� ����
					}
				});
				//                    Checkbox �κ�                                    //
				group = new CheckboxGroup(); // üũ�ڽ� �׷� ��ü ����
				cb1 = new Checkbox("red",group, true);
				cb2 = new Checkbox("green",group, false);
				cb3 = new Checkbox("blue",group, false);
				
				cb1.addItemListener(new EventD());
				cb2.addItemListener(new EventD());
				cb3.addItemListener(new EventD());
				
				
		this.setVisible(true);
		
		
		//                 �����ӿ� ������Ʈ ���̱�                                             //
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
	}
	// üũ�ڽ� cb1,cb2,cb3�� üũ�ϰų� ���������� ó���ϴ� Ŭ����
	class EventD implements ItemListener{

		
		public void itemStateChanged(ItemEvent e) {
			System.out.println("üũ�ڽ� �̺�Ʈ��..");
			Checkbox cb = (Checkbox)e.getSource();
			String color = cb.getLabel();
			
			if(color.equals("red")){setBackground(Color.red);
				cb1.setBackground(Color.red);
				cb2.setBackground(Color.red);
				cb3.setBackground(Color.red);
				System.out.println(color+" �� �����ϼ̽��ϴ�.");
			}
			else if(color.equals("green")){setBackground(Color.green);
			cb1.setBackground(Color.green);
			cb2.setBackground(Color.green);
			cb3.setBackground(Color.green);
			System.out.println(color+" �� �����ϼ̽��ϴ�.");}
			
			else if(color.equals("blue")){setBackground(Color.blue);
			cb1.setBackground(Color.blue);
			cb2.setBackground(Color.blue);
			cb3.setBackground(Color.blue);
			System.out.println(color+" �� �����ϼ̽��ϴ�.");}
		}
		
	}
	

	public static void main(String[] args) {
		new Test3("Checkbox Event");

	}

}
