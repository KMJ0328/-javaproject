// >> ��� ȭ�� <<
// -1+2-3+4-5=-3
public class Test14 {
	public static void main(String[] args) {
		int i,total=0;
		for(i=1; i<=5; i++){
			
			// total(���ϰ�,����) �κ�
			
			//+,- ��� �κ� (¦���϶� �տ� +���̰�, Ȧ���϶� �տ�-����)
			if(i%2 == 0){
				total +=i; // total = total+i; 2  4 
				System.out.print("+"+i);
			}else{
				total -=i; // total = total-i; 1 3 5
				System.out.print("-"+i); 
			}
			//total +=i; // total = total+i;  <<���⿡ �̰Կ͵���
		}System.out.println("="+total);
	}

} 
