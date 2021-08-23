import java.awt.*;
import java.awt.event.*;
public class Test5 {

	public static void main(String[] args) {
		final Frame f = new Frame("Popup Menu Test");
		f.setBounds(500,300,500,500);
		f.setBackground(Color.pink);
		
		final PopupMenu pMenu = new PopupMenu(); // 팝업메뉴 객체 생성
		MenuItem miCut = new MenuItem("자르기");
		MenuItem miCopy = new MenuItem("복사하기");
		
		Menu mMenu = new Menu("기타메뉴");
		MenuItem miMenu1 = new MenuItem("기타1");
		MenuItem miMenu2 = new MenuItem("기타2");
		
		
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
