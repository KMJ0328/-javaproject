import java.awt.*;
public class Test8 {

	public static void main(String[] args) {
		Frame f = new Frame("������Ʈ ������"); // �������� �����̳�!
		f.setBounds(500,300,1000,500);
		f.setBackground(Color.white);
		f.setLayout(null); // �������� �⺻���̾ƿ��� �������̾ƿ�(�������� ����)
		
		
		Choice day = new Choice(); // ���̽� ��ü ����
		day.add("������"); // item �߰���!
		day.add("ȭ����");
		day.add("������"); 
		day.add("�����"); 
		day.add("�ݿ���");
		day.add("�����");
		day.add("�Ͽ���"); 
		
		day.setLocation(50,100); // (50,50) ��ġ�� day�� ������!
		day.setSize(100,70); // �ʺ�, ���� ����
		
		Button ok = new Button("ok");
		ok.setBounds(200,100,150,150);
		ok.setBackground(Color.gray);
		ok.setForeground(Color.ORANGE);
		
		List list1 = new List();
		list1.add("����");
		list1.add("�Ƚ�");
		list1.add("���");
		list1.add("���");
		list1.add("������");
		list1.add("�Ұ��");
		list1.add("���긮��");
		list1.add("���ű��");
		
		list1.setBounds(400,100,150,150);
		
		List list2 = new List();
		list2.setMultipleMode(true); // ���� ����!
		list2.add("��ġ");
		list2.add("�ͻ��");
		list2.add("����");
		list2.add("�ұ���");
		list2.add("����");
		list2.add("����");
		list2.add("���߽�");
		list2.add("����");
		
		list2.setBounds(600,100,150,150);
		
		f.add(day); //�����ӿ� day(���̽�)�� ����!
		f.add(ok); //�����ӿ� ok(��ư)�� ����!
		f.add(list1); // �����ӿ� list1(����Ʈ,���ϼ���) �� ����!
		f.add(list2); // �����ӿ� list1(����Ʈ,���߼���) �� ����!
		
		f.setVisible(true);//������ ���̱�
	}

}
