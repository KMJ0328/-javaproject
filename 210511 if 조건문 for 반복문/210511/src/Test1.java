// 성적관리 프로그램

// A: 90~100, B: 80~89 C: 70~79, D: 60~69 F: 0~59
// 사용자에게 점수를 입력받아 등급을 알려주는 프로그램
// 점수는 0~100점 사이만 입력 받아야 함! (에러메시지 추가)
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수(0~100) 입력: ");
		score = sc.nextInt();// 키보드로 정수 1개 입력받아
		System.out.println("당신의 점수는" + score + "점 입니다.");
		System.out.println("=============================");
		if(score>=90 && score<101){
			System.out.println(score+"점은 A등급입니다.");
		}else if (score>79 && score<90){
			System.out.println(score+"점은 B등급입니다.");
		}else if (score>69 && score<80){
			System.out.println(score+"점은 C등급입니다.");{
		}
		}else if (score>59 && score<70){
			System.out.println(score+"점은 D등급입니다.");
			}else if(score>=0 && score<60){
				System.out.println(score+"점은 F등급입니다.");
			}else{
				System.out.println("0~100점 사이만 입력하세요");
			}
	}
}


