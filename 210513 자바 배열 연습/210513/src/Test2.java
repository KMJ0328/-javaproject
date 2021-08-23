// 학생 3명의 점수를 입력받아 총점과 평균을 구하는 프로그램
//>>결과화면<<
// 3명의 점수는 xx xx xx입니다.
// 총점:xx
// 평균:xx.x


import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		int total = 0,i,score[] = {88,99,78,80,99,77,77,45,52,85,65,72,88};
		System.out.print(score.length +"명의 점수는 ");
		for(i=0;i<score.length;i++){
			total += score[i];
			System.out.print(score[i]+" ");
		}System.out.println("입니다.");
		System.out.println("총점 : "+ total);
		System.out.printf("평균 : "+("%.1f\n"),(double)total/score.length);
	}

}
