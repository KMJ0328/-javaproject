







public class Test3 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // 배열을 다루는 변수 볼을 선언과 동시에 초기화 
		int i,j,temp; //반복제어 변수
		
		for (i=0; i<ball.length; i++){ // 0~44까지 45회 반복하는 for문
			ball[i] = i+1; // 1~45로 원소 초기화!
			
		}
		 for(i= 0 ;i<100; i++){
			 j = (int)(Math.random()*45); // 0~44 사이의 랜덤값
			 
			 // swap (교체 알고리즘)
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
