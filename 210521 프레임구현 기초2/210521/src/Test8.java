import java.awt.*;
import java.awt.event.*;

public class Test8 extends Frame {
	Label lid, lpw;
	TextField tfid,tfpw;
	Button ok;
	
	Test8(){// 기본생성자 생성
		super("로그인 이벤트 연습"); // Frame("로그인 이벤트 연습"); //프레임 제목 표시줄
		lid = new Label("ID : ");
		lid.setAlignment(Label.RIGHT);
		lpw = new Label("Password : ", Label.RIGHT);
		tfid = new TextField(10);// 글자수 제한
		tfid.setBackground(Color.yellow);
		tfpw = new TextField(10);// 글자수 제한
		tfpw.setEchoChar('*');
		ok = new Button("확인");
		
		this.setLayout(new FlowLayout());
		this.setBounds(500,300,400,80);
		this.setBackground(Color.ORANGE);
		this.setResizable(false);
		
		tfid.addActionListener(new Event4());
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		
		/// 프레임(윈도우) 닫기 x 버튼 눌렀을 떄 이벤트 처리!
		this.addWindowListener(new WindowAdapter(){ // 프레임 닫기 이벤트
			public void windowClosing(WindowEvent e){System.exit(0);}});// 프로그램 종료
		this.add(lid);this.add(tfid);
		this.add(lpw);this.add(tfpw);
		this.add(ok);
		setVisible(true);
	}// 기본생성자 종료
	public static void main(String[] args) {
		Test8 t =   new Test8();
	}// main 종료
	class Event4 implements ActionListener{// 내부클래스 사용, TextField 입력후 엔터 or 확인버튼 클릭시 이벤트 처리기
		public void actionPerformed(ActionEvent arg0) {
			String id = tfid.getText();
			String password = tfpw.getText();
			if(!id.equals("admin")){ // id가 admin이 아니면 참!
				System.out.println("유효하지 않은 id 입니다.");
				tfid.requestFocus(); // tfid로 포커스 (마우스커서) 옮김 
				tfid.selectAll(); // tfid 전체 선택해서 다시 입력시 지워지게..
			}else if(!password.equals("1234")){ // pw가 admin이 아니면 참!
				System.out.println("유효하지 않은 password 입니다.");
				tfpw.requestFocus(); // tfpw로 포커스 (마우스커서) 옮김 
				tfpw.selectAll(); // tfpw 전체 선택해서 다시 입력시 지워지게..
			}else {// id, password 다 맞으면 실행!
				System.out.println(id+"님, 환영합니다.");
			}
		} 
	}

}//Test8 클래스 종료
