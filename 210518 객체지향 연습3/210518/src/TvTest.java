
public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		CaptionTv ctv1 = new CaptionTv();
		
		
		// ������(Ŭ������)�� ����ȯ�� �ݵ�� ���ϰ���(��Ӱ���,�θ� <->�ڽ�)
		
		// ctv1 = (CaptionTv)t1;
		// t1�� Ÿ���� Tv -> ctv1�� Ÿ���� CaptionTv(�ڽ�)
		// DownCasting(�ٿ�ĳ����)�� ����ȯ �ʼ�!!
		
		t1 = ctv1; // ctv1�� Ÿ���� CaptionTv(�ڽ�) = > t1��Ÿ���� Tv(����)
				   // UpCasting(��ĳ����)�� ����ȯ ���� ����!!!

		
		// ���⼺ : ����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �ٷ� �� �ִ� ��!
			//Tv t2 = new CaptionTv();
		// CaptionTv ctv2 = new Tv();�� error! 
				
		ctv1.text = "hello java!";
		ctv1.caption();
		
		System.out.println("t1.channel : " + t1.channel);
		t1.channelUp();
		t1.channelUp();
		System.out.println("t1.channel : " + t1.channel);

	}

}
