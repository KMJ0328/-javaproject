import java.util.Scanner;

// p1_x-p2_X = A 
// p1_y-p2_y = B
// A*A +B*B = P1 과 P2의 빗변



public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1_x,p1_y,p2_x,p2_y;
		int width,height;
		double b;
		
		// 루트 씌우는 메소드 Math.sqrt(a)
		
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
		b = Math.sqrt((width*width)+(height*height));
		System.out.println("p1("+p1_x+","+p1_y+")과(와) p2("+p2_x+","+p2_y+")\n점 사이의 거리를 구합니다.");
		System.out.printf("p1("+p1_x+","+p1_y+")과(와) p2("+p2_x+","+p2_y+")\n점 사이의 거리는 ");
		System.out.printf("%.1f",b);
		System.out.print("입니다.");
	}

}
