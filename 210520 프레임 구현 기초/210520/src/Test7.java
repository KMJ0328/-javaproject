import java.awt.*; // �����̳�, ������Ʈ �̿��ϱ� ����

public class Test7 {
	public static void main(String[] args) {
		Frame f = new Frame("���� �׳��� ���� ����2��..."); // ������ ��ü ����
		
		
		//f.setSize(400,300); // �������� �ʺ�, ���� ����!
		//f.setLocation(500,200); // �������� ���� ��ġ(x,y) ����!
		f.setBounds(500,200,400,300); // ���� ��ġ(x,y)�� �ʺ�,���� ����!
		f.setBackground(Color.CYAN); // ������ ���� ����!
		f.setLayout(null); //�⺻ ���̾ƿ� �Ⱦ��� ���� ��ǥ�� ��ġ��Ŵ!
		//f.setTitle("�� �� ��");
		//String str = f.getTitle();
		//System.out.println("����ǥ������ ������ " + str + " �Դϴ�.");
		
		Button b1 = new Button("      ��ư�� ������ ����2������ ���ϴ�.....");
		b1.setBounds(70,80,110,140);
		b1.setBackground(Color.orange);//����
		b1.setForeground(Color.BLUE); // �����(���ڻ�)
		
		Button b2 = new Button("�׳࿡�� ���ں�����");
		b2.setBounds(230,80,110,140);
		b2.setBackground(Color.orange);
		
		//�����ӿ� ������Ʈ ���̱�
		f.add(b1);
		f.add(b2);
		
		f.setVisible(true);// ������ ���̱�
		
	
	}

}
	 