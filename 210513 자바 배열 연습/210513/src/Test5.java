// �������� ���α׷�
// >>���ȭ��<<
// = 3���� ��,��,�� ������ ������ ���ϴ� ���α׷� =
// ��ȣ ���� ���� ����  ����   ���
//  1  90 98 78 xxx xx.x
//  2  77 80 90 xxx xx.x
//  3  90 60 88 xxx xx.x



public class Test5 {
	public static void main(String[] args) {
		int i,j,total;
		int score[][] = {{90,98,78},{77,80,90},{90,60,88},{80,99,79},{100,77,99}};
		
		System.out.println("= "+score.length+"���� ��,��,�� ������ ������ ����� ���ϴ� ���α׷� = \n");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		for(i=0;i<score.length;i++){// ������ i�� 0,1,2
			total = 0; //���� ���� �κ� 0���� �ʱ�ȭ
			System.out.printf("%2d\t",i+1); // ��ȣ ����ϴ� �ι�
			for(j=0; j<score[i].length;j++){// ������ i�� 0,1,2
				total += score[i][j];
			System.out.printf("%3d\t",score[i][j]);
			}
			System.out.printf("%4d\t"+"%.1f\n",total,(double)total/score.length); // �ٹٲ�
			}
	}

}
