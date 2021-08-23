import java.awt.*; // 컨테이너, 컨포넌트 이용하기 위해

public class Test7 {
	public static void main(String[] args) {
		Frame f = new Frame("솔이 그녀의 집은 이촌2동..."); // 프레임 객체 생성
		
		
		//f.setSize(400,300); // 프레임의 너비, 높이 설정!
		//f.setLocation(500,200); // 프레임의 시작 위치(x,y) 설정!
		f.setBounds(500,200,400,300); // 시작 위치(x,y)와 너비,높이 설정!
		f.setBackground(Color.CYAN); // 프레임 배경색 설정!
		f.setLayout(null); //기본 레이아웃 안쓰고 직접 좌표로 위치시킴!
		//f.setTitle("야 꿀 벌");
		//String str = f.getTitle();
		//System.out.println("제목표시줄의 내용은 " + str + " 입니다.");
		
		Button b1 = new Button("      버튼을 누르면 이촌2동으로 갑니다.....");
		b1.setBounds(70,80,110,140);
		b1.setBackground(Color.orange);//배경색
		b1.setForeground(Color.BLUE); // 전경색(글자색)
		
		Button b2 = new Button("그녀에게 문자보내기");
		b2.setBounds(230,80,110,140);
		b2.setBackground(Color.orange);
		
		//프레임에 컴포넌트 붙이기
		f.add(b1);
		f.add(b2);
		
		f.setVisible(true);// 프레임 보이기
		
	
	}

}
	 