import java.awt.*;// AWT 컨포넌트 사용하기 위해서 꼭 넣기
import java.awt.event.*;// 이벤트 처리하기 위해서 꼭 넣기
//3.이벤트처리기
class Event3 implements ActionListener{
   public void actionPerformed(ActionEvent arg0) {   
      System.out.println("확인 버튼을 누르셨습니다.");
   }   
}

public class Test7 {

   public static void main(String[] args) {
      Frame f = new Frame("버튼 이벤트 연습");
      f.setBounds(500, 300, 500, 300); 
      f.setBackground(Color.ORANGE);
      f.setLayout(null);
      
      Button b1 = new Button("확인");   //1.이벤트 대상(소스)
      b1.setBounds(70, 75, 150, 150);
      b1.addActionListener(new Event3()); //2.이벤트 리스너(감지기)
      
      
      Button b2 = new Button("취소");
      b2.setBounds(280, 75, 150, 150);
      b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent arg0) {   
            System.out.println("취소 버튼을 누르셨습니다.");
         }   
      });
      
      
      
      //프레임(윈도우) 닫기X 버튼 눌렀을때 이벤트 처리!
      f.addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent e) {
                System.exit(0);   //프로그램종료
       }

       }); 
      
      
      f.add(b1); f.add(b2);
      f.setVisible(true);

   }

}