import java.awt.*;


public class Test3 {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout 연습");
		f.setLayout(new GridLayout(3,1)); // 3행1열
		f.setBounds(100,100,500,700);
		
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,20);
		
		Panel p1 = new Panel(); // 종속적인 컨테이너로 다른 독립적인 컨테이너에 붙어서 붙어서 표현
		p1.setLayout(null); // 좌표 찍어서 사용!
		p1.setBackground(Color.PINK);
		p1.setSize(200,200);
		
		Label label1 = new Label("당신의 혈액형을 고르세요");
		label1.setBounds(50,50,400,100);
		label1.setBackground(Color.white);
		label1.setFont(new Font("Serif",Font.BOLD,20));
		label1.setForeground(Color.magenta);
		label1.setAlignment(Label.CENTER);
		
		Button b1 = new Button("확인1");
		Button b2 = new Button("확인2");
		
		b1.setBounds(50,160,190,50);
		b2.setBounds(260,160,190,50);
		
		Panel p2 = new Panel(); // 종속적인 컨테이너로 다른 독립적 인 컨테이너에 붙어서 붙어서 표현
		p2.setLayout(null); // 좌표 찍어서 사용!
		p2.setBackground(Color.green);
		p2.setSize(200,200);
		
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb5 = new Checkbox("A형",abc,true);
		Checkbox cb6 = new Checkbox("B형",abc,false);
		Checkbox cb7 = new Checkbox("O형",abc,false);
		Checkbox cb8 = new Checkbox("AB형",abc,false);
		cb5.setFont(f2);cb6.setFont(f2);cb7.setFont(f2);cb8.setFont(f2);
		cb5.setForeground(Color.red);cb6.setForeground(Color.red);
		cb7.setForeground(Color.red);cb8.setForeground(Color.red);
		
		cb5.setBounds(90,50,70,50);
		cb6.setBounds(170,50,70,50);
		cb7.setBounds(250,50,70,50);
		cb8.setBounds(330,50,70,50);
		
		Button b3 = new Button("확인");
	
		b3.setFont(f2);
		b3.setBounds(180,110,100,50);
		b3.setBackground(Color.WHITE);
		
		
		Panel p3 = new Panel(); // 종속적인 컨테이너로 다른 독립적인 컨테이너에 붙어서 붙어서 표현
		p3.setLayout(null); // 좌표 찍어서 사용!
		p3.setBackground(Color.blue);
		p3.setSize(200,200);
		
		Label label2 = new Label("당신의 혈액형은 ...");
		label2.setBounds(50,80,400,100);
		label2.setBackground(Color.white);
		label2.setFont(new Font("Serif",Font.BOLD,20));
		label2.setForeground(Color.BLUE);
		label2.setAlignment(Label.CENTER);
		
		//p1에 컨포넌트 붙이기
		p1.add(label1);p1.add(b1);p1.add(b2);
		//p2에 컨포넌트 붙이기
		p2.add(cb5);p2.add(cb6);p2.add(cb7);p2.add(cb8);
		p2.add(b3);
		//p3에 컨포넌트 붙이기
		p3.add(label2);
		
		f.add(p1);f.add(p2);f.add(p3);
		f.setVisible(true);
	}

}
