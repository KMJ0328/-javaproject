//저녁 메뉴 추천 프로그램



public class Test9 {
	public static void main(String[] args) {
		String menu[] = {"볶음밥","자장면","치킨","골뱅이","집밥","김밥","떢볶이","족발","라면","냉면"};
		
		int r,i;
		r = (int)Math.random()*10;
		System.out.print("메뉴는[ ");
		for(i=0;i<menu.length;i++){
			System.out.print( menu[i]+ " ");
		}System.out.print("] 입니다.\n");
		
		System.out.println("추천하는 오늘의 메뉴는..");
		System.out.println(menu[r] + "입니다.");

	}

}
