// ������ ���α׷�
// >> ��� ȭ�� <<
// ��(2~9) �Է�: 2
// 2*1 = 2
// 2*2 = 4
// ...
// 2*9 = 18
import java.util.*;
public class Test11 {
	public static void main(String[] args) {
		int dan, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		dan = sc.nextInt();
		
			if(dan>1 && dan<=9){
				for(i=1;i<=9;i++){ // i�� 1,2,3,4,5,6,7,8,9 ������ ����
					System.out.printf("%d * %d = %2d\n",dan,i,(dan*i));
				//  System.out.println(dan+"*"+i+"="+(dan*i));
				}
			}else{
				System.out.println("2~9�� �Է� �����մϴ�.");
			}
			
		}
			
		

	}



