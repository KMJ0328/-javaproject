// 1차원 배열 연습
// >> 결과 화면 <<
// 학생1 점수 입력:
// 학생2 점수 입력:
// 학생3 점수 입력:

// 번호  점수
// 1 : 98
// 2 : 75
// 3 : 100
import java.util.*;
public class test4 {
	public static void main(String[] args) {
		int score[] = new int[3]; // 0 , 1 , 2
		int i;
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0; i<score.length; i++){ // i는 0,1,2
			System.out.print("학생 점수 "+(i+1)+" 입력: ");
			score[i] = sc.nextInt(); // score[i]는 사용자가 쓰는 값
		}
			System.out.println(); // 줄바꿈
			
			System.out.println("번호\t점수");
			for(i=0; i<score.length; i++){
				System.out.printf("%2d\t%3d\n",(i+1),score[i]);
			}
	}

}
