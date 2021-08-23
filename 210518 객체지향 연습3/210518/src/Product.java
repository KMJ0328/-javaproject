
public class Product {
	int price; // 제품 가격
	int bonusPoint; // 구매시 부여되는 포인트 제품가격의 10%제공됨
	
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10;
		
	}
}
