import java.awt.*;
import java.awt.event.*;





public class Test3 extends Frame {
	TextField tf; // 한 줄로 입력할 때
	Label money,result;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Font f2 = new Font("Serif",Font.BOLD+Font.ITALIC, 50);
	Panel p1;
	
	Test3(String title){
		super(title);
		
		// 프레임을 화면 중앙에 보이기
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-350,screenSize.height/2-250,700,500);
				this.setLayout(null);
				setBackground(Color.DARK_GRAY);
				
		// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						System.exit(0); // 프로그램 종료
					}
				});
				//              label 부분 //
		money = new Label("돈을 입력하세요");
		money.setBackground(Color.DARK_GRAY);
		money.setForeground(Color.white);
		money.setAlignment(Label.CENTER);
		money.setFont(f1);
		//      TextField tf 부분                                          //
		tf = new TextField(""); // 1. 이벤트 소스
		tf.addActionListener(new EventMoney());
		tf.setBackground(Color.ORANGE);
		tf.setFont(f2);
		//     result label 부분//
		result = new Label("");
		result.setBackground(Color.green);
		result.setAlignment(Label.CENTER);
		result.setFont(f1);
		// panel 부분
		p1 = new Panel();
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(new GridLayout(3,1));
		p1.setBounds(200,100,300,200);
		p1.add(money);
		p1.add(tf);
		p1.add(result);
				
		
		
		
		
		
		
		add(p1);
		
		setVisible(true);
	}
	
	class EventMoney implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			result.setText(tf.getText() + "원");
	         tf.requestFocus();
	         tf.selectAll();
	         tf.setText("");
	        
			result.setForeground(Color.black);
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test3("money");

	}

}
