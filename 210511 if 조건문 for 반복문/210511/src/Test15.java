// 반복문(while문)
// 1~100 사이의 누적합 구하는 프로그램
public class Test15 {
	public static void main(String[] args) {
		int i, total = 0; //반복 제어 변수
		i = 1; //1.초기값
		
		
		while(i<=100){		// 2.조건식
		total += i;	// total = total + i;
		i++; // 3.증감식
		}
		System.out.println("1~100사이의 누적합: " + total);
		
		
	}
}








/*
do{ //2.조건식
total +=i; // total = total +i;
i++; //3.증감식
}while(i<=100); // do-while 작성시 마지막에 세미콜론 필수!!
System.out.println("1~100사이의 누적합: " + total);

*/