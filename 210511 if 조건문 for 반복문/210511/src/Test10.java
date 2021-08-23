// 1~n 사이의 3의 배수 출력하는 프로그램
// >>결과화면<<
// 정수입력 : 30
// 3,6,8.......30

import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		int i, n, cnt = 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		for( i=1; i<=n; i++){ // 1~n까지 n회 반복
			if(i % 3 == 0){ // 3배수면 참!!
				cnt++;//cnt += 1;//cnt = cnt + 1;
				if(cnt % 5 ==0){ // 5, 10,15,20........
					System.out.printf("%3d\n", i);
				
				}else{
					System.out.printf("%3d ", i);
				}
				}
				
			}
			
			
		}

	
	}



