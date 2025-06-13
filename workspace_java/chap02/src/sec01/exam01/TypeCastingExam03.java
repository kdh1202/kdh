package sec01.exam01;

public class TypeCastingExam03 {

	public static void main(String[] args) {
		
		
		
		// 형 변환 연산자
		// type casting operator
		
		int intvalue = 10;
		byte bytevalue = (byte)intvalue;
		System.out.println(bytevalue);
		
		// 여기서 () 우선 순위 연산자
		int a = 2 * (3+4);
		
		// 여기서 ()
		
		intvalue = 200;
		bytevalue = (byte)intvalue;
		// 127을 넘어가기 떄문에 예상하기 힘들다 
		// 비트를 2의 보수로 계산한 결과가 나온다  
		System.out.println(bytevalue); 
		
		
		double d = -3.14;
		int i = (int)d;
		System.out.println("i:"+i);
		
		
		// long 이 int 보다 크기 떄문에 생략이 가능하다
		// byte < short < int < long < float < double 
		//  1       2      4     8     
		
		int i2 = 100;
		long l1 = (long)i2;
		long l2 = i2;
		
		int i3 = 3;
		long l3 = 4l;
		long l4= i3+ l3;
		//  자동형변환 ∧ (long)i3 + l3;
		
		
		int i4 = 2100000000;
		int i5 = 2100000000;
		int i6= i4 + i5;
		System.out.println("i6:"+i6); //-94967296
		
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7;         // (double)i7 +d7  이게 생략된것
		System.out.println("d8:"+d8);
		
		
		
	  //double d9 =	 10/4;   		   //10/4 앞에 (double)붙여야 나옴
	  //double d9 = 10.0 /4;	 	  실수 많이함 
		double d9 = (double)10/4;
		System.out.println("d9:"+d9);      
	   
		
		
	// 문자를 숫자로 바꾸기

		String s1 = "123";
	// int i8 = (int)s1;
	   int i8 = Integer.parseInt(s1);
       
     //가장 쉽게 숫자를 문자로 바꾸는방법
        String s2 = ""+i8;
		
        
        
        //회식비 43000원 
        //참석인원 4명   인당 
        //이떄 인당 얼마 내야하는가
        //1 . 디테일하게 원단위 까지
      
  
        double total = 4.3;
 		int count = 4;
 		double result1 = total / count ;
 		System.out.println(result1);
 		//2 . 참석인원은 만원 단위로만 회식비를 낸다
     	
 		int result2 =(int)result1;
 		System.out.println(result2);
 
     		
     		
        //3 / 2번처럼 받으면 주최자는 얼마를 내냐
		
    	//	         주최자 =  원래값(4.3)  -  (4명중 - 1명)  *   한명이 내야할돈 (1만원)                                 
    		double resulst3  = total -       ((count-1)      *         result2);
        	System.out.println(resulst3);
	
		double sss = 4.3;
		int ddd = 4;
		double aaa = sss/ddd;
		System.out.println(aaa*10000);
		
		
		double zzz = (int) aaa;
		System.out.println((int)aaa*10000);
		
		double xxx = sss -((ddd-1)* zzz);
		System.out.println(xxx);
		
		
		
		
		
		
		
		
		//회식비 65234.5원 
        //참석인원 6명   인당 
        //이떄 인당 얼마 내야하는가
        //1 . 디테일하게 원단위 까지
		//2 . 참석인원은 천원 단위로만 회식비를 낸다
		//3 / 2번처럼 받으면 주최자는 얼마를 내냐
		
		
		
		double table = 6.5234;
		int human = 6;
		double sal  =  table / human;
		System.out.println(sal*10000);
		
		int sal2 = (int) table / human ;
		System.out.println(sal2*10000);
		
		double sal3 =  table -(human-1) * sal2;
		System.out.println(sal3*10000);
		
		
		
		


	    
	     
	    

	
	
	
	}

}
