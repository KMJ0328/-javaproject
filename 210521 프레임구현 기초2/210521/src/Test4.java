import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Test4 {
	public static void main(String[] args) {
		Frame f = new Frame("�޴� ����� ����");
		f.setBackground(Color.orange);
		f.setBounds(500,300,500,300);
		
		MenuBar mb = new MenuBar();//�޴��� ��ü ����
		
		Menu mfile = new Menu("����");//�޴� ��ü ����
		MenuItem miOpen = new MenuItem("����");
		Menu mOthers = new Menu("��Ÿ");
		MenuItem miPrint = new MenuItem("�μ�");
		MenuItem miPreview = new MenuItem("�̸�����");
		MenuItem miExit = new MenuItem("�ݱ�");
		
		//
		mfile.add(miOpen);
		mfile.addSeparator(); //����
		mfile.add(miExit);
		mfile.add(mOthers);
		mfile.add(miPreview);
		mfile.add(miPrint);
		
		
		
		Menu mhelp = new Menu("����");
		MenuItem miHelp = new MenuItem("����");
		CheckboxMenuItem mihelp2 = new CheckboxMenuItem("������2");
		mhelp.add(miHelp);
		mhelp.add(mihelp2);
		
		/*************************************/
		final PopupMenu pMenu = new PopupMenu(); // �˾��޴� ��ü ����
		MenuItem miCut = new MenuItem("�ڸ���");
		MenuItem miCopy = new MenuItem("�����ϱ�");
		
		Menu mMenu = new Menu("��Ÿ�޴�");
		MenuItem miMenu1 = new MenuItem("��Ÿ1");
		MenuItem miMenu2 = new MenuItem("��Ÿ2");
		
		
		pMenu.add(miCut);pMenu.add(miCopy);
		pMenu.add(mMenu);
		
		mMenu.add(miMenu1);mMenu.add(miMenu2);
		
		
		
		f.add(pMenu);
		
		f.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(me.getModifiers() == me.BUTTON3_MASK){
					pMenu.show(f, me.getX(), me.getY());
				}
			}
		});
		
		
		
		
		
		
		/****************************/
		//�޴��ٿ��� �޴��� add �� �� ����
		mb.add(mfile);mb.add(mhelp);
		
		//�����ӿ� �޴��� ���̱�
		f.setMenuBar(mb);
		
		f.setVisible(true);
		
	}

}
