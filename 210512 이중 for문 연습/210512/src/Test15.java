// ���� ���Ǳ� ���α׷�

// >> ��� ȭ�� <<
// �� �Է� : 1000
// ���� 1000���� �����̽��ϴ�.
//
// ====�޴�=====
//1. �ݶ�(500��)
//2.���̴�(600��)
//3.�ֽĽ�(700��)
//3.�ֽĽ�(700��)
//============
// �޴� �Է�: 1
// �ݶ� �����ϼ̽��ϴ�.

import java.util.*;
public class Test15 {
	public static void main(String[] args) {
		int n,input_money,total_money = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �Է�:");
		input_money = sc.nextInt();
		total_money += input_money; // total money = total money+ input money;
		System.out.print("���� " + total_money + "���� �����̽��ϴ�.\n");
		System.out.println("====�޴�=====");
		System.out.println("1. �ݶ�(500��)");
		System.out.println("2.���̴�(600��)");
		System.out.println("3.�ֽĽ�(700��)");
		System.out.println("4.����");
		System.out.println("============");
		
		
		for(;;){
			System.out.println();
			System.out.print("�޴� �Է�: ");
			n = sc.nextInt();
		
			if(n == 1){
				if(total_money <500){
					System.out.println("���� �����մϴ�.");
					System.out.print("�� �Է�: ");
					input_money = sc.nextInt();
					total_money += input_money;
				}else{
					total_money -=500; // total_money = input_money-500;
					System.out.print("�ݶ� �����ϼ̽��ϴ�.\n");
					System.out.print("���� " + total_money + "�� �ֽ��ϴ�.\n");
				}
		}else if (n == 2){
			if(total_money <500){
				System.out.print("���� �����մϴ�.");
				System.out.print("�� �Է�: ");
				input_money = sc.nextInt();
				total_money += input_money;
			}else{total_money -=600; // total_money = input_money-600;
				System.out.print("���̴ٸ� �����ϼ̽��ϴ�.\n");
				System.out.print("���� " + total_money + "�� �ֽ��ϴ�.\n");
			}
		}else if (n == 3){
			if(total_money <500){
				System.out.print("���� �����մϴ�.");
				System.out.print("�� �Է�: ");
				input_money = sc.nextInt();
				total_money += input_money;
			}else{
				total_money -=700; // total_money = input_money-700;
				System.out.print("�ֽĽ��� �����ϼ̽��ϴ�.\n");
				System.out.print("���� " + total_money + "�� �ֽ��ϴ�.\n");
			}
		}else if(n==4){
			System.out.print("=======����=======");
			System.out.println("�ܵ���"+ total_money + "�� �Դϴ�.");
			System.exit(0);
		}else{
			System.out.print("1~4�� �Է°����մϴ�\n");
		}
		}	
		}	
		}
