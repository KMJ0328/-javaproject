


public class Test6 {
	public static void main(String[] args) {
		String str = "  hello java!!  ";
		String str2 = "programing";
		String str3;
		
		
		System.out.println(str.substring(0, 5));
		// substring(0,5)는 index 0 부터~5 미만까지 추출!
		System.out.println(str.toUpperCase());
		System.out.println(str+"은 "+str.length()+"개");
		System.out.println(str.trim());
		System.out.println(str.charAt(3));
		System.out.println(str.concat(str2));
		str3 = str.concat("program");
		System.out.println(str3);
	}

}
