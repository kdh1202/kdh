package sec01.exam01;

public class ArrayExam02 {

	public static void main(String[] args) {

		
		/*
		 * 배열 Array
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 타입만 선언 할 수 있음
		 * 생성 할 때 전체 크기를 지정해줘야함 
		 * 생성된 여러 변수 들은  index 로 관리한다 (index 는 0부터 시작한다)
		 */
		
		
		// 선언
		int[] a1; // 자바 스타일
//		int []a;
		int a2[];  // c 스타일
		
		// 배열 변수는 참조 변수라서 null 을 넣울수 있다
		a1 =null; 
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		
		
		// 첫번째 []: int[] 
//		 int 로 이루어진 배열 변수타입
		// 두번째 []: new int[3]
//		배열의 크기 한번에 만들 변수의 개수를 뜻함
		// 세번째 []: score[0] 
//		만들어진 변수 중에서 몇번째인가 
		// index 는 0부터 시작한다 
		
		
		int[] score = new int[30];
		score[0]=90;
		score[1]=80;
		score[2]=75;
		System.out.println("score[1]:"+score[1]);
		System.out.println("score[1]:"+score[3]);
		// 한번에 여러 변수를 만들어 주는게 배열 
		// 대신 하나마다  지정해줘야한다 
		
		String[]  str = new String[3];
		System.out.println("str[0]:"+str[0]);
		
		// 배열 생성 후 기본값은
		// 0, false , null 로 초기화됨 

		
//		ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
//		길이가 3이라서 0~2까지만 사용 가능한데 100을 넣어서 예외 발생		
//		System.out.println("str[100]:"+str[100]);
		
		// 배열을 선언하는 2번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int [] i1 = new int[] {90,80,70};
		int [] i2 = null;		
		i2 = new int [] {90, 80 , 70};
		
		
		
		// 배열을 선언하는  세번째방법
		// 선언과 동시에 초기화 하는경우에만
		// new int [] 를 생략 할 수 있다
		
		int [] i3 = {90,80,75};
		int [] i4 = null;
//		i4 = {90, 80, 70};
		int sum = 0;
		
		int [] scores = {83, 90, 87};
		for(int i =0; i<3; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
			System.out.println("총합:"+sum);
			double avg =(double)sum /3 ;
			System.out.println("평균:"+avg);
		
			
			
		// 배열의 길이 
		System.out.println(scores.length);
			
		int b0 =5;
		int b1 =15;
		int b2 =15;
		
		int[] bs0 = new int [3];
		bs0[0] = b0;
		bs0[1] = b1;
		bs0[2] = b1;
			
			
		int[] bs1 = new int [3];
		bs1[0] = b0+1;
		bs1[1] = b1+1;
		bs1[2] = b1+1;
			
		
		int [] [] bs = new int [10][3];
		bs[0] = bs0;
		bs[1] = bs1;
		
		System.out.println("bs.length:"+bs.length);
		System.out.println("bs.length[0]:"+bs[0].length);
		
		
//		배열,
//		반복문 사용해서 1~10까지 저장,
//		다른 반복문에서 출력

//		int[] a = new int[10];
//		 a[0] = 1;
//		for (a[0] = 1; a[0] < 11; a[0]++) {
//			System.out.println("a:"+a[0]);
//		} 
//		System.out.println(a[0]);
		
		
		int[] a = new int[11];
		a[0] =1;
		a[1] =2;
		a[2] =3;
		a[3] =4;
		a[4] =5;
		a[5] =6;
		a[6] =7;
		a[7] =8;
		a[8] =9;
		a[9] =10;
		
		
		for (a[0] = a[0]; a[0]< 11; a[0]++)
				 {System.out.println(a[0]);
				 }	
		for( int [] b =new int [a[0]]; b[0] < a[0]; b[0]++) {
			System.out.println(a[0]+"답:"+b[0]);
		}
		
		int []e1 = new int[10];
		for(int i= 0; i<10; i++) {
			e1[i] = i+1;
		} 
//		for (int i=0; i<10;i++) {
//			System.out.println("e1["+i+"]"+e1[i]);
//		}
		
		
		
		
		int [] f = {4,5,7,2,6,9};
		int [] f2 = new int[f.length];
		
		for(int i = 0; i<f.length; i++) {
			 System.out.println("f[i]:"+f[i]);
			 
		}
		

		for(int i = 0; i<f.length; i++) {
			System.out.println("f[i]:"+f[i]);
			}  
		
		for(int i = 0; i<f.length;i++) {
			System.out.println("f2:"+f[i]);
				f2[i]= f[i];
		}
			for (int i =0; i<f.length;i++) {
				int data =f[i];
				System.out.println(data);
			}
			// 향상된 for문
			for(int data :f) {
		           System.out.println("data:"+data);
		       }
			
		
//		int[] d1 = new int[] {1,2,3,4,5};
////		int[] d1 = {1,2,3,4,5};  이것도 배열이다 
//		int[] d2= d1;
//		int[] d3= {1,2,3,4,5};
//		System.out.println("d1 == d2 :"+(d1 == d2));
//		System.out.println("d1 == d3 :"+(d1 == d3));
//		
//		d2[1] = 10;
//		System.out.println("d1 :"+d1[1]);
//		// 10 나오는 이유 번지수가 같아서 
//		
		
		
//		문제 0
//		배열 깊은복사 :{1,2,3} ㅡ>{ 1,2 ,3}
		
		int[] cc = new int[3];
		for (int ss=0; ss < 3; ss++ ) {
			cc[ss] = ss+1; 
			System.out.println("0번문제"+cc[ss]);
		} 
		
		//  문 제 1 
		//배열 뒤집기 :{1,2,3} -> {3,2,1}
		
		int [] ff = new int[3];
		ff[0] = 1;
		ff[1] = 2;
		ff[2] = 3;
		
		for (int aa = 2; aa >=0 ;aa-- ) {
			ff[aa] = aa+1;
			System.out.println("1번 문제:"+ff[aa]);
		}
		
		
		
//		문제 2
//			{3,4,7,5,1,9,4}
//		여기서 홀수의 개수 찾기
		
		int[] d = new int [] {3,4,7,5,1,9,4};
		int cnt = 0;
		
		for( int df = 0; df <d.length; df++  ) {
			if ( d[df] %2 !=0 ) {
				System.out.println("홀수"+d[df]);
				cnt++;
			}  	
			 } 
		System.out.println("홀수 개수:"+cnt);
		
		
		 int cnt1 = 0;
			
//		문제 3 
//			{3,4,7,5,1,9,4}
//		여기서 4보다 큰수의 개수 구하기
			for(int s = 0; s< d.length;s++) {
				if(d[s] > 4) {
					System.out.println("4보다 큰수 :"+d[s]);
				 cnt1++;
				}
			} System.out.println("4보다 큰수 의개수:"+cnt1);
			
//		문제 4	
//		{3,4,7,5,1,9,4}
//		최대값을 출력하시오
			int max =0;
			for (int h = 0; h <d.length; h++ ) {
				if(d[h] > max ) {
					max = d[h];
				}
			}System.out.println("최대값 출력:"+max);
			
			
			int max4 = 0;
			int max3 = 0;
//		문제 5
//		여기서 두번쨰 큰 수 구하기
//			for (int j = 0; j <d.length; j++ ) {
//				if(d[j] > max3 ) 
//					max3 = d[j];
//			}System.out.println(max3);
//	
	
	
	
			
//		문제6
//		오른쪽으로 한칸밀기 왼쪽은 0으로 채우기
//		예시 :{0,3,4,7,5,1,9,4}
		
	
//			for ( d[0]=0; d[0] < d.length; d[0]++) {
//				System.out.println(d[0]);
				for (int xx= 0; xx < d.length; xx++){
					System.out.println(d[xx]);
				}
//			}
		
		
		
			
	
//		문제 7
//		오른쪽으로 이동하는대 맨끝에 값을 맨처음으로 보내기
//		{3,4,7,5,1,9,4}ㅡ> {4,3,4,7,5,1,9}	
			
			
			
//		문제 8
//		임시 비밀번호를 8자리 생성  랜덤 사용 
//		8-1 : 숫자만 	
//		8-2	: 소문자만 
//		8-3 : 숫자 2개 이상 , 대/소문자 각1개이상
		
		
//		문제 9
//		자리가 10개있는 소극장의 예약시스템
//		자리번호는 1~10번까지  번호의 자리가있음 
//		메뉴 : "1 .예약 2 모든 자석 현황 3. 잔여 좌석 0번 종료"
//		만약 1 : 예약이 가능하다면 "n번 자리 예약했습니다"
//		만약 2 :  예약이 불가능 하다면 "이미 예약 되어있습니다 "
			
			
//		문제10
//		로또 6개 생성  단 중복 없이			
		
		
		
			
			
	
	}	

}
