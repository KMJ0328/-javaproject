// ����(����)�߻� ����
// Math.random(): 0.0 <= r <1.0
// 1~45 ������ ������  6�� �߻�!
public class Test2 {
	public static void main(String[] args) {
		double r1,r2,r3,r4,r5,r6;
		
		r1 =	(int) (Math.random()*45)+1; // 1~10 ������ ������ �߻����� r�� ����
		r2 =	(int) (Math.random()*45)+1;
		r3 =	(int) (Math.random()*45)+1;
		r4 =	(int) (Math.random()*45)+1;
		r5 =	(int) (Math.random()*45)+1;
		r6 =	(int) (Math.random()*45)+1;
		// Math.random()	 	   : 0.0 <= R < 1.0
		// Math.random()*45  	   :0.0 <= R < 45.0
		// (int)Math.random()*45   :0 <= R < 45
		// (int)Math.random()*45+1 :1 <= R < 46
		// 1~45 ������ ���� ����!
		
		System.out.println("1��° ��ȣ: " + (int)r1 + " �Դϴ�.");
		System.out.println("2��° ��ȣ: " + (int)r2 + " �Դϴ�.");
		System.out.println("3��° ��ȣ: " + (int)r3 + " �Դϴ�.");
		System.out.println("4��° ��ȣ: " + (int)r4 + " �Դϴ�.");
		System.out.println("5��° ��ȣ: " + (int)r5 + " �Դϴ�.");
		System.out.println("6��° ��ȣ: " + (int)r6 + " �Դϴ�.");
	}

}
