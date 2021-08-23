import java.awt.*;
import java.awt.event.*;
public class Test5 {

	public static void main(String[] args) {
		final Frame f = new Frame("Popup Menu Test");
		f.setBounds(500,300,500,500);
		f.setBackground(Color.pink);
		
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
		
		f.setVisible(true);
	}

}
