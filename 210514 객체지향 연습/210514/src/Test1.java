import java.util.Scanner;

// ���� ���߱� ����
// >> ���ȭ�� <<
// ====== �޴� ======
// 1. ��Ʈ 1
// 2. ��Ʈ 2
// 3. ��Ʈ 3
// 4. ��Ʈ����
// ================
// �޴� �Է� : 1
// �ٸ��� 4���Դϴ�.


// [1ȸ ����]
// ���� �Է� : ������
// Ʋ�Ƚ��ϴ�.
//
// ================
// �޴� �Է� : 4
// ��Ʈ�����ϴ�.
// [2ȸ ����]
// ���� �Է� : 
// �����Դϴ�.

public class Test1 {
	public static void main(String[] args) {
		int n,i;
		String r = "ȣ����",result;
		Scanner sc = new Scanner(System.in);
		
		for(; ;){
		
			System.out.println("====== �޴� ======");
			System.out.println("1. ��Ʈ 1");
			System.out.println("2. ��Ʈ 2");
			System.out.println("3. ��Ʈ 3");
			System.out.println("4. ��Ʈ����");
			System.out.println("=================");
			System.out.print("�޴� �Է� : ");
			
			n = sc.nextInt();
			
			
			
			if( n == 1){
				System.out.println("\n����̰��� ���ϴ� �ͼ���.\n� ��ü�� ��ȣ�ֶ� �θ���.\n����̰� ������ �� ũ�Ⱑ ���� ũ��,\n����Ҵϳ� ǥ���� ��Ծ �����ϸ� �����ϰ� ������ �� �� �ִ�.\n");
				break; //  ����, �ݺ��� {��}�� �������� (��, if�� ����)
			}else if ( n == 2){
				System.out.println("\n12�� �� �� ��° �����̴�.\n");
				break;
			}else if ( n == 3){
				System.out.println("\n������ �ͼ��� �������� ��¡�̳� �ΰ��� ���� �˾Ƶ�� ����, �Ǹ��� �ƴ� ģ���� ����� �޾Ƶ鿩���⵵ �ߴ�.\n");
				break;
			}else if ( n == 4){
				System.out.println("\n��Ʈ �����ϴ�.\n");
			}else {
				System.out.println("\n1~4�� �Է°����մϴ�.\n");
			}
		} 
		
		for(i=1;i<=5;i++){ // 1~5 ���� 5ȸ�ݺ�
			System.out.println("["+i+"ȸ ����]");
			System.out.print("���� �Է�: ");
			result = sc.next();
			if(result == r){
				System.out.print("�����Դϴ�.");
				System.exit(0);
			}else{
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			}System.out.println("5ȸ�� ��ȸ�� ��� ����ϼ̽��ϴ�.");
			System.out.println("������ "+ r + "�Դϴ�.");	
	
	}

}
