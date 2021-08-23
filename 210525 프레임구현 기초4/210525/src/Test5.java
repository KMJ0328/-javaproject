import java.awt.*;
import java.awt.event.*;





public class Test5 extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	
	Test5(String title){
		super(title);
		
				// 프레임을 화면 중앙에 보이기
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-250,500,500);
				this.setLayout(null);
				setBackground(Color.white);
				
				// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						System.exit(0); // 프로그램 종료
					}
				});
		
			
				
				
				
				
				
				
				
				
				
				//프레임에 마우스 움직일 경우 이벤트 리스너(감지기) 붙이기
				this.addMouseMotionListener(this) ;
			
							setVisible(true);
	}
	
	public void paint(Graphics g){ // 오버라이딩
		g.setFont(f1);
		g.drawString("마우스를 움직여 보세요", 10, 60);
		g.drawString("메롱", x, y);
	}
	// repaint()->update()->paint() 호출 됨!
	// 기본 update()는 화면을 지우고, paint()를 호출하는 메소드임!
	public void update(Graphics g){ // 오버라이딩
		paint(g);
	}
	
	
	
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		repaint(); // repaint()->update()->paint() 호출 됨!
	}
	
	public static void main(String[] args) {
		new Test5("그래픽 연습2");

	}


}
