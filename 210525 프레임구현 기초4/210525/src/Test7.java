import java.awt.*;
import java.awt.event.*;

public class Test7 extends Frame {
	Image sol,img;
	Test7(String title){
		super(title);
		
		// 프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-200,screenSize.height/2-150,400,300);
		img = tk.getImage("images/java.jpg");
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
		
		g.drawImage(img,(getWidth()-imgWidth)/2,(this.getHeight()-imgHeight)/2,this);
	}
	
	
	public static void main(String[] args) {
		new Test7("이미지 보이기");

	}

}
