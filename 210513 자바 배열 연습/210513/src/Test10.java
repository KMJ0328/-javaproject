//




public class Test10 {
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]= new int[10];
		int i=0;
		System.arraycopy(arr1,2,arr2,3,3);
		// arr1[0] ���� 5�� �����Ͽ�, arr2[2]���� ����ٿ��ֱ�
		
		for(i=0;i<arr2.length;i++){
			if(i==arr2.length){ 
				System.out.print(" ");
			}if(i == 0){
				System.out.print("");
			}
			else{
				System.out.print(",");
			}
		System.out.print(arr2[i]);
		}
	}

}
