package sec01.exam01;

public class ArrayQuizExam03 {

	public static void main(String[] args) {

		
		
//		문제 0
//		배열 깊은복사 :{1,2,3} ㅡ>{ 1,2 ,3}
		int [] array = new int[] {1,2,3,};
		int [] array2 = new int[3];
		
		array2 = array;
		
		for(int i=0; i < array2.length; i++ ) {
			System.out.print(array2[i]);
		}
		System.out.println();
		
		//  문 제 1 
		//배열 뒤집기 :{1,2,3} -> {3,2,1}
		
		for(int i = array2.length-1; i >= 0 ; i-- ) {
			System.out.print(array2[i]);
		}
		System.out.println();
		
		
//		문제 2
//			{3,4,7,5,1,9,4}
//		여기서 홀수의 개수 찾기
		
		int [] ary = new int[] {3,4,7,5,1,9,4};
		int cnt = 0;
		for(int i = 0 ; i < ary.length; i++) {
			if(ary[i]%2 != 0 ) {
				cnt++;
			}  
		}	 System.out.println("홀수의 개수"+cnt);
		
		
			
//		문제 3 
//			{3,4,7,5,1,9,4}
//		여기서 4보다 큰수의 개수 구하기
//		문제 4	
	
	
	
//		{3,4,7,5,1,9,4}
//		최대값을 출력하시오
			
			
			
//		문제 5
//		여기서 두번쨰 큰 수 구하기
			
	
	
	
			
//		문제6
//		오른쪽으로 한칸밀기 왼쪽은 0으로 채우기
//		예시 :{0,3,4,7,5,1,9,4}

//			System.out.println(d2[0]);
//			
	
//		문제 7
//		오른쪽으로 이동하는대 맨끝에 값을 맨처음으로 보내기
//		{3,4,7,5,1,9,4}ㅡ> {4,3,4,7,5,1,9}	
		// 같은 크기의 배열을 만들고
		// 원본의맨마지막 값을 사본의  맨처음에 넣기 
		// 나머지는 사본의 두번쨰 부터 시작
			
			
			
			
			
			
			
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
			//1 로또 번호 하나 뽑기
			//2 중복 체크

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//		    int[] lotto = new int[6];
//	        boolean flag = false;
//	        for(int i=0; i<lotto.length; i++) {
//	            do {
//	                flag = false;
//	                lotto[i] = (int)(Math.random()*45) + 1;
//	                for(int j=0; j < i; j++) {
//	                    if(lotto[j] == lotto[i]) {
//	                        System.out.println("중복:"+ lotto[i]);
//	                        flag = true;
//	                    }
//	                }
//	            } while( flag );
//	        }
//	        for(int i=0; i<lotto.length; i++) {
//	            System.out.print(lotto[i]+ ", ");
//	        }
//	        System.out.println();
//		
		
		
		
		
		
		
		
	}

}
