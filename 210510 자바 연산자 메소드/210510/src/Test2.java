// ����ȯ ����
public class Test2 {

	public static void main(String[] args) {
		int n = 10;
		double n2 = 12.3;
		char ch = 'a';
		
		// char-int �� ASCII �ڵ忡 ���� ���� ��� ����!
		// A: 65, a: 97;, 0: 48
		
		// �����ʿ��� ū������   ��------------------------------------>ū
		// byte(1)-shor(2)-int(4)-long(8)-float(4)-double(8)
		// ��������ȯ: ū->�� ���� �� ���Խ� �ʼ��� ��������ȯ �ʿ��� !!
		// �ڵ�����ȯ: ��->ū ���� �� ���Խ� �ڵ����� ����ȯ�Ǽ� ����ȯ �ʿ���� !!
		
		ch = 65; // 'A' : 65 �� ch�� ����  (�ƽ�Ű�ڵ� ����)
		
		
		System.out.println("ch : " + ch);
		n2 = n; //int(4byte)->double(8byte), ��->ū, �ڵ�����ȯ !
		n = (int)n2; // double(8byte)->int(4byte), ū->��, ��������ȯ �ʼ�!!

	}

}
