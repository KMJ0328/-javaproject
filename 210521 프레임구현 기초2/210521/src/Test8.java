import java.awt.*;
import java.awt.event.*;

public class Test8 extends Frame {
	Label lid, lpw;
	TextField tfid,tfpw;
	Button ok;
	
	Test8(){// �⺻������ ����
		super("�α��� �̺�Ʈ ����"); // Frame("�α��� �̺�Ʈ ����"); //������ ���� ǥ����
		lid = new Label("ID : ");
		lid.setAlignment(Label.RIGHT);
		lpw = new Label("Password : ", Label.RIGHT);
		tfid = new TextField(10);// ���ڼ� ����
		tfid.setBackground(Color.yellow);
		tfpw = new TextField(10);// ���ڼ� ����
		tfpw.setEchoChar('*');
		ok = new Button("Ȯ��");
		
		this.setLayout(new FlowLayout());
		this.setBounds(500,300,400,80);
		this.setBackground(Color.ORANGE);
		this.setResizable(false);
		
		tfid.addActionListener(new Event4());
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		
		/// ������(������) �ݱ� x ��ư ������ �� �̺�Ʈ ó��!
		this.addWindowListener(new WindowAdapter(){ // ������ �ݱ� �̺�Ʈ
			public void windowClosing(WindowEvent e){System.exit(0);}});// ���α׷� ����
		this.add(lid);this.add(tfid);
		this.add(lpw);this.add(tfpw);
		this.add(ok);
		setVisible(true);
	}// �⺻������ ����
	public static void main(String[] args) {
		Test8 t =   new Test8();
	}// main ����
	class Event4 implements ActionListener{// ����Ŭ���� ���, TextField �Է��� ���� or Ȯ�ι�ư Ŭ���� �̺�Ʈ ó����
		public void actionPerformed(ActionEvent arg0) {
			String id = tfid.getText();
			String password = tfpw.getText();
			if(!id.equals("admin")){ // id�� admin�� �ƴϸ� ��!
				System.out.println("��ȿ���� ���� id �Դϴ�.");
				tfid.requestFocus(); // tfid�� ��Ŀ�� (���콺Ŀ��) �ű� 
				tfid.selectAll(); // tfid ��ü �����ؼ� �ٽ� �Է½� ��������..
			}else if(!password.equals("1234")){ // pw�� admin�� �ƴϸ� ��!
				System.out.println("��ȿ���� ���� password �Դϴ�.");
				tfpw.requestFocus(); // tfpw�� ��Ŀ�� (���콺Ŀ��) �ű� 
				tfpw.selectAll(); // tfpw ��ü �����ؼ� �ٽ� �Է½� ��������..
			}else {// id, password �� ������ ����!
				System.out.println(id+"��, ȯ���մϴ�.");
			}
		} 
	}

}//Test8 Ŭ���� ����
