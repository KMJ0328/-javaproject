// ����(1~50) ���߱� ���α׷�
// >> ���ȭ�� <<
// ���� �Է� : 30
// 30���� �۽��ϴ�.
//
// ���� �Է� : 20
// 20���� Ů�ϴ�.
//
// ���� �Է�: 25
// �����Դϴ�.
import java.util.*;
public class Test13 {
	public static void main(String[] args) {
		int r, n;
		Scanner sc = new Scanner(System.in);
		r = (int)(Math.random()*50)+1;
		
		
		for( ; ; ){ // ���ѷ���
			System.out.print("���� �Է� : "); // ���ѷ��� �ڵ�� ��� �ݺ����� �ʰ� �����Է��� �ؾ� �ٽ� ������ �Ǵ� ������ ������ �� �а�  Ʋ������ �ٽ� �ö���µ�
			n = sc.nextInt();			  //System.out.print("���� �Է� : ");�� ���־��� ������ ����ڰ� �Է����ؾ� �ٽ� ������ 
			if( n == r){
				System.out.println(" �����Դϴ�. ");
			}else if( n<r ){
				System.out.println( n +"���� Ů�ϴ�.");
			}else {
				System.out.println( n +"���� �۽��ϴ�.");
			}
		}
	}

}
