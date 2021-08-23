import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해

public class Test2 extends Frame{

	Label location; // 멤버 변수
	
	Test2(String title){
		super(title);
		//                   Font 부분                               // 
		Font f1 = new Font("Serif", Font.BOLD,20);
		//                   Color 부분                           //
		Color c1 = new Color(0,64,128);
		
		//                    Frame 부분                                    //
		this.setBounds(500,300,500,400);
		this.setLayout(null); // 프레임 레이아웃 사용 안함 (직접 좌표 찍어서 사용)
		this.setBackground(Color.LIGHT_GRAY);
		
		
		// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
			public void windowClosing(WindowEvent e) { // 오버라이딩
				System.exit(0); // 프로그램 종료
			}
		});
		/************ label 부분 *********/
		location = new Label("Mouse Pointer Location: ");
		location.setBounds(10,30,300,20);
		location.setBackground(Color.white);
		location.setFont(f1);
		location.setForeground(c1);
		//                 마우스 이벤트 처리 부분                              //
		addMouseMotionListener(new EventC()); {
			
				
			}
		
		 
		/************ 프레임에 컨포넌트 붙이는 부분 ***************/
		add(location);
		
		
		setVisible(true);
	}
	
	// 내부 클래스로 EventC 클래스 작성
	// 내부 클래스를 사용하면 외부 클래스의 멤버 접근 가능!
	class EventC implements MouseMotionListener{

		
		public void mouseDragged(MouseEvent e) {
			System.out.println("(" + e.getX() + " ," + e.getY() +")");
		}
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location: (" + e.getX() + " ," + e.getY() +")");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test2("Mouse Event Test");

	}

}
