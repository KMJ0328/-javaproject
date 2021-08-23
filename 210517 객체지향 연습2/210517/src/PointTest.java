import java.util.Scanner;
class Point {
	int x,y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return  + x +", "+ y;
		
	}
}
class Point3D extends Point{
	int z;
	String getLocation() { // Point Ŭ�������� ���ǵ� getLocation()�� ������
		return "x: " + x + ", y: "+ y+", z: " + z;
		
	}
}

public class PointTest { 
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Scanner sc = new Scanner(System.in);
		
		int width,height;
		System.out.print("p1.x �Է�: ");
		p1.x = sc.nextInt();
		System.out.print("p1.y �Է�: ");
		p1.y = sc.nextInt();
		System.out.print("p2.x �Է�: ");
		p2.x = sc.nextInt();
		System.out.print("p2.y �Է�: ");
		p2.y = sc.nextInt(); 
		width= p1.x-p2.x;
		height =p1.y-p2.y;
		
		double dist = Math.sqrt((width*width)+(height*height));
		
		System.out.print("p1("+p1.getLocation()+")�� ");
		System.out.println(" p2("+p2.getLocation()+")������ �Ÿ���");
		System.out.printf("%.2f�Դϴ�.\n",dist);
	}

}
