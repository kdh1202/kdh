package sec03.exam03;

public class ForExam {

	public static void main(String[] args) {

		
//		for(int i=1; i<=100; i = i+2 )
//		for(int i=1; i<=100; i = i+1 )		
		
		int sum = 0;
		for(int i=1; i<=100; i++ ) {
			sum = sum +i ;
		}
		System.out.println("1~100까지의합:"+sum);	
		
		
		
		int sum1 = 0;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		sum1 = sum+1;
//		System.out.println(sum1);
//		
		
		for (int i = 1; i <= 10; i= i+1 ) {
			sum1 = sum1 +1;
		}
		System.out.println(sum1);
		
		//1 부터 5까지으 합을 구하는방법
//		int sum = 0;
//		for(int i=1; i<=100; i++ ) {
//			sum = sum +i ;
//		}
//		분해해보자
		int i = 1;
		sum = 0;
		
		
		sum = sum + i; //  i:1
		i++;
		
		sum = sum + i; //  i:2
		i++;
		
		//구구단 2단을 출력하시오
		int sum3 = 0;

		sum3 = sum3 +2;
		System.out.println(sum3);
		sum3 = sum3 +2;
		System.out.println(sum3);		
		sum3 = sum3 +2;
		System.out.println(sum3);		
		sum3 = sum3 +2;
		System.out.println(sum3);		
		sum3 = sum3 +2;
		System.out.println(sum3);
		sum3 = sum3 +2;
		System.out.println(sum3);
		sum3 = sum3 +2;
		System.out.println(sum3);
		sum3 = sum3 +2;
		System.out.println(sum3);
	
		
		
		/*
		 * 반복문 만드는 원리 
		 * 
		 * 1. 반복되는것찻기
		 *  Ctrl +c, v 했을떄 바뀌지않는것
		 * 
		 * 2. 반복되지 않는것에서 규칙(패턴)을 찾아라
		 *    변수를 활용해서 더이상 바뀌지않게 만들기 
		 * 
		 * 3. 시작조건파악
		 * 4. 종료조건파악
		 * 
		 * for : 반복 횟수를 아는경우
		 * while : 반복횟수를 모르는경우 
		 */
		
		int i2 = 1;
		System.out.println(i2);
		i2 = i2 +1;
		
		System.out.println(i2);
		i2 = i2 +1;
		
		System.out.println(i2);
		i2 = i2 +1;
		
		
		for(int i3 = 1; i3 <=3; i3 = i3 +1) {
			System.out.println(i3);
		}
		
		int sum4 = 0;
		
		// 2~10 까지중 짝수만 출력
		
		
		for(int rr = 2; rr <= 10; rr= rr+2) {
			System.out.println("짝수:"+rr);
		}
		
		// 10 부터 1까지 출력
		int r = 10;
		for (r = 10; r >= 1; r = r-1) {
			System.out.println("내려가기"+r);
		}
		
		// 1~10 까지 출력  1홀수 2 짝수
	
		
		
		
		for (int a = 1; a <= 10; a = a +1  ) {  
			if  ( a%2 > 0  ) { 
			System.out.println("홀수");
			}else { 
			System.out.println("짝수");}
		}
		
//		int c = 2;
//			for ( c = 2; c <= 18; c = c + 2 ) {
//				System.out.println( "2단:"+ c );				
		
//		for(int c = 1; c >=9 ; c=2) {
//			System.out.println(c*2);
//		}
		
		
		
		//5  1~10까지 3 개씩옆으로 찍기
		
		System.out.println("1 2 3");
		System.out.println("4 5 6");
		int i10 =1;
		System.out.println(i10+""+(i10+1)+ ""+(i10+2) );
				
		i10 = i10 +3;
		System.out.println(i10+""+(i10+1)+ ""+(i10+2) );
		
		for(int j=1; j<=10; j += 3 ) {
			if(j != 10) {
				System.out.println(j+ " "+(j+1)+" " +(j+2));
				} else {
					System.out.println(j);
				}
				}
		// 1 2 3 
		// 4 5 6
		// 7 8 9 
				// 1부터 100까지 홀수의 개수

		// 1 2 3 4 5

		int count = 0;    //밖에다 두고 사용해야한다
		for (int j =1; j <=100; j++) {
			if(j%2 != 0 ) {        //홀수
				count++;
			}
		}
		System.out.println("count:"+count);
		
		// 구구단 전체 출력
		
		
		for(int iu =2; iu <=9; iu++) {
			System.out.println(iu+"단");
				for(int ui = 1; ui <= 9; ui++) {
					System.out.println(iu+" x "+ui+" = "+(iu*ui)+" ");
				}
				System.out.println();
		}
		
		
		// 두단씩 옆으로 출력
		
		
		for(int s = 2; s <= 9; s++) {
			System.out.println(s+"단");{
				for(int d = 1; d <= 9; d++)
				System.out.println(s+"x"+d+"="+(s*d)+"");
			}
		}
			
			
			/////////////////////
			/*
			  
			  
			  
			 */
			
			//0 단계 
			
	/*		
			+
			+
			+
			+
			+
	*/		
			
			
//			System.out.println("+");
//			System.out.println("+");
//			System.out.println("+");
//			System.out.println("+");
//			System.out.println("+");
//			
//			for(int j=1; j<=5; j++) {
//				System.out.println("+");
//			}
//			
//			//1단계
//			for(int g = 1; g <=5; g++) {
//				System.out.print("+");
	//		}
//				String mark ="+";
//				System.out.print(mark);
//				System.out.print(mark);
//				System.out.print(mark);
//				System.out.print(mark);	
//		
//		}
		String mark ="+";
			//2단계 
//		String space =".";
//		for(int d =1; d<=5; d++)
//		System.out.print(mark+space);
//		System.out.println()
//		;
//		
//		for (int s = 1; s <= 5; s++) {
//			System.out.print(mark );
//			}
//			System.out.println();
//		
		for (int d = 1; d <= 3; d++) {
			{	for(int f = 1; f <=5; f++) 
				System.out.print(mark);
			}		System.out.println();
		
		    }	
		//3.5  11111
		//	   22222		
		//	   33333				
		//	   44444	
		//	   55555
			
		for (int a = 1; a <= 5; a++) {
			{for(int b = 1; b<=5; b++)
					System.out.print(a);
			}		System.out.println();
		}
		
		
		// 4444
		
		//	1 
		//	22
		//	333
		//	4444
		//	55555
		
		
		
		for (int iq =1; iq <= 5; iq++){
			for(int iw = 1; iw <= iq ; iw++) {
		    	System.out.print(iq);}
				System.out.println();
			
		}
		
		
//		맨왼쪽부터 한줄당 1열 하나씩 늘려간다 
		

//		// 6단계
//	    +
//	    ++
//	    +++
//	    ++++
//	    +++++

		for (int iq =1; iq <= 5; iq++){
		for(int iw = 1; iw <= iq ; iw++) {
		    	System.out.print(mark);}
				System.out.println();
		}
		
		
//	// 7단계
//	    11111
//	    2222
//	    333
//	    44
//	    5


		for (int a= 1; a <= 5; a++) {
			for(int b = 5; b >=a ; b--) {
		 System.out.print(a);
			}System.out.println();
		}
			
//		for (int i1 = 5;i1 >= 5;i1--) {
//				{for (int i101 = 1; i101 >=5 ; i101--) 
//					System.out.print(6-i101);
//			}System.out.println();
//			}
//	// 8단계
//	    +....
//	    ++...
//	    +++..
//	    ++++.
//	    +++++
String art = ".";

		for (int a = 1 ;a <= 5 ;a++) {
			{for (int b = 1; b <= a; b++) 
				System.out.print(mark);
					for(int e = 1; e <= 5 - a; e++) {
						System.out.print(art);	
					}
			}System.out.println();
		}		

//	// 9단계
//	    ....+
//	    ...++
//	    ..+++
//	    .++++
//	    +++++

		for (int a = 1 ;a <= 5 ;a++) {
			{for (int b = 1; b <= a; b++) 
				System.out.print(mark);
					for(int e = 1; e <= 5 - a; e++) {
						System.out.print(art);	
					}
			}System.out.println();
		}		
		
		
//	// 10단계
//	    ....+
//	    ...+++
//	    ..+++++
//	    .+++++++
//	    +++++++++
//
//	// 11단계
//	    ....+....
//	    ...+++...
//	    ..+++++..
//	    .+++++++.
//	    +++++++++
//
//	// 12단계
//	// 입력 받은 줄 수대로 출력
//	// 예를 들어 3이면
//	    ..+..
//	    .+++.
//	    +++++ 
		
		
		// 문제 1번 
		// 주사위 두개를  굴려서 나올수 모든 조합을 출력한다 
		// 
		String ddd = " ";
		for(int a = 1; a<=6; a++) {
				for(int b =1; b <= 6; b++) {
			System.out.print("["+a+" "+ b+"]");
				}
			System.out.println();
		}	
//				for (int c = 1; c <= 1; c++)
//					System.out.print(" ");
//					System.out.println(a+b);
		
			
	
		//문제 2번 
		// 주사위 2개의 합별로 나올수 있는 조합 
		// 합 2가 나오는 경우 [1,1]
		// 합 3이 나오는 경우 [1,2] [2,1]

		
		
		
		
		
		
		
		
		//문제 3번 
		// 합별로 조합의 수를 같이 출력 
	
		
		
		//문제 4번 
		//순서에 관계 없이  중복제거 
		//합: [1.1]
		//합" [1.2].[2.1] 같음
	
		
		for(int qq =1; qq<= 6; qq++) {
			for(int kk = qq; kk<=6; kk++) {
			 System.out.println("["+qq +","+ kk +"}");	
			}
			System.out.println();
		}
		
		
		

		//		문제  5번
		// 입력받은 정수에 따라 다음과 같이 출력 
		
		/*3
		 * 00 01 02
		 * 10 11 12
		 * 20 21 22
		 */
		 
		
		
		
		
		
		/*4
		 * 00 01 02 03
		 * 10 11 12 13
		 * 20 21 22 23
		 * 30 31 32 33
		 */
		
		
		
	
		
		
		
		//문제 6
		// 입력받은 정수에 따라 다음과 같이 출력 
		/*
		 * 3
		 * +++
		 * +.+
		 * +++
		 */
		
		
		
		/*
		 * 5
		 * +++++
		 * +...+
		 * +...+
		 * +++++
		 */
		
		
//		int z = 5;
//		for(int j = 1; j <= z; j++) {
//			for(int k = 1; k<=z; k++) {
//				if(j == 1 || j == z ) {
//					System.out.print("+");
//				} else {
//				System.out.print(".");
//				}
//			System.out.println();
//			}
//		}
//		
		
		
		
		
		
	}



}

		
