// 구구단 프로그램
// >> 결과 화면 <<
// 단(2~9) 입력: 2
// 2*1 = 2
// 2*2 = 4
// ...
// 2*9 = 18
import java.util.*;
public class Test11 {
	public static void main(String[] args) {
		int dan, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		dan = sc.nextInt();
		
			if(dan>1 && dan<=9){
				for(i=1;i<=9;i++){ // i는 1,2,3,4,5,6,7,8,9 까지만 가능
					System.out.printf("%d * %d = %2d\n",dan,i,(dan*i));
				//  System.out.println(dan+"*"+i+"="+(dan*i));
				}
			}else{
				System.out.println("2~9만 입력 가능합니다.");
			}
			
		}
			
		

	}



