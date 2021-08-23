
public class Time {
	//외부 클래스에서 접근 불가인 private 변수를 정보 은닉이라고 함!
	private int hour;
	private int minute;
	private int second;
	private int arr[] = {1,2,3,4,5};
	
	Time(){
		this(10,10,10);
	}
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour(){	// 모든 클래스에서 접근 가능한 public 메소드!!
		return hour;
	}
	public int getMinute() {
		return minute;
	}public int getSecond(){
		return second;
	}
	public void setHour(int hour){
		if(hour < 0 || hour >=24){ // 0~23 사이가 아니면 참!
			System.out.println("시간은 0~23 사이만 가능합니다.");
			return;
		}
		this.hour = hour;
	}
	public void setMinute(int minute){
		if(minute < 0 || minute >=59){ // 0~59 사이가 아니면 참!
			System.out.println("분은 0~59 사이만 가능합니다.");
			return;
		}
		this.minute = minute;
	}
	public void setSecond(int second){
		if(second < 0 || second >=59){ // 0~59 사이가 아니면 참!
			System.out.println("초는 0~59 사이만 가능합니다.");
			return;
		}
		this.second = second;
	}
	public String toString(){ // Object 클래스의 toString 메소드 오버라이딩~!!
		return hour+"시"+minute+"분"+second+"초 입니다.";
	}
	public int[] getArr(){
		return arr; // 배열을 다루는 변수 arr를 리턴한다는 것은 원본배열 시작주소를 보내는 것!!
	}
		
	
	
}
