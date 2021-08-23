import java.awt.*;


public class Test10 {
	public static void main(String[] args) {
		Frame f = new Frame("혈액형 선택");
		f.setBounds(500,300,400,300);
		f.setLayout(null);
		
		Color c1 = new Color(170,216,253);
		f.setBackground(c1);
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC,20);
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,20);
		
		Label label1 = new Label("당신의 혈액형을 고르세요.");
		Label label2 = new Label("당신의 취미를 고르세요.");
		
		label1.setBounds(50,50,400,50);
		label1.setFont(f1);
		label1.setForeground(new Color(0,64,128));
		
		label2.setBounds(50,150,400,50);
		label2.setFont(f2);
		label2.setForeground(new Color(0,64,128));
		
		
		
		
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("A형",abc,true);
		Checkbox cb2 = new Checkbox("B형",abc,false);
		Checkbox cb3 = new Checkbox("O형",abc,false);
		cb3.setBackground(c1);
		cb3.setFont(f1);
		Checkbox cb4 = new Checkbox("AB형",abc,false);
		
		cb1.setBounds(50,100,70,50);
		cb2.setBounds(130,100,70,50);
		cb3.setBounds(210,100,70,50);
		cb4.setBounds(280,100,70,50);
		
		
		Checkbox cb5 = new Checkbox("게임",abc,true);
		Checkbox cb6 = new Checkbox("산책",abc,false);
		Checkbox cb7 = new Checkbox("독서",abc,false);
		Checkbox cb8 = new Checkbox("TV시청",abc,false);
		
		
		cb5.setBounds(50,200,70,50);
		cb6.setBounds(130,200,70,50);
		cb7.setBounds(210,200,70,50);
		cb8.setBounds(280,200,70,50);
		
		//프레임에 컴포넌트 붙이기
		f.add(cb1); f.add(cb5);
		f.add(cb2); f.add(cb6);
		f.add(cb3); f.add(cb7);
		f.add(cb4); f.add(cb8);
		f.add(label1); f.add(label2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
