
import java.util.*;
// 1~100 ������ 4����̰ų� �Ǵ� 7�� ����̸� ����ϴ� ���α׷�
// 5���� �ٹٲ�(cnt ���� �߰��ؼ� ���~)�Ͽ� ���!
// ���ڴ� ��3�ڸ��� ǥ���غ���
// >> ���ȭ�� <<
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
