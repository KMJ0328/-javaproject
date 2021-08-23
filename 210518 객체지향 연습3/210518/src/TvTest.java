
public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		CaptionTv ctv1 = new CaptionTv();
		
		
		// 참조형(클래스명)의 형변환은 반드시 상하관계(상속관계,부모 <->자식)
		
		// ctv1 = (CaptionTv)t1;
		// t1의 타입은 Tv -> ctv1은 타입이 CaptionTv(자식)
		// DownCasting(다운캐스팅)은 형변환 필수!!
		
		t1 = ctv1; // ctv1은 타입이 CaptionTv(자식) = > t1은타입이 Tv(조상)
				   // UpCasting(업캐스팅)은 형변환 생략 가능!!!

		
		// 다향성 : 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것!
			//Tv t2 = new CaptionTv();
		// CaptionTv ctv2 = new Tv();는 error! 
				
		ctv1.text = "hello java!";
		ctv1.caption();
		
		System.out.println("t1.channel : " + t1.channel);
		t1.channelUp();
		t1.channelUp();
		System.out.println("t1.channel : " + t1.channel);

	}

}
