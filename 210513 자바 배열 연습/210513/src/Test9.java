// >>���ȭ��<<
// ������ 3,1,7,5,9,8,2 �Դϴ�.
// �����ϸ� 1 2 3 5 7 8 9 �Դϴ�.


public class Test9 {
	public static void main(String[] args) {
		int i,j,temp,arr[] = {3,1,7,5,9,8,2};
		
		System.out.print("������ ");
		for(i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println("�Դϴ�.");
		
		///////// �����ؼ� ��� �κ�
		
	
		
		for(i=0; i<arr.length-1;i++){ //0~6
			for(j=1+i;j<arr.length;j++){ // i+1~7
				if(arr[i]>arr[j]){// ��ü
					temp = arr[i];
					arr[i] = arr[j]; // i�����ִ� ���ڸ� j�����ִ� ���ڷ� ��ü
					arr[j] = temp;
				}
			}
			
			}System.out.print("�����ϸ� ");
			for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println("�Դϴ�.");
		
	}
}
