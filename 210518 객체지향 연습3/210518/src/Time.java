
public class Time {
	//�ܺ� Ŭ�������� ���� �Ұ��� private ������ ���� �����̶�� ��!
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
	
	public int getHour(){	// ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		return hour;
	}
	public int getMinute() {
		return minute;
	}public int getSecond(){
		return second;
	}
	public void setHour(int hour){
		if(hour < 0 || hour >=24){ // 0~23 ���̰� �ƴϸ� ��!
			System.out.println("�ð��� 0~23 ���̸� �����մϴ�.");
			return;
		}
		this.hour = hour;
	}
	public void setMinute(int minute){
		if(minute < 0 || minute >=59){ // 0~59 ���̰� �ƴϸ� ��!
			System.out.println("���� 0~59 ���̸� �����մϴ�.");
			return;
		}
		this.minute = minute;
	}
	public void setSecond(int second){
		if(second < 0 || second >=59){ // 0~59 ���̰� �ƴϸ� ��!
			System.out.println("�ʴ� 0~59 ���̸� �����մϴ�.");
			return;
		}
		this.second = second;
	}
	public String toString(){ // Object Ŭ������ toString �޼ҵ� �������̵�~!!
		return hour+"��"+minute+"��"+second+"�� �Դϴ�.";
	}
	public int[] getArr(){
		return arr; // �迭�� �ٷ�� ���� arr�� �����Ѵٴ� ���� �����迭 �����ּҸ� ������ ��!!
	}
		
	
	
}
