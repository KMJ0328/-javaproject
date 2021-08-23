
public class Test4 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer(); // 구매자 객체 b1생성
		Computer com = new Computer();
		Audio au = new Audio();
		SmartPhone sp = new SmartPhone();
		
		b1.buy(com);
		b1.buy(sp);
		b1.buy(au);
		
		System.out.println("현재 남은 돈은 " + b1.money+ "만원 입니다.");
		System.out.println("보너스포인트는 " + b1.bonusPoint+ "만점 입니다.");
		
	}

}
 