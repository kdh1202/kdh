package sec01.exam01;

public class VarTypeExam02 {

	public static void main(String[] args) {

		byte b1;
		b1 = 127;
		System.out.println("b1:"+b1);
//		b1 = 128;   지정 된는값이 127 까지 이기 떄문에 못쓴다 
		
		char c1 = 65;
		System.out.println("c1:"+c1); //  10진법에 65가 A라고 인식
		c1 = 65 + 2; //
		System.out.println("c1:"+c1);// 이렇게하면 C 가 나와야됨
	    
		char c2 ='F'; //char 타입에만  ' ' 사용한다 글씨 한개만 사용가능  
		System.out.println("c2:"+c2);
		System.out.println("c1-c2:"+(c2-c1));
		
		char c3 = '한';
		System.out.println("c3:"+c3);
		System.out.println("c3:"+(c3+1));
		
		
	    String s1 = "김동현";
	    System.out.println("s1:"+s1);
	    
	    String s2 = "김\"동현";
	    System.out.println("s2:"+s2);
		
	    
	    String s3 = "김\t동\n현";             //   \n 엔터 쳐라  하는뜻
	    System.out.println("s3:"+s3);
	    
	    s3 = s3 + "글씨" + 3 + 2;             //   = 이후부터  왼쪽부터 시작 뒤에 3+2 는 문자로 이해되고
	    System.out.println("s3:"+s3);         //  ( 괄호) 안에 (3+2)는 5가 숫자가 된다 
	    
	    
	    String s4 = 3+2+ "글씨";              // 숫자 먼저 더하기 하면  숫자먼저 인식하며 5가 된다
	    System.out.println("s4:"+s4);         //
	    
	    int i1 = 2100000000;
//      int i2 = 2200000000;
	    
	    
	    long l1 = 2200000000L;                //  Long에  끝에 L 또는l 을 붙이면 명시적인 long 으로 인식
	    long l2 = 123;                        //  안붙이면 무조건 int 로 인식 생각한다 
	    
	    
	    float f1 = 3.14f;                     //  f 를 붙여줘야됨  롱과 같은의미
	    System.out.println("f1:"+f1);
	    double d1 = 3.14;
	    System.out.println("d1:"+d1);
	                                           // float 은 소수점 7자리만 믿을만하다 8자리 저장가능
	    float f2 =0.123456789f;               //  float 의 정밀도 : 소수점 7자리 
	    System.out.println("f2:"+f2);         // f2:0.12345679
	    
	    
	    double d2 = 0.12345678901234567890;
	    System.out.println("d2:"+d2);         //double  의정밀도 : 소수점  16자리
	    
	    
	    
	    boolean stop = true;
	    boolean start = false;
	    
	    
	    
	    //문제 
	    // 내나이를 저장하시오 (age)
	    int age;
	    age = 31;
	    System.out.println("age:"+age);
	    
	    // 내소유의 착다 있다  car  
	    
	    boolean car =true;
	    
	    
	    //우리집의 있는 스마트폰의 갯수 phone
	    int phone;
	    phone = 2 ;
	    System.out.println("phone:"+phone);
	    
	    // 내이름 저장하는변수 name 
	    String  name;
	    name ="김동현";
	    System.out.println("name:"+name);		
	    //1평은 3.3 제곱미터 5 평은 몇제곱  area
	    
	    double area = 5*3.3;
        System.out.println("area:"+area);  
	    
	    
	    
	    //문제 0 
	    /* 
	     * 두변수 a,b 에 각각 3,4 를 넣고 
	     * 출력 "3과 4:
	     */
//        int a;
//        int b;
//        a = 3;
//        b = 4;
//        System.out.println(a+"과"+b+(3>4));
        
        
        
       // 퀴즈 1
        /*
         * 두변수 a,b 에 각각 3,4 를 넣고
         * 출력결과 : "3 > 4 결과는 fales 입니다"
         */
        
        {
         int a = 3;
         int b = 4;
        System.out.println(a+">"+b+"결과는"+(a>b)+"입니다"); }
        
        /* 퀴즈1-2
         * 두변수으 ㅣ값을 6,5변경
         * 출력 결과 "6>5의 결과는 true 입니다 "
         */
        
        
        {  
        	int a = 5;
        	int b = 6;
        System.out.println(b+">"+a+"결과는"+(b>a)+"입니다");
        }
        
        
        
        // 숫자 537  출력의 결과  백의 자리 5 십의자리 3 일을자리 7
        
        int num = 998;
        int bak = num / 100;
        System.out.println("백의자리:"+ bak);
        num = num - (bak*100);
        System.out.println("num:"+num);
        int ship =num / 10;
        System.out.println("십의자리:"+ ship);
        num = num-( ship*10);
	    System.out.println("num:"+num);
	    int il = num /1;
	    System.out.println("일의자리:"+il);
	    // 다시공부 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
