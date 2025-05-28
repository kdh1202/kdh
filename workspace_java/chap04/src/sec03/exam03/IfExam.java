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
		double random1 = Math.random();
		System.out.println(random1);
		
		// Math.random ()
		// 0 <= Math.random < 1
		// 주사위 = 1~6
		// 대충 나머지 구하는법
		double random2 = Math.random()*10000;
		int dice = ((int)random2) % 156132 +1;
		System.out.println(dice);
		
		
//		if ( dice % 3 == 0 )  
//		{
//		System.out.println("불꽃마법");	
//		}  else 
//		if (dice % 7 == 0)
//			
//		{
//		System.out.println("얼음마법");	
//		} else
//		{
//			System.out.println("마법의 자격이 없지");
//		}
		
		


	

		
		
		
		
		
	}

}
