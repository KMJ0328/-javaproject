// arr�迭�� 10, 30, 25���� ����Ǿ��ְ� 
// �ִ밪/�ּҰ��� ���ϴ� ���α׷�
// >> ���ȭ�� <<
// arr �迭�� ���Ҵ� 10,30,25�Դϴ�.
// �ִ밪�� 30�̰�  �ּҰ��� 10�Դϴ�.


public class Test8 {
	public static void main(String[] args) {
		int arr[] = {10,30,25};
		int i,max,min;
		System.out.print("arr �迭�� ���Ҵ� ");
		for(i=0;i<arr.length;i++){
		if(i == arr.length-1){
		System.out.print(arr[i] + " �Դϴ�.\n");
		}else {
		System.out.print(arr[i] + " , ");
		} 
		}
		max= arr[0];
		min= arr[0];
		for(i=1;i<arr.length;i++){ //��
		if(max<arr[i]){
		max= arr[i];
		}if(min> arr[i]){
		min=arr[i];
		}
		}
		System.out.print("�ִ밪�� "+max+"�̰� �ּҰ��� "+min+"�Դϴ�.");
		}
		}


