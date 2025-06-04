package sec03.exam03;

import java.util.Scanner;

public class breakExam {

	public static void main(String[] args) {
		
		System.out.println("시작");
		 int  count = 0;
		 while (true) {
			 int num =(int)(Math.random()*6)+1;
			 System.out.println("주사위"+num);
			 
			 if (num == 6 ) {
				 break;
			 }
			 count++;	 
		}
		System.out.println("게임종료 : 총 :" +count);

	
		for(int i = 1; i <10; i++) {
			System.out.println(i);
			if (i >= 5) {	// hoxy 몰라서 
				break;
			}
		}
		boolean isStop = false;// 그런사건이 있었는지 ?
	
		// 총 5명ㅇ이 순차적으로 게임시작
			for (int i2 = 1; i2 <= 5; i2++) {

				// 한명당 주사위 3번씩 던지기
				for (int j2 = 1; j2 <= 3; j2++) {
					int num2 =(int)(Math.random()*6)+1;
					 System.out.println("주사위"+num2);
					
					 //만약 6이나오면 전체게임종료
					 if (num2 == 6 ) {
						 isStop = true;
						 break;
					 }
				}
				if(isStop) {
					break;
				}
			}
			
			
			
			for(int i =1; i<= 10; i++) {
				if(i % 2 == 0) {  //짝수일떄 만출력해라
					System.out.println(i);
				}
			}
			
			for(int i =1; i<= 10; i++) {
				if(i % 2 != 0) {  // 홀수일떄는 건너 뛰어라
					continue;
				}
				System.out.println(i);
			}
			
			
			// while 
			// 특정 수 (0) 이 오기전까지 반복
			// 수를 입력하세요
			// -3 입력시 "음수"
			// 나머지는 "양수" 
			int a = -10;
			
			// 0 까지 반복 
			//
			
			while(a <= 0) 
			{if(a < 0) {
				System.out.println( a +"음수");
			}	else   {
				System.out.println(a +"양수");
			}a++;
				}

			  
			
			
			// 2번 
			// 월 을 입력하면 계절이 나오고 
			//  0을 입력하면 종료 
			Scanner scan = new Scanner(System.in);
//			
//			 int b = 1;
//			 while (b != 0) {
//				
//				System.out.println("월을 골라줘");
//				
//				
//				b = scan.nextInt();
//				
//				
//					if ( b <= 3 && b > 0) {
//					System.out.println("봄");
//					}
//					
//					else if (b <= 6 && b > 0){
//					System.out.println("여름");
//					}
//					
//					else if (b <= 9 && b > 0 ) {
//					System.out.println("가을");
//					}
//					
//					else if (b <= 12 && b > 0 ) {
//					System.out.println("겨울");
//					} 
//				
//					else if (b == 0)	{					
//					System.out.println("종료");
//					}
//			}
						
	
			
			
			// 문제 3
			// 가위바위보 게임 0이 입력될떄 까지 반복 
			
			int aa = 1;   //(int)(Math.random()*3)+1  ; // 가위
			
			while (aa != 0) {
				aa = scan.nextInt();
				if ( aa ==  1) {
				System.out.println("가위");
				}
				
				else if (aa == 2 ){
					System.out.println("바위");
				}
				
				else if ( aa == 3) {
					System.out.println("보");
					aa++;
				}
				else if (aa > 3 ) {
					
				}
				
			} 	
			 
			 
			 
			//문제 4번 
			// 은행에서 
			// 1. 예금 , 2. 출금,3. 잔고확인 ,4.종료 
			
			// 조건 
			// 예금 할 때 음수 불가 
			// 출금 할 때 음수 불가 , 잔고보다 큰 금액 불가  
			
			
			
			
			
			
	}

}
