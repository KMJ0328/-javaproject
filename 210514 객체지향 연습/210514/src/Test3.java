



public class Test3 {
	public static void main(String[] args) {
		Card c1 = new Card(); // 梓端 c1持失 
		Card c2 = new Card(); // 梓端 c2持失
		
		
		
		Card.width = 50;
		Card.height = 80;
		
		
		c1.kind = "heart";
		c1.number = 7;
		System.out.println("c1.kind = " + c1.kind);
		System.out.println("c1.number = " + c1.number);
		System.out.println("c1.width = " + Card.width);
		System.out.println("c1.height = " + Card.height+"\n");
		c2.kind = "spade";
		c2.number = 4;
		System.out.println("c2.kind = " + c2.kind);
		System.out.println("c2.number = " + c2.number);
		System.out.println("c2.width = " + Card.width);
		System.out.println("c2.height = " + Card.height);
		
		
	}

}
