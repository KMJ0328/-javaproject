// �ݺ���(while��)
// 1~100 ������ ������ ���ϴ� ���α׷�
public class Test15 {
	public static void main(String[] args) {
		int i, total = 0; //�ݺ� ���� ����
		i = 1; //1.�ʱⰪ
		
		
		while(i<=100){		// 2.���ǽ�
		total += i;	// total = total + i;
		i++; // 3.������
		}
		System.out.println("1~100������ ������: " + total);
		
		
	}
}








/*
do{ //2.���ǽ�
total +=i; // total = total +i;
i++; //3.������
}while(i<=100); // do-while �ۼ��� �������� �����ݷ� �ʼ�!!
System.out.println("1~100������ ������: " + total);

*/