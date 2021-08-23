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
	String getLocation() { // Point 클래스에서 정의된 getLocation()를 재정의
		return "x: " + x + ", y: "+ y+", z: " + z;
		
	}
}

public class PointTest { 
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Scanner sc = new Scanner(System.in);
		
		int width,height;
		System.out.print("p1.x 입력: ");
		p1.x = sc.nextInt();
		System.out.print("p1.y 입력: ");
		p1.y = sc.nextInt();
		System.out.print("p2.x 입력: ");
		p2.x = sc.nextInt();
		System.out.print("p2.y 입력: ");
		p2.y = sc.nextInt(); 
		width= p1.x-p2.x;
		height =p1.y-p2.y;
		
		double dist = Math.sqrt((width*width)+(height*height));
		
		System.out.print("p1("+p1.getLocation()+")와 ");
		System.out.println(" p2("+p2.getLocation()+")사이의 거리는");
		System.out.printf("%.2f입니다.\n",dist);
	}

}
