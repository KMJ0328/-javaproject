
public class Test4 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer(); // ������ ��ü b1����
		Computer com = new Computer();
		Audio au = new Audio();
		SmartPhone sp = new SmartPhone();
		
		b1.buy(com);
		b1.buy(sp);
		b1.buy(au);
		
		System.out.println("���� ���� ���� " + b1.money+ "���� �Դϴ�.");
		System.out.println("���ʽ�����Ʈ�� " + b1.bonusPoint+ "���� �Դϴ�.");
		
	}

}
 