import java.awt.*; // Awt 컴포넌트, 컨테이너 사용하기 위해서 


public class Test1 {
	public static void main(String[] args) {
		Frame f = new Frame("AWT 연습중");
		f.setLocation(400,300);//프레임의 시작위치 설정
		f.setSize(500,400);// 프레임의 너비, 높이 설정
		
		//Color c1 = new Color(0,100,255);
		f.setBackground(new Color(0,100,255));
		// 프레임은 기본레이아웃이 보더레이아웃(동,서,남,북,중앙)이다.
		f.setLayout(new BorderLayout(5,10));
		
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		Button b4 = new Button("버튼4");
		Button b5 = new Button("버튼5");
		
		b1.setBackground(Color.DARK_GRAY);
		
		// 프레임에 컴포넌트 붙이기
		f.add(b1, "North");f.add("South",b2);f.add(b3,BorderLayout.EAST);f.add(BorderLayout.WEST,b4);f.add(b5,"center");
		
		
		f.setVisible(true);// 화면에 프레임 보이기
		
		
	}

}
