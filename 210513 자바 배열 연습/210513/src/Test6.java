
public class Test6 {

	public static void main(String[] args) {
		int i, j, arr1[][] = new int [5][3]; // 5�� 3��
		int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{3,4,5}}; // 3�� 3��
		int[] arr3[] = {{1,2},{2,3,4,5},{3,4,5}}; // �����迭 
		
		for(i=0; i<arr3.length; i++){ // �� ���� 0,1,2,3,4
			for(j=0;j<arr3[i].length;j++){ // �� ����
					System.out.print(arr3[i][j] + " ");
			}
			System.out.println(); // �� �� �ٹٲ� 
		}
		
		

	}

}
