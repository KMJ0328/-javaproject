// >>결과화면<<
// 원본은 3,1,7,5,9,8,2 입니다.
// 정렬하면 1 2 3 5 7 8 9 입니다.


public class Test9 {
	public static void main(String[] args) {
		int i,j,temp,arr[] = {3,1,7,5,9,8,2};
		
		System.out.print("원본은 ");
		for(i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println("입니다.");
		
		///////// 정렬해서 출력 부분
		
	
		
		for(i=0; i<arr.length-1;i++){ //0~6
			for(j=1+i;j<arr.length;j++){ // i+1~7
				if(arr[i]>arr[j]){// 교체
					temp = arr[i];
					arr[i] = arr[j]; // i열에있는 숫자를 j열에있는 숫자로 교체
					arr[j] = temp;
				}
			}
			
			}System.out.print("정렬하면 ");
			for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println("입니다.");
		
	}
}
