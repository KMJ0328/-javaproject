
public class Audio extends Product {

	Audio() { // 이게 없으면 error! 왜냐면 조상클래스에있는 기본생성자가 안써져있기때문!
		super(50);
		
	}
	public String toString(){ //오버라이딩
		return "Audio";
	}

}
