import java.util.Scanner;

// 동물 맞추기 게임
// >> 결과화면 <<
// ====== 메뉴 ======
// 1. 힌트 1
// 2. 힌트 2
// 3. 힌트 3
// 4. 힌트없음
// ================
// 메뉴 입력 : 1
// 다리가 4개입니다.


// [1회 도전]
// 동물 입력 : 강아지
// 틀렸습니다.
//
// ================
// 메뉴 입력 : 4
// 힌트없습니다.
// [2회 도전]
// 동물 입력 : 
// 정답입니다.

public class Test1 {
	public static void main(String[] args) {
		int n,i;
		String r = "호랑이",result;
		Scanner sc = new Scanner(System.in);
		
		for(; ;){
		
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 힌트 1");
			System.out.println("2. 힌트 2");
			System.out.println("3. 힌트 3");
			System.out.println("4. 힌트없음");
			System.out.println("=================");
			System.out.print("메뉴 입력 : ");
			
			n = sc.nextInt();
			
			
			
			if( n == 1){
				System.out.println("\n고양이과에 속하는 맹수다.\n어린 개체는 개호주라 부른다.\n고양이과 동물중 그 크기가 가장 크며,\n스라소니나 표범과 재규어를 제외하면 유일하게 수영을 할 수 있다.\n");
				break; //  조건, 반복문 {블럭}을 빠져나감 (단, if문 제외)
			}else if ( n == 2){
				System.out.println("\n12지 중 세 번째 동물이다.\n");
				break;
			}else if ( n == 3){
				System.out.println("\n위험한 맹수로 무서움의 상징이나 인간의 말을 알아듣는 영물, 의리를 아는 친숙한 존재로 받아들여지기도 했다.\n");
				break;
			}else if ( n == 4){
				System.out.println("\n힌트 없습니다.\n");
			}else {
				System.out.println("\n1~4만 입력가능합니다.\n");
			}
		} 
		
		for(i=1;i<=5;i++){ // 1~5 까지 5회반복
			System.out.println("["+i+"회 도전]");
			System.out.print("동물 입력: ");
			result = sc.next();
			if(result == r){
				System.out.print("정답입니다.");
				System.exit(0);
			}else{
				System.out.println("틀렸습니다.");
			}
			}System.out.println("5회의 기회를 모두 사용하셨습니다.");
			System.out.println("정답은 "+ r + "입니다.");	
	
	}

}
