// switch문 연습 (문자)

import java.util.*;


public class Test7 {
	public static void main(String[] args) {
		char ch = 'a'; 
		Scanner sc = new Scanner(System.in);
		
		switch(ch){
		case 'A': 
		case 'a': System.out.println("apple"); break;
		case 'B': 
		case 'b': System.out.println("banana"); break;
		default: System.out.println("과일 없음");
		
		}

	}

}
