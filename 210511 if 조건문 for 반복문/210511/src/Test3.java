// 1~100 사이의 랜덤값을 발생시켜서 5의 배수인지 아닌지 체크하는 프로그램 
// >>결과화면<<
// 15는 5의 배수입니다. / 17는 5의 배수가 아닙니다.


public class Test3 {
	public static void main(String[] args) {
		int r;
		
		r = (int)(Math.random()*100)+1;
		if(r % 5 == 0){ //r이 5의 배수이면 참!
			System.out.println(r+"(은)는 5의 배수입니다.");
		}else{
			System.out.println(r+ "(은)는 5의 배수가 아닙니다.");
		}

	}

}
