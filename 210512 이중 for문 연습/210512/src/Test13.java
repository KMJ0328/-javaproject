//1~100 사이의 r의 배수를 출력하는 프로그램
//r은 5~10사이의 랜덤값
//4개당 줄바꿈!!
// >> 결과 화면 <<
// 1~100 사이의 r의 배수를 출력합니다.
// r 2r 3r .... 10r 
public class Test13 {
	public static void main(String[] args) {
		int r,i,cnt = 0;
		r = (int)(Math.random()*6)+5;
		System.out.println("1~100사이의"+r+"의 배수를 출력합니다.");
		for(i=1;i<101;i++){
			if(i % r == 0){ //i가 r의 배수이면 참
				cnt++;
				if(cnt % 4 == 0){
				System.out.printf("%3d\n",i);
			}else {
				System.out.printf("%3d ", i);
			}
			
		}
	}

}
}
