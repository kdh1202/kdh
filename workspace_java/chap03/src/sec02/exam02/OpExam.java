package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {
		
		int x = 10;
	// 1 을 더한다 	
		x++;
		System.out.println("x:"+x);
	// 2를 더한다 	
		++x;
		System.out.println("x:"+x);
		
		x = 10;
		
		x = x + 1; // 11 
		x += 1;    // 위와 같은 코드
		x++;       // 위와 같은 코드 
		           // 단 ,1을 증가 할떄만 사용
		
		int y = 10;
		y--;
		--y;
		System.out.println("y:"+y);
		
		x = 10;
		int z = ++x;
		System.out.println("z:"+z);
		
		
		x = 10;
		z = x++;  
		System.out.println("z: "+ z);   // 
		System.out.println("x: "+ x);   // x가 사용이 늦게 된다 
		
		
		x = 10;
		System.out.println("++x:"+ ++x);
		x = 10;
		System.out.println("x++:"+ x++);
		
		x = 1;
//      x++ 항이 넘어갈떄  , ++x
//         1    +     3
		z = x++ + ++x;
		System.out.println("z:"+z);
		System.out.println("x:"+x);
		
		
		x = 1;  
		// x = 1 >> 2 >> 1 >> 2 >> 1
		// 1   -   1 * 1   - 2
		// 1   -  (1 * 1)  - 2
		z = x++ - --x * x++ - x--;
//		z 값을 예측 해봐라  
		System.out.println("x:"+x +",z:"+z);
		System.out.printf("x: %d, z: %d", x,z);
		
		
		boolean a = false;
		a = !a;
		System.out.println("a:"+a);
	
		
//      나누기 할떄 0으로 나누지 않게 조심   

		
		int b = 10;
//		int c = b/0;
		
		double d = 7.3;
//		double e = d/ 0;
		System.out.println(d);
		
		
//		boolean 참과 거짓나눈다

		boolean f = 3 > 4;        
		System.out.println(0.1 == 0.1f);  // false 나오니 조심하자 
		
//	    소수점을 비교할 때는 같은 타입으로 변환해서 비교 하자
		
		
//      == 으로 비교된느경우도 있으나 아닌 경우도 있음
//      글씨는 무조건 equals로 비교한다 		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2));
		System.out.println( "ssss".equals(s2));
		
		
		
		System.out.println(10 % 3 );
		
		
//		퀴즈
//		난돈이 10000원 있따
//      1.4500원 짜리 프라프치노 를 최대 몇잔 살수있나요 ?
//      2. 그리고 남은돈 
		
		
//		int m = 10000;
//		int p = 4500;
//		int e = m / p ;
//		System.out.println(e);
//	
//		int j =  m % p;
//		System.out.println(j);
		
		
//		올리브영에 꿀홍차가 8000원
//		15% 세일
		
//		int ol = 8000;
//		double pl = 0.15; 
//		
//		double ql = ol -(ol * pl);
//		System.out.println("15프로 할인가:"+ql);
		
//		int ol = 8000;
//		double ql = ol - (ol* 0.15);
//		System.out.println(ql);
		
//      (ol*1) - (ol*0.15)		
//		ol * (1-0.15)
//		ol * 0.85
		
		
		
		int score = 87;
		System.out.println("내 점수는 80과 90사이다 참 거짓 ?:");
		// true /fales 출력
		System.out.println(  score >=80 && score <=90  );
	
		
		//957 -57 // 957 % 100//
		// a- (a%100)
		
		int k =1937;
//		k = k -(k%100);
//		k = k / 100;
//		k /= 100;
		k = k * 100;
		System.out.println("k:"+k);
		
		// v1 / v2  를 소수점 3자리 까지 출력하시오
		double v1 = 1000.0;
		double v2 = 794;
		double v3 = v1 /v2; 
		
//		System.out.println("%3f",v3);
//      (int)(v3* 1000) // 1259		
		
		v3 = ((int) (v3 * 1000))/1000.0;
		System.out.println(v3);
		
		
		double v4 = (v1 / v2) * 1000;
		int v5 = (int)v4;
		double v6 = (double) v5/1000;
		System.out.println("v6:"+v6);
		
		
		
		int s =95;
		String  grade = (s > 90) ? "A" : "b" ;
		System.out.println("grade:"+grade );
		

		
		
		
		double va = 1223.0;                   // a     원래 숫자
        double vb= 777.0;                     // b     나눌 숫자
        double bb = ( va / vb ) * 1000000;    // c     원래숫자에서 나눈다 곱하기 한다
        int aaa = (int)bb;                    // d     소수점은 없애고 인트로바꾼다
        double cc = (double) aaa/1000000;    // f     다시 소수점을 만드록 나줘해준다
        System.out.println(cc);
//		
		
	   
        
        
    	double a3 =  777787;                   // a     원래 숫자
        double a4 =  654.0;    
        double a5 = (a3/a4) * 10000 ;
        int a6 = (int) a5 ;
        double a7 =  (double)a6/10000;
        System.out.println(a7);
        
        
        
        
        
        
		
		
		
		
		
	}

}
