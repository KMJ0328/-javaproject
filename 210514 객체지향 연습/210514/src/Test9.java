//���� �޴� ��õ ���α׷�



public class Test9 {
	public static void main(String[] args) {
		String menu[] = {"������","�����","ġŲ","�����","����","���","������","����","���","�ø�"};
		
		int r,i;
		r = (int)Math.random()*10;
		System.out.print("�޴���[ ");
		for(i=0;i<menu.length;i++){
			System.out.print( menu[i]+ " ");
		}System.out.print("] �Դϴ�.\n");
		
		System.out.println("��õ�ϴ� ������ �޴���..");
		System.out.println(menu[r] + "�Դϴ�.");

	}

}
