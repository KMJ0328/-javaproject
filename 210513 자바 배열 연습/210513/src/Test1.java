
public class Test1 {

	public static void main(String args[]) {
		int n = 5,i ; // 변수 선언
		
		// 배열. 같은 타입의 연속된 공간을 사용하기 위해!
		int[] arr1; // 배열을 다루는 변수 arr1을 선언! (1차원 배열) 네모칸이 1개라 1차원
		arr1 = new int[]{10,20,30,40,50};
		
		int arr2[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int arr3[] = {11,12,13,14,15};
		
		
		//배열명.length;는 그 배열의 사이즈를 구해줌 !
		for(i=0; i<arr2.length; i++){ // i = 0,1,2,3,4,5,6,7,8,9
			System.out.println("arr2["+i+"} = " + arr2[i]);
		}
		
	}

}
