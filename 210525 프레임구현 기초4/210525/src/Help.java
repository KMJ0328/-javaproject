import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;


public class Help extends Frame{
	Image sol,img = null;
	
	Help(String title){
		super(title);
		this.setIconImage(new ImageIcon("images/icon.jpg").getImage());
		
		// 프레임을 화면 중앙에 보이기
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-350,screenSize.height/2-350,700,700);
				img = tk.getImage("images/help.jpg");
				sol = tk.getImage("sol.jpg");
				
				// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						System.exit(0); // 프로그램 종료
					}
				});
		
		
		
		
		
		
		setVisible(true);
		
	
	}
	
	public void paint(Graphics g){
		int imgWidth,imgHeight;
		
		if(img == null){
			return;
		}
		
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);
		
		g.drawImage(img,0,0,this);
	}
	
	public static void main(String[] args) {
		new Help("도움말");
	}

}
