
public class Test1 {

	public static void main(String args[]) {
		int n = 5,i ; // ���� ����
		
		// �迭. ���� Ÿ���� ���ӵ� ������ ����ϱ� ����!
		int[] arr1; // �迭�� �ٷ�� ���� arr1�� ����! (1���� �迭) �׸�ĭ�� 1���� 1����
		arr1 = new int[]{10,20,30,40,50};
		
		int arr2[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int arr3[] = {11,12,13,14,15};
		
		
		//�迭��.length;�� �� �迭�� ����� ������ !
		for(i=0; i<arr2.length; i++){ // i = 0,1,2,3,4,5,6,7,8,9
			System.out.println("arr2["+i+"} = " + arr2[i]);
		}
		
	}

}
