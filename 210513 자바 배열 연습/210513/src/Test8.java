// arr배열에 10, 30, 25으로 저장되어있고 
// 최대값/최소값을 구하는 프로그램
// >> 결과화면 <<
// arr 배열의 원소는 10,30,25입니다.
// 최대값은 30이고  최소값은 10입니다.


public class Test8 {
	public static void main(String[] args) {
		int arr[] = {10,30,25};
		int i,max,min;
		System.out.print("arr 배열의 원소는 ");
		for(i=0;i<arr.length;i++){
		if(i == arr.length-1){
		System.out.print(arr[i] + " 입니다.\n");
		}else {
		System.out.print(arr[i] + " , ");
		} 
		}
		max= arr[0];
		min= arr[0];
		for(i=1;i<arr.length;i++){ //행
		if(max<arr[i]){
		max= arr[i];
		}if(min> arr[i]){
		min=arr[i];
		}
		}
		System.out.print("최대값은 "+max+"이고 최소값은 "+min+"입니다.");
		}
		}


