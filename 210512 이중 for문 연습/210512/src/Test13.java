//1~100 ������ r�� ����� ����ϴ� ���α׷�
//r�� 5~10������ ������
//4���� �ٹٲ�!!
// >> ��� ȭ�� <<
// 1~100 ������ r�� ����� ����մϴ�.
// r 2r 3r .... 10r 
public class Test13 {
	public static void main(String[] args) {
		int r,i,cnt = 0;
		r = (int)(Math.random()*6)+5;
		System.out.println("1~100������"+r+"�� ����� ����մϴ�.");
		for(i=1;i<101;i++){
			if(i % r == 0){ //i�� r�� ����̸� ��
				cnt++;
				if(cnt % 4 == 0){
				System.out.printf("%3d\n",i);
			}else {
				System.out.printf("%3d ", i);
			}
			
		}
	}

}
}
