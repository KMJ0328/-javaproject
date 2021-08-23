// 성적관리 프로그램
// >>결과화면<<
// = 3명의 국,영,수 점수의 총점을 구하는 프로그램 =
// 번호 국어 영어 수학  총점   평균
//  1  90 98 78 xxx xx.x
//  2  77 80 90 xxx xx.x
//  3  90 60 88 xxx xx.x



public class Test5 {
	public static void main(String[] args) {
		int i,j,total;
		int score[][] = {{90,98,78},{77,80,90},{90,60,88},{80,99,79},{100,77,99}};
		
		System.out.println("= "+score.length+"명의 국,영,수 점수의 총점과 평균을 구하는 프로그램 = \n");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(i=0;i<score.length;i++){// 행제어 i는 0,1,2
			total = 0; //총합 누적 부분 0으로 초기화
			System.out.printf("%2d\t",i+1); // 번호 출력하는 부문
			for(j=0; j<score[i].length;j++){// 열제어 i는 0,1,2
				total += score[i][j];
			System.out.printf("%3d\t",score[i][j]);
			}
			System.out.printf("%4d\t"+"%.1f\n",total,(double)total/score.length); // 줄바꿈
			}
	}

}
