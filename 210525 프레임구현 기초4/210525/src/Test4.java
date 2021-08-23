import java.awt.*;
import java.awt.event.*;



public class Test4 extends Frame{
	Panel p1;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Test4(String title){
		
		super(title);
		
		// 프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-200,screenSize.height/2-150,400,300);
		this.setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
			public void windowClosing(WindowEvent e) { // 오버라이딩
				System.exit(0); // 프로그램 종료
			}
		});
		
		
		
		
		
		
		
		setVisible(true);
	}
	// paint() 자동호출 시기
	// 1. 처음 화면에 나타날 때
	// 2. 다른 화면에 가려졌다가 다시 나올 때
	// 3. 최소화->원래 크기로 다시 나타날 때
	
	public void paint(Graphics g){ // 오버라이딩
		g.setFont(f1);
		g.drawString("hello java", 50, 100);
		g.setColor(Color.green);
		g.drawLine(50, 150, 100, 200);
	//	g.fillRoundRect(200, 150, 100, 100, 50, 50);
		g.fillPolygon(new int[]{200,250,230,200},
					  new int[]{150,170,220,170},4); // 다각형 설정 x1,y1,x2,y2
		 											 //         x3,y3,x4,y4   
	}
	
	public static void main(String[] args) {
		new Test4("그래픽 연습");

	}

}
