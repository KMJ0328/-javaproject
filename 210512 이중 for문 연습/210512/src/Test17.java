// 3명의 (double형) 점수를 입력 받아서 총점과 평균을 구하는 프로그램
//  >> 결과화면 <<
// 학생1 점수 입력: 90.5
// 학생2 점수 입력: 90.5
// 학생3 점수 입력: 90.5
//
// 3명의 총점: xxx.x //"%.1d", 변수
// 3명의 평균: xx.x // "%.1d", 변수
import java.util.*;
public class Test17 {
	public static void main(String[] args) {
		int i;
		double s1,s2,s3,total,total2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 1 점수 입력: ");
		s1 = sc.nextDouble();
		System.out.print("학생 2 점수 입력: ");
		s2 = sc.nextDouble();
		System.out.print("학생 3 점수 입력: ");
		s3 = sc.nextDouble();
		
		total = s1+s2+s3;
		System.out.printf("3명의 총점은: "+"%.1f",total);
		System.out.println();
		System.out.printf("3명의 평균점수는: "+"%.1f",total/3);
	}

}
