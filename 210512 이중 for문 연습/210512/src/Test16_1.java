import java.util.Scanner;

// ���丮�� (5! = 5*4*3*2*1 = 120)
// >> ���ȭ�� <<
// ���� �Է�: 5
// 5! = 120
//5!=1*2*3*4*5= 120
public class Test16_1 {
	public static void main(String[] args) {
		int i,n,total = 1; //���� ������ �ʱ�ȭ �ʼ�!!
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�: ");
		n= sc.nextInt();
		System.out.print(n+"!"+"=");
		
		for(i=1;i<=n;i++){
			total = total*i;
			if(i == 5){
				System.out.print(i);
			}else{
				System.out.print(i + "*");
			}
		}System.out.println("=" + total);
	}

}
