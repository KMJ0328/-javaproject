// �ݺ���(for��)
// 1~100 ������ �������� ���ϴ� ���α׷�
// >>���ȭ��<<
// 1~100������ ¦���� �������� xxx�Դϴ�.



public class Test9 {
	public static void main(String[] args) {
		int i, total = 0; // ���� ������ �ʱ�ȭ �ʼ�!!
		
		
	  //for(1.�ʱⰪ;2.���ǽ�;3.������){�����;}
		for( i=1; i<=100; i++){ // i�� 1~100���� 100ȸ �ݺ�
			if( i % 2 == 1){
				total += i; // total = total + i;�� ����
			}
	
		}
		System.out.println("1~100������ Ȧ���� ��������"+ total + "�Դϴ�.");
	}

}
