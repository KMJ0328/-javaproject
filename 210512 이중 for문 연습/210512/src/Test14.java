// >> 결과 화면 <<
// -1+2-3+4-5=-3
public class Test14 {
	public static void main(String[] args) {
		int i,total=0;
		for(i=1; i<=5; i++){
			
			// total(더하고,빼고) 부분
			
			//+,- 출력 부분 (짝수일때 앞에 +붙이고, 홀수일때 앞에-붙임)
			if(i%2 == 0){
				total +=i; // total = total+i; 2  4 
				System.out.print("+"+i);
			}else{
				total -=i; // total = total-i; 1 3 5
				System.out.print("-"+i); 
			}
			//total +=i; // total = total+i;  <<여기에 이게와도됨
		}System.out.println("="+total);
	}

} 
