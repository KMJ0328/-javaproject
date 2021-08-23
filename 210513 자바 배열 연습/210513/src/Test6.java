
public class Test6 {

	public static void main(String[] args) {
		int i, j, arr1[][] = new int [5][3]; // 5행 3열
		int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{3,4,5}}; // 3행 3열
		int[] arr3[] = {{1,2},{2,3,4,5},{3,4,5}}; // 가변배열 
		
		for(i=0; i<arr3.length; i++){ // 행 제어 0,1,2,3,4
			for(j=0;j<arr3[i].length;j++){ // 열 제어
					System.out.print(arr3[i][j] + " ");
			}
			System.out.println(); // 각 행 줄바꿈 
		}
		
		

	}

}
