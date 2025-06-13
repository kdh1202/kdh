package sec03.exam03;

public class S {

	public static void main(String[] args) {

		
		
//		int 변수에 임의의 수를 넣고
//		그 수가 "양수", "0", "음수" 구분하여 출력
		int a = 1;
		if (a > 0) {
			System.out.println("양수");
		} else if (a == 0) {
			System.out.println("0");
		} else if ( a < 0) {
			System.out.println("음수");
		}
		
		
//		문제 2.
//		a와 b 두 수 중에서 큰 값을 출력
		
		a = 15 ;
		int b =12;
		if (a > b) {
			System.out.println( a );
		} else if (a< b ) {
			System.out.println(b);
		}
		
		
//		문제 3.
//		시간 과 분이 있을 때
//		35분이 지난 시간을 출력	
		int t = 7;
		int m = 40;
		int d = 20;
		int q = 60;
		int s = m+d;
//		System.out.println(s);
		
		
		if (  q <= s ) {
			System.out.println( (t+1)+ "시" +(s-q)+"분" );
		} else {
			System.out.println(t+"시"+s+"분");
		}

		
//		문제 4.
//		어떤 수가
//		15와 20 사이(포함)에 있는가?
		int c =19;
		if(c <= 20 && c >= 15) {
			System.out.println("포함 되어있습니다");
		} else {
			System.out.println("포함되어잇지 않습니다");
		}
		
		
		
		

//		문제 5.
//		통장 잔액이 10000원 있을 때
//		출금액에 따라
//		"잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"
		
		int don = 10000;
		int no = 10000;
		int eo = (don+no);
		int ee = (don-no);
		
		if ( no <= don ) {
			System.out.println((no) +"출금했고"+ (ee)+"남았습니다");
		}	else if (no > don)  {
			System.out.println("잔액이 부족합니다");
		}  	else {
			System.out.println("정확히 입력해주세요");
		}
		
		
		 
		
//		문제 6.
		
//		값에 따라(예를 들어 125)(단, 0은 양수+짝수)
//		"100 보다 큰 수이며, 양수이고, 홀수입니다"
//		예를들어 -6
//		"100 보다 작은 수이며, 음수이고, 짝수입니다"
		
		int ca = 5;
		if ( ca > 100 && ca % 2 == 1  ) {
			System.out.println("100보다 큰수 이며 양수이고 홀수");
		} else if (ca > 100 && ca %2 == 0) {
			System.out.println("100 보다 큰수이고 양수이고 짝수 ");
		}
		  else if (ca < 0 && ca %2 == 0) {
			System.out.println("100 보다 작은수이고 음수이고 짝수 ");
		}
		  else if (ca < 0 && ca %2 == -1) {
			  System.out.println("100 보다 작은수이고 음수이고 홀수 ");
		  }
		
		
		
		
//		문제 7.
//		어제 온도, 오늘 온도 변수 두개
//		2, -3
//		"오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다" 
		
		int today = -3;
		int yesterday = -5;
		if (today < yesterday ) {
			System.out.println("오늘온도는"+today +"입니다"+"어제보다"+(today-yesterday)+"낮습니다");
		} else if (today > yesterday ) {
			System.out.println("오늘온도는"+today +"입니다"+"어제보다"+(today-yesterday)+"높습니다");
		}
		
		
//		문제 8번.
//		변수에 두자리 숫자(10~99)가 있을 때
//		10의 자리와 1의 자리가 같은 수인지 판단
 
		int asd=11;
		if ( asd%11 ==0) {
			System.out.println("같은수 ");
		}
		else {
			System.out.println("아닌수");
		}
		
//		문제 9번.
//		사각형의 한쪽 모서리 x1:10, y1:20
//		대각선 모서리       	x2:90, y2:100
////		이럴 때 새로운 점 x3, y3는 사각형에 포함되는가?
	     
	int x1 = 10;
	int y1 = 20;
	
	int x2 = 90;
	int y2 = 100;
	
	int x3 = 0;
	int y3 = 0;
	
		if(x1 < x2 && x3 ==(x1/x2)) {
			System.out.println(x3);
		}
	
		
	}

}
