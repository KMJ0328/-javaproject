// ��Ģ���� ���α׷�
// >>��� ȭ�� <<
// ����1 : 10
// ����2 : 20
//
//==== ��Ģ���� ====
//1.����
//2.����
//3.����
//4.����
//===============
//����:1
//10+20 = 30
//����:2
//10 -20 = -10



import java.util.*;
public class Test11 {
	public static void main(String[] args) {
		int i,j,arr[]= new int[2]; // ���� ������ �ʱ�ȭ ������ �����Ⱚ
		Scanner sc =new Scanner(System.in);
		
		
		
		for(i=0;i<arr.length;i++){
		System.out.print("����"+ (i+1)+ ":");
		arr[i] = sc.nextInt();
		}System.out.println("==== ��Ģ���� ====");
		System.out.print("1.����\n2.����\n3.����\n4.����\n");
		System.out.println("===============");
		System.out.print("����: ");
		for(i=0;i<arr.length;i++){
			j = sc.nextInt();
			if(j == 1){
				System.out.println(arr[i]+arr[(i+1)]);
			}else if(j == 2){
				System.out.println(arr[i]-arr[(i+1)]);
			}else if(j == 3){
				System.out.println(arr[i]*arr[(i+1)]);
			}else if(j == 4){
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				System.exit(0);
			}else{
				System.out.println("1~4�� �Է°����մϴ�.");
			}
		}
		
		
	}

}
