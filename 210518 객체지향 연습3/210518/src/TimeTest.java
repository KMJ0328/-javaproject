// >> ��� ȭ�� <<
// �� �Է� : 13
// �� �Է� : 20
// �� �Է� : 52

// 13��20��52�� �Դϴ�.
import java.util.*;
public class TimeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m,s;
		System.out.print("�� �Է�: ");
		h = sc.nextInt();
		System.out.print("�� �Է�: ");
		m = sc.nextInt();
		System.out.print("�� �Է�: ");
		s = sc.nextInt();
		
		Time t1 = new Time();
		Time t2 = new Time(11,35,30);
		Time t3 = new Time(h,m,s);
		
		//int[] arr2;
		//arr2 = t1.getArr();
		//arr2[0] = 123;
		//System.out.println(arr2[0]);
		
		
		System.out.println(t1.getArr()); // 
		
		//System.out.println(t3);
		
		
		System.out.println(t1); // System.out.println(t2.toString()); �� ����!
		System.out.println(t2);
	}

}
