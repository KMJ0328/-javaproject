import java.util.*; // Scanner 클래스 사용하기 위해 import


public class Test4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		n = sc.nextInt();
		
		if(n < 0) { // n이 0보다 크면 참 n이 0보다 작으면 거짓  
			System.out.println(n + "은(는) 음수 입니다.");
		} else if(n > 0){
			System.out.println(n + "은(는) 양수 입니다.");
			
		}else { //이도저도 아닐 때 
			System.out.println(n + "은(는) 0 입니다.");
		}
	}

}
