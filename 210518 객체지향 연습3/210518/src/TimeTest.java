// >> 결과 화면 <<
// 시 입력 : 13
// 분 입력 : 20
// 초 입력 : 52

// 13시20분52초 입니다.
import java.util.*;
public class TimeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m,s;
		System.out.print("시 입력: ");
		h = sc.nextInt();
		System.out.print("분 입력: ");
		m = sc.nextInt();
		System.out.print("초 입력: ");
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
		
		
		System.out.println(t1); // System.out.println(t2.toString()); 와 같음!
		System.out.println(t2);
	}

}
