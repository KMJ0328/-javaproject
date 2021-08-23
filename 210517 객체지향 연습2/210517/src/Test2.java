
public class Test2 {
	int n; // 인스턴스 변수
	static int[] arr = new int [10]; // 클래스 변수 (1차원 배열을 다루는 변수)
	 
	static{//클래스 초기화 블럭(프로그램 시작시 1회 호출)
		int i;
		for(i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)+1;
			
		}
	}
	public static void main(String[] args) {
		int i;
		for(i=0;i<Test2.arr.length;i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}

	}

}
