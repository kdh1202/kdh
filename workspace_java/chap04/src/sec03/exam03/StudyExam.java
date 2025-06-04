package sec03.exam03;

public class StudyExam {

	public static void main(String[] args) {

		
		/*	
		문제 1 
		int 변수에 임의의 수를 넣고 
		그수가 "양수" ,"0", "음수" 구분하여 출력 

		문제 2
		a와 b 두수주에서 큰값을 출력

		문제 3 
		시간과 분이 있을떄 
		35분이 지난 시간을 출력

		문제 4
		어떤수가 
		15와 20 사이(포함)에 있는가?

		문제 5.
		통장 잔액이 10000원 있다 
		출금액에 따라 
		"잔액이 부족합니다", "얼마 출급 햇고 얼마 남았습니다", "정확히 입력 해주세요" 

		문제 6.
		입력한 값에 따라  (예를 들어 125)
		" 100 보다 큰 수이며, 양수이고 , 홀수입니다 "
		예를 들어 -6
		" 100보다 작은수이며, 음수이고 , 짝수입니다"



		문제 7.
		어제 온도, 오늘 온도 변수 두개 

		"오늘 온도는 영하3도  입니다. 어제보다 5도 낮습니다 " 
		 


		문제 8번.
		변수에 두자리 숫자가 있을떄 
		10의 자리 숫자와 1의 자리가 같은수인지 판단



		문제 9번. 
		사각형의 한쪽 모서리 x1: 10 , y1:20
		대각선 모서리는    x2 : 90, y2:100
		이럴떄 새로운점 x3 와 y3는 사각형에 포함된는가

		*/	
		
		
//		문제 1 
//		int 변수에 임의의 수를 넣고 
//		그수가 "양수" ,"0", "음수" 구분하여 출력 

		int a = 33;
		if (a > 0) {
			System.out.println("양수");
		}  else if (a < 0){		
			
			System.out.println("음수");
		} else   {
			
			System.out.println("0");
		}
		
		
//		문제 2
//		a와 b 두 수주 에서 큰값을 출력
		
		int b =42;
		
		if (a > b) {
			System.out.println("a");
		} else if(a < b) {
			System.out.println("b");
		}
		
				
//		문제 3 
//		시간과 분이 있을떄 
//		35분이 지난 시간을 출력

		int hh =  24 ;
		int mm =  25+35;
		int hh2 =  hh % 24 ;
		int mm2 =  mm % 60 ;
		
		if (hh > 24  && mm > 60 ) {
			System.out.println( hh2+1  + "시" + mm2 + "분");
		}
				
		else if (hh > 24  && mm < 60 ) {
			System.out.println( hh2  + "시" + mm2 + "분");
		}

		else if (hh < 24  && mm > 60 ) {
			System.out.println( hh2+1  + "시" + mm2 + "분");
		}
		else if (hh < 24  && mm < 60 ) {
			System.out.println( hh2  + "시" + mm2 + "분");
		}
		else if (hh >= 24  && mm >= 60 ) {
			System.out.println( hh2+1  + "시" + mm2 + "분");
		}
		else if (hh < 24  && mm <= 60 ) {
			System.out.println( hh2+1  + "시" + mm2 + "분");
		}

		
//		문제 4
//		어떤수가 
//		15와 20 사이(포함)에 있는가?
		
		int c = 22;
		if (c >=15 && c <= 20 )
		{
			System.out.println("15 와 20 사이에 있다");
		}
		else 
			System.out.println("15와 20 사이에 있지않습니다");
		

			
//		문제 5.
//		통장 잔액이 10000원 있다 
//		출금액에 따라 
//		"잔액이 부족합니다", "얼마 출금 햇고 얼마 남았습니다", "정확히 입력 해주세요"
		
		
		int mo = 10000  ;
		int to = 10000 - mo;
		
		if (mo > 10000 && to > mo) {
			System.out.println("잔액이 부족합니다");
		} 
		 
		 if (mo < 10000 && to > mo ){
		System.out.println( mo + "출금했고"+ to +"남았습니다" );	
		}
		 else
			 System.out.println("정확히 입력해주세요");
		
		
//			문제 6.
//			입력한 값에 따라  (예를 들어 125)
//			" 100 /보다 큰 수이며, 양수이고 , 홀수입니다 "
//			예를 들어 -6
//			" 100보다 작은수이며, 음수이고 , 짝수입니다"

	      
	      int num = 105;
	      int sum = 100;
	      if (num > 100) {
	    	  System.out.println(sum+"보다 큰수이며");
	      }
	

//			문제 7.
//			어제 온도, 오늘 온도 변수 두개 
//			"오늘 온도는 영하3도  입니다. 어제보다 5도 낮습니다 " 
		 	
			
	      
//			문제 8번.
//			변수에 두자리 숫자가 있을떄 
//			10의 자리 숫자와 1의 자리가 같은수인지 판단

			
			
//			문제 9번. 
//			사각형의 한쪽 모서리 x1: 10 , y1:20
//			대각선 모서리는    x2 : 90, y2:100
//			이럴떄 새로운점 x3 와 y3는 사각형에 포함된는가

		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}
}


