// 음료 자판기 프로그램

// >> 결과 화면 <<
// 돈 입력 : 1000
// 현재 1000원을 넣으셨습니다.
//
// ====메뉴=====
//1. 콜라(500원)
//2.사이다(600원)
//3.핫식스(700원)
//3.핫식스(700원)
//============
// 메뉴 입력: 1
// 콜라를 선택하셨습니다.

import java.util.*;
public class Test15 {
	public static void main(String[] args) {
		int n,input_money,total_money = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("돈 입력:");
		input_money = sc.nextInt();
		total_money += input_money; // total money = total money+ input money;
		System.out.print("현재 " + total_money + "원을 넣으셨습니다.\n");
		System.out.println("====메뉴=====");
		System.out.println("1. 콜라(500원)");
		System.out.println("2.사이다(600원)");
		System.out.println("3.핫식스(700원)");
		System.out.println("4.종료");
		System.out.println("============");
		
		
		for(;;){
			System.out.println();
			System.out.print("메뉴 입력: ");
			n = sc.nextInt();
		
			if(n == 1){
				if(total_money <500){
					System.out.println("돈이 부족합니다.");
					System.out.print("돈 입력: ");
					input_money = sc.nextInt();
					total_money += input_money;
				}else{
					total_money -=500; // total_money = input_money-500;
					System.out.print("콜라를 선택하셨습니다.\n");
					System.out.print("현재 " + total_money + "원 있습니다.\n");
				}
		}else if (n == 2){
			if(total_money <500){
				System.out.print("돈이 부족합니다.");
				System.out.print("돈 입력: ");
				input_money = sc.nextInt();
				total_money += input_money;
			}else{total_money -=600; // total_money = input_money-600;
				System.out.print("사이다를 선택하셨습니다.\n");
				System.out.print("현재 " + total_money + "원 있습니다.\n");
			}
		}else if (n == 3){
			if(total_money <500){
				System.out.print("돈이 부족합니다.");
				System.out.print("돈 입력: ");
				input_money = sc.nextInt();
				total_money += input_money;
			}else{
				total_money -=700; // total_money = input_money-700;
				System.out.print("핫식스를 선택하셨습니다.\n");
				System.out.print("현재 " + total_money + "원 있습니다.\n");
			}
		}else if(n==4){
			System.out.print("=======종료=======");
			System.out.println("잔돈은"+ total_money + "원 입니다.");
			System.exit(0);
		}else{
			System.out.print("1~4만 입력가능합니다\n");
		}
		}	
		}	
		}
