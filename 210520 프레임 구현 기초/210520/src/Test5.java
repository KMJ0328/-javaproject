// java.lang 패키지 내에는 아래 클래스 들어 있음~
// String, System, Object, Math...

//Object클래스의 toString() 메소드: 클래스명@16진수해시코드
//Object클래스의 equals () 메소드: 객체 자신과 주어진 obj(객체)를 비교해서 true/false로 변환
public class Test5 {
	public static void main(String[] args) {
		String n;
		String str = "hello";
		String str2 = new String("hello~!!");
		int n2;
		double n3;
		// 랩퍼클래스: 기본형(8개)을 클래스로 만들어 놓은 것!
		n2 = Integer.parseInt("1234"); // 문자열 ->숫자
		n3 = Double.parseDouble("12.34"); // 문자열->실수
		
		String.valueOf(true);
		n = str.valueOf(123); // 숫자를 문자열로 바꿔주는게 valueof
		System.out.println(n);
		System.out.println(str.toString());
		System.out.println(str2.toString());
		
		Person p1 = new Person(654616544465L);
		Person p2 = new Person(654616544465L);
		
	
		System.out.println(p1.equals(p2));
		System.out.println(p1.id == p2.id);
	}

}
