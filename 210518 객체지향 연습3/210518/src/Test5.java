// 1~9 ������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�.
// (1),(2) �� �˸��� �ڵ带 �־ ���α׷� �ϼ��Ͻÿ�.
// ����: Math.random() ���, p156 5-5����
public class Test5 {
	public static void main(String[] args) {
		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int ball3[] = new int[3];
		int i,j = 0,temp;
		
		//�迭ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		for(i=0; i < ballArr.length; i++){ // i �� 0~8
			j = (int)(Math.random()*ballArr.length);//0~8
			temp = 0;
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;
		}
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		System.arraycopy(ballArr,0,ball3,0, 3);
		for(i=0 ; i<ball3.length; i++){
			System.out.print(ball3[i] + " ");
		}

	}

}
