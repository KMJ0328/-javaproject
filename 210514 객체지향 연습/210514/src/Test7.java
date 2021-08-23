import java.util.Scanner;

// >> 결과 화면 <<
// p1_x 입력: 10
// p1_Y 입력: 20
// p2_x 입력: 55
// p2_y 입력: 40

//p1 (10,20) 와  p2(55,40)의 점 사이의 사각형 넓이를 구합니다.
// 사각형의 넓이는 xxx입니다.
public class Test7 {
	public static void main(String[] args) {
		int p1_x,p1_y,p2_x,p2_y;
		int width,height;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("p1_x 입력: ");
		p1_x = sc.nextInt();
		System.out.print("p1_y 입력: ");
		p1_y = sc.nextInt();
		System.out.print("p2_x 입력: ");
		p2_x = sc.nextInt();
		System.out.print("p2_y 입력: ");
		p2_y = sc.nextInt();
		
	  
	    width = Math.abs(p1_x - p2_x);
		height = Math.abs(p1_y - p2_y);
		System.out.println("p1("+p1_x+","+p1_y+")과(와) p2("+p2_x+","+p2_y+")점 사이의 사각형 넓이를 구합니다.");
		System.out.println("사각형의 넓이는 "+(width*height)+"입니다.");
	}

}
