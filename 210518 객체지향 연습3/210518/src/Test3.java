//instanceof 연산자


public class Test3 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		// 참조변수가 참조하는 인스턴스 실제 타입인지 아닌지 체크하는 instanceof 연산자
		// 참조변수가 타입으로 Upcasting 되면 참!
		if(fe instanceof FireEngine){
			System.out.println("fe는 FireEngine 객체 입니다.");
		}
		if(fe instanceof Car){
			System.out.println("fe는 Car 객체 입니다.");
		}
		if(fe instanceof Object){
			System.out.println("fe는 Object 객체 입니다.");
		}

	}

}
