// java.lang ��Ű�� ������ �Ʒ� Ŭ���� ��� ����~
// String, System, Object, Math...

//ObjectŬ������ toString() �޼ҵ�: Ŭ������@16�����ؽ��ڵ�
//ObjectŬ������ equals () �޼ҵ�: ��ü �ڽŰ� �־��� obj(��ü)�� ���ؼ� true/false�� ��ȯ
public class Test5 {
	public static void main(String[] args) {
		String n;
		String str = "hello";
		String str2 = new String("hello~!!");
		int n2;
		double n3;
		// ����Ŭ����: �⺻��(8��)�� Ŭ������ ����� ���� ��!
		n2 = Integer.parseInt("1234"); // ���ڿ� ->����
		n3 = Double.parseDouble("12.34"); // ���ڿ�->�Ǽ�
		
		String.valueOf(true);
		n = str.valueOf(123); // ���ڸ� ���ڿ��� �ٲ��ִ°� valueof
		System.out.println(n);
		System.out.println(str.toString());
		System.out.println(str2.toString());
		
		Person p1 = new Person(654616544465L);
		Person p2 = new Person(654616544465L);
		
	
		System.out.println(p1.equals(p2));
		System.out.println(p1.id == p2.id);
	}

}
