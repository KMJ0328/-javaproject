//instanceof ������


public class Test3 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		// ���������� �����ϴ� �ν��Ͻ� ���� Ÿ������ �ƴ��� üũ�ϴ� instanceof ������
		// ���������� Ÿ������ Upcasting �Ǹ� ��!
		if(fe instanceof FireEngine){
			System.out.println("fe�� FireEngine ��ü �Դϴ�.");
		}
		if(fe instanceof Car){
			System.out.println("fe�� Car ��ü �Դϴ�.");
		}
		if(fe instanceof Object){
			System.out.println("fe�� Object ��ü �Դϴ�.");
		}

	}

}
