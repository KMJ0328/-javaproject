import java.awt.*;
public class Test8 {

	public static void main(String[] args) {
		Frame f = new Frame("컴포넌트 연습중"); // 프레임은 컨테이너!
		f.setBounds(500,300,1000,500);
		f.setBackground(Color.white);
		f.setLayout(null); // 프레임은 기본레이아웃은 보더레이아웃(동서남북 센터)
		
		
		Choice day = new Choice(); // 초이스 객체 생성
		day.add("월요일"); // item 추가함!
		day.add("화요일");
		day.add("수요일"); 
		day.add("목요일"); 
		day.add("금요일");
		day.add("토요일");
		day.add("일요일"); 
		
		day.setLocation(50,100); // (50,50) 위치에 day를 보여줌!
		day.setSize(100,70); // 너비, 높이 설정
		
		Button ok = new Button("ok");
		ok.setBounds(200,100,150,150);
		ok.setBackground(Color.gray);
		ok.setForeground(Color.ORANGE);
		
		List list1 = new List();
		list1.add("삼겹살");
		list1.add("안심");
		list1.add("등심");
		list1.add("목살");
		list1.add("항정살");
		list1.add("소고기");
		list1.add("가브리살");
		list1.add("갈매기살");
		
		list1.setBounds(400,100,150,150);
		
		List list2 = new List();
		list2.setMultipleMode(true); // 다중 선택!
		list2.add("김치");
		list2.add("와사비");
		list2.add("쌈장");
		list2.add("소금장");
		list2.add("간장");
		list2.add("마늘");
		list2.add("상추쌈");
		list2.add("초장");
		
		list2.setBounds(600,100,150,150);
		
		f.add(day); //프레임에 day(초이스)를 붙임!
		f.add(ok); //프레임에 ok(버튼)를 붙임!
		f.add(list1); // 프레임에 list1(리스트,단일선택) 를 붙임!
		f.add(list2); // 프레임에 list1(리스트,다중선택) 를 붙임!
		
		f.setVisible(true);//프레임 보이기
	}

}
