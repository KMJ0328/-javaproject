// ���ǹ�(switch��)
import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
		// ã�°� ������, ����, ���
		// switch(ã�°�) {�����;}
		//break���� �����̳� �ݺ��� {��}�� �������� (��, if�� ����)
		switch(n){
				case 5:
					System.out.print("*"); 
				case 4:
					System.out.print("*"); 
				case 3:
					System.out.print("*"); 
				case 2:
					System.out.print("*"); 
				case 1:
					System.out.print("*"); break;
			   default:
				    System.out.println("1~5�� �Է� �����մϴ�."); 
		}
	}

}
