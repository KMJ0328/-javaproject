// 성적관리 프로그램 (switch문)

// A: 90~100, B: 80~89 C: 70~79, D: 60~69 F: 0~59
// 사용자에게 점수를 입력받아 등급을 알려주는 프로그램
// 점수는 0~100점 사이만 입력 받아야 함! (에러메시지 추가)
import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if(score>=0 && score<=100){ // 0~100점 사이면 참
		switch(score/10){
		case 10:
		case 9 : System.out.println(score + "점은 A등급 입니다.");break;
		case 8 : System.out.println(score + "점은 B등급 입니다.");break;
		case 7 : System.out.println(score + "점은 C등급 입니다.");break;
		case 6 : System.out.println(score + "점은 D등급 입니다.");break;
		default: System.out.println(score + "점은 F등급 입니다.");
	}
		}else{
			System.out.println("0~100점 사이만 입력 가능합니다.");
			
		}
	}

}
