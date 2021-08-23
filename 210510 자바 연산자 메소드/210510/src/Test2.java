// 형변환 연습
public class Test2 {

	public static void main(String[] args) {
		int n = 10;
		double n2 = 12.3;
		char ch = 'a';
		
		// char-int 는 ASCII 코드에 의해 서로 사용 가능!
		// A: 65, a: 97;, 0: 48
		
		// 작은쪽에서 큰쪽으로   작------------------------------------>큰
		// byte(1)-shor(2)-int(4)-long(8)-float(4)-double(8)
		// 강제형변환: 큰->작 으로 값 대입시 필수로 강제형변환 필요함 !!
		// 자동형변환: 작->큰 으로 값 대입시 자동으로 형변환되서 형변환 필요없음 !!
		
		ch = 65; // 'A' : 65 를 ch에 대입  (아스키코드 사용됨)
		
		
		System.out.println("ch : " + ch);
		n2 = n; //int(4byte)->double(8byte), 작->큰, 자동형변환 !
		n = (int)n2; // double(8byte)->int(4byte), 큰->작, 강제형변환 필수!!

	}

}
