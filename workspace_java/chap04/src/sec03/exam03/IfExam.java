package sec03.exam03;

public class IfExam {

	public static void main(String[] args) {

		
		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A등급");
		} 
		
		if (score < 90) {
			System.out.println("90 미만입니다");
			System.out.println("B등급");
			
		}
		
		
		//else 가 있다는 건 무조건 하나의 실행 블럭이 실행된다

		
		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A등급");
		} else		
			 {
			System.out.println("90 미만입니다");
			System.out.println("B등급");
			
			
			
		}
		
		
		
		//else 사용
		
		if (score >= 90) {
			System.out.println("A등급");
		} else if(score >= 80){
			
			System.out.println("B등급");			
		}
		 
		  else if(score >= 70){
			 System.out.println("C등급");			
		}
		  else {
			System.out.println("D등급");			
		}
		
		
		
		score = 97 ;
		
		if (score >= 95) {
			System.out.println("90점 이상");
			System.out.println("95점 이상");
			
		} else if (score >= 90) {
			System.out.println("90점 이상");
		}
		
		
		
		
		
		
		
		if (score >= 90) {
			System.out.println("90점 이상");
			
//			if (score >= 90 && score >=95 )
	
		if (score >= 95) {
			System.out.println("95점 이상");
		}
		}
			
		
		if (score >= 90) {
			System.out.println("90점 이상");
		}  
//		위의 if 와 관계없이 무조건 판단한다
		if (score >= 95) {
			System.out.println("95점 이상");
		}
		
		
		int x = 3;
		
		if (x % 1 == 0)
		{
		System.out.println("홀수");
//		}else if ( x % 1  != 0){
//		}else if ( x % 2  ==1 )
		} else
		{
		System.out.println("짝수");
		}
	
		
		////////////////////////////////////
		//  random
		
		// Math.random ()
		// 0 <= Math.random < 1
		// 주사위 = 1~6
		// 0~5 로 구해놓고 +1을 해서 1~6 까지 로 만들겟따
		
		// 대충 나머지 구하는법
		// Math.random() : 0.123456789
		double random1 = Math.random();
		System.out.println(random1);
		double random2 = Math.random()*10000;
		//1234.5678
		//(int) 123456.56789 >> 1234
		// 1234 % 6 : 0 ~ 5
		int dice = ((int)random2) % 5 +1;
		System.out.println("주사위:"+dice);
		
		int dice0 = (int)(Math.random()*6);  //0 ~5 
		dice = dice0 + 1; // 1~6 
		System.out.println(dice0);
		
		//로또 번호 1~45
		
		int ddo = (int)(Math.random() * 45 +1);
		System.out.println(ddo);
		
		int num = 1;
		if (num ==1){
		System.out.println("num은 1 입니다");	
		
		} else if (num == 2) {
			System.out.println("num 은 2 입니다 ");
		} else {
			System.out.println("num 은 1과 2가 아닙니다");
		}
		
		// switch  는 int 이하 
		// 사용 가능 :char, byte ,short, ubt ,String 
		// 사용 불가 : boolean, long, float, double
		
		switch(num) {
		case 1:
			System.out.println("num 은 1 입니다");
		break;
		
		case 2:
			System.out.println("num 은 2 입니다");
		break;
		
		default :
			System.out.println("num은 1과 2가 아닙니다");
		break;		
		}
		
		
	// 봄 3 4 5 여름 678 가을 9 10 11 겨울 12 1 2	
	int month = 1;
	System.out.println(month);
	
	if (month >= 3  &&  month <= 5 ) {	
		System.out.println("봄");		
	} else if
	(month >= 6 &&  month <= 8) {
		System.out.println("여름");
	}else if
	(month >= 9 &&  month <= 11 ) {
		System.out.println("가을");
	}else if
	(month == 12 ||  month == 2 || month == 1 ) {
		System.out.println("겨울");
	}
	
	
	switch(month) {
//  case 3:
//  case 4:	
//	case 5:
//     System.out.println("봄");
//     break;
//    이게 훨씬 활용성이좋다
//      / / / / / / / / / // / / / / / /
	
	
	case 3:
		System.out.println("봄");
		break;
	case 4:
		System.out.println("봄");
		break;
	case 5:
		System.out.println("봄");
		break;
	case 6:
		System.out.println("여름");
		break;
	case 7:
		System.out.println("여름");
		break;
	case 8:
		System.out.println("여름");
		break;
	}
	
//	int i = 10;
//	if(i > 5 ) {
//		System.out.println("5보다 크다");
//	}
//	if(i < 0 ) {
	//	System.out.println("5보다 작다");
//	}
	// if 한줄만있을떄  중괄호가 생략이 가능하나 
	//  쓰지마라 실력부족
	// 망칠수도 있따
	
	
	int sum = 0;
	sum = sum +1;
	sum = sum +2;
	sum = sum +3;
	sum = sum +4;
	sum = sum +5;
	System.out.println("1~5의합:"+sum);
	
 
	 
		
	for (int i=1; i <=100; i++) {
		sum = sum +  i;		
	}
	
	System.out.println(sum);
	
	

	
	
	
	
	
	
	
	
	
	}
}