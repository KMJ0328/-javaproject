// 1~n ������ 3�� ��� ����ϴ� ���α׷�
// >>���ȭ��<<
// �����Է� : 30
// 3,6,8.......30

import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		int i, n, cnt = 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		for( i=1; i<=n; i++){ // 1~n���� nȸ �ݺ�
			if(i % 3 == 0){ // 3����� ��!!
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



