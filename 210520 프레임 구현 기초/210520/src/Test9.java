import java.awt.*;
import java.util.Set;


public class Test9 {
	public static void main(String[] args) {
		Frame f = new Frame("회원가입");
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);
		f.setBounds(500,500,300,200);
		
		Label id = new Label("ID : ");
		id.setBounds(50,50,100,10);
		id.setAlignment(Label.RIGHT);
		Label pwd = new Label("Password : ");
		pwd.setBounds(50,90,100,10);
		pwd.setAlignment(Label.RIGHT);
		
		TextField txtId = new TextField("아이디 입력...");
		txtId.setBounds(170,50,100,20);
		
		//System.out.println(txtId.getText());
		
		TextField txtPwd = new TextField();
		txtPwd.setBounds(170,90,100,20);
		txtPwd.setEchoChar('★'); // 비밀번호 사용시 '★'로 대체
		
		
		f.add(id);
		f.add(pwd);
		f.add(txtId);
		f.add(txtPwd);
		
		
		
		f.setVisible(true);
	}

}
