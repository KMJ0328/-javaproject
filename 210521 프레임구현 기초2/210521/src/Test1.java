import java.awt.*; // Awt ������Ʈ, �����̳� ����ϱ� ���ؼ� 


public class Test1 {
	public static void main(String[] args) {
		Frame f = new Frame("AWT ������");
		f.setLocation(400,300);//�������� ������ġ ����
		f.setSize(500,400);// �������� �ʺ�, ���� ����
		
		//Color c1 = new Color(0,100,255);
		f.setBackground(new Color(0,100,255));
		// �������� �⺻���̾ƿ��� �������̾ƿ�(��,��,��,��,�߾�)�̴�.
		f.setLayout(new BorderLayout(5,10));
		
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		Button b3 = new Button("��ư3");
		Button b4 = new Button("��ư4");
		Button b5 = new Button("��ư5");
		
		b1.setBackground(Color.DARK_GRAY);
		
		// �����ӿ� ������Ʈ ���̱�
		f.add(b1, "North");f.add("South",b2);f.add(b3,BorderLayout.EAST);f.add(BorderLayout.WEST,b4);f.add(b5,"center");
		
		
		f.setVisible(true);// ȭ�鿡 ������ ���̱�
		
		
	}

}
