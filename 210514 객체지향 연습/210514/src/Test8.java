import java.util.Scanner;

// p1_x-p2_X = A 
// p1_y-p2_y = B
// A*A +B*B = P1 �� P2�� ����



public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1_x,p1_y,p2_x,p2_y;
		int width,height;
		double b;
		
		// ��Ʈ ����� �޼ҵ� Math.sqrt(a)
		
		System.out.print("p1_x �Է�: ");
		p1_x = sc.nextInt();
		System.out.print("p1_y �Է�: ");
		p1_y = sc.nextInt();
		System.out.print("p2_x �Է�: ");
		p2_x = sc.nextInt();
		System.out.print("p2_y �Է�: ");
		p2_y = sc.nextInt(); 
		width = Math.abs(p1_x - p2_x);
		height = Math.abs(p1_y - p2_y);
		b = Math.sqrt((width*width)+(height*height));
		System.out.println("p1("+p1_x+","+p1_y+")��(��) p2("+p2_x+","+p2_y+")\n�� ������ �Ÿ��� ���մϴ�.");
		System.out.printf("p1("+p1_x+","+p1_y+")��(��) p2("+p2_x+","+p2_y+")\n�� ������ �Ÿ��� ");
		System.out.printf("%.1f",b);
		System.out.print("�Դϴ�.");
	}

}
