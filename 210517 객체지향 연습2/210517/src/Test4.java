
import java.util.*;
// 1~100 사이의 4배수이거나 또는 7의 배수이면 출력하는 프로그램
// 5개당 줄바꿈(cnt 변수 추가해서 사용~)하여 출력!
// 숫자는 총3자리로 표현해보기
// >> 결과화면 <<
// 4 ,7 ,8 ,12, 14 ,
// 16, 20..
public class Test4 {
	public static void main(String[] args) {
	int i,cnt = 0;	
	int arr[] = new int[101];
	
		for(i=1;i<arr.length;i++){ //i = 1~100
			if(i % 4 == 0 || i % 7 == 0){
				cnt++;
				if(cnt % 5 == 0){
					System.out.printf("%3d\n",i);
			
				}else if(i == 100){
					System.out.printf("%3d",i);
				}else {
				
					System.out.printf("%3d, ",i);
				}
			}
		}
	}

}
