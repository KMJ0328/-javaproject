







public class Test3 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // �迭�� �ٷ�� ���� ���� ����� ���ÿ� �ʱ�ȭ 
		int i,j,temp; //�ݺ����� ����
		
		for (i=0; i<ball.length; i++){ // 0~44���� 45ȸ �ݺ��ϴ� for��
			ball[i] = i+1; // 1~45�� ���� �ʱ�ȭ!
			
		}
		 for(i= 0 ;i<100; i++){
			 j = (int)(Math.random()*45); // 0~44 ������ ������
			 
			 // swap (��ü �˰���)
			 temp =ball[0];
			 ball[0] = ball[j];
			 ball[j] = temp;
		 }
		for(i=0;i<6;i++){
			if(i != 5){
			System.out.print(ball[i]+", ");
			}else {
				System.out.println(ball[i]);
			}
		}
		
	}

}
