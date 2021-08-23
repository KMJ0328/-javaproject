


public class Test4 {
	public static void main(String[] args) {
		int i,n = 100,result=0;
		
		for(i=0;i<10;i++){ // i= 0~9
			try{
				result = n / (int)(Math.random()*10); // 100/0~9
				System.out.println(result);
			}catch(Exception e){
				System.out.println(0);
			}
		}
	}

}
