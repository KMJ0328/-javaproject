



public class Test5 {
	public static void main(String[] args) {
		System.out.println();
	}

	
	
	//오버 로딩: 메소드명이 같으면서,
	//1.매개변수의 개수가 다르거나
	//2.매개변수의 타입이 다르면 오버로딩
	//단,반환타입이나 매개변수명이 다른건 오버로딩과 관계없음.
	void add(){	}
	void add(double a){	}
	void add(int a){	}
	void add(int a,int b){	}
	
	
}
