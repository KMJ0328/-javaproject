import java.awt.*;// AWT ������Ʈ ����ϱ� ���ؼ� �� �ֱ�
import java.awt.event.*;// �̺�Ʈ ó���ϱ� ���ؼ� �� �ֱ�
//3.�̺�Ʈó����
class Event3 implements ActionListener{
   public void actionPerformed(ActionEvent arg0) {   
      System.out.println("Ȯ�� ��ư�� �����̽��ϴ�.");
   }   
}

public class Test7 {

   public static void main(String[] args) {
      Frame f = new Frame("��ư �̺�Ʈ ����");
      f.setBounds(500, 300, 500, 300); 
      f.setBackground(Color.ORANGE);
      f.setLayout(null);
      
      Button b1 = new Button("Ȯ��");   //1.�̺�Ʈ ���(�ҽ�)
      b1.setBounds(70, 75, 150, 150);
      b1.addActionListener(new Event3()); //2.�̺�Ʈ ������(������)
      
      
      Button b2 = new Button("���");
      b2.setBounds(280, 75, 150, 150);
      b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent arg0) {   
            System.out.println("��� ��ư�� �����̽��ϴ�.");
         }   
      });
      
      
      
      //������(������) �ݱ�X ��ư �������� �̺�Ʈ ó��!
      f.addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent e) {
                System.exit(0);   //���α׷�����
       }

       }); 
      
      
      f.add(b1); f.add(b2);
      f.setVisible(true);

   }

}