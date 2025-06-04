package sec03.exam03;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {

		// 조건
		int i = 1;
		while(i<=10){
		System.out.println(i);
		i++;
		}
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 메뉴를 고르시오
		 * 1: 커피, 2:차 ,0:종료
		 */
//		System.out.println("메뉴를 골시오");
//		System.out.println( " 1: 커피, 2:차 ,0:종료");
//		int menu = scan.nextInt();
//		
//		
//		if (menu == 1) {
//			System.out.println("커피 드릴게요");			
//		} else if (menu == 2) {
//			System.out.println("차 드릴게요");
//		} else if (menu == 0) {
//			System.out.println("주문을 종료합니다");		
//		} else {
//			System.out.println("주문을확인하세요");
//		}
//			
//		
//		System.out.println("메뉴를 골시오");
//		System.out.println( "1: 커피, 2:차 ,0:종료");
//		 menu = scan.nextInt();
//		
//		
//		if (menu == 1) {
//			System.out.println("커피 드릴게요");			
//		} else if (menu == 2) {
//			System.out.println("차 드릴게요");
//		} else if (menu == 0) {
//			System.out.println("주문을 종료합니다");		
//		} else {
//			System.out.println("주문을확인하세요");
//		}
		

//		int menu = scan.nextInt();
		
		int menu = -1;
		while(menu != 0) {

			System.out.println("메뉴를 고르시오");
			System.out.println( " 1: 커피, 2:차 ,0:종료");

			menu = scan.nextInt();
			
			if (menu == 1) {
			System.out.println("커피 드릴게요");			
		} else if (menu == 2) {
			System.out.println("차 드릴게요");
		} else if (menu == 0) {
			System.out.println("주문을 종료합니다");		
		} else {
			System.out.println("주문을확인하세요");
		}
		}
		
		
		
	
		
	}

}
