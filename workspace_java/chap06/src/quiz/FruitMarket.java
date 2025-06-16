package quiz;

public class FruitMarket {
	
		
//		필드
//		필드는 변수고 , 변수는 뭔가를 저장할수있음
		String name; 	// 업체명
		String address;  //업체주소
//		Fruit apple1 = new Fruit();
//		Fruit _tomato = new Fruit();
//		배열로 만들겠다
		
//		int [] arr = new Fruit [10];	참고
		Fruit[] fruits = new Fruit[10];
		
		
		
//		생성자 
//	  	new 하자마자 실행된느 메소드의 일종
		FruitMarket(String name,String address) {
			System.out.println();
			
			this.name = name;
			this.address = name;

//			apple1.name = " 사과";
//			apple1.price = 1000;
//			apple1.stock = 5;

//			_tomato.name = "토마토";
//			_tomato.price = 1000;
//			_tomato.stock = 5;
			init();
		}
		
		void init() {
//			apple1.name = " 사과";
//			apple1.price = 1000;
//			apple1.stock = 5;
//			
//			
//			_tomato.name = "토마토";
//			_tomato.price = 1000;
//			_tomato.stock = 5;
			
			fruits[0] = new Fruit();
			fruits[0].name  = "사과";
			fruits[0].price = 1000;
			fruits[0].stock = 5;

		}
		
		FruitMarket(String address){
//			this.name ="오픈예정"; 
//			this.address =address;
			this("오픈예정",address);
		}
		
//		 이것도 가능 
//		FruitMarket(String addr){
//			this.address =addr;
//		}
		
//		메소드  = 기능 (동작) 

		
		// 클래스도 만들어서 가보자  과일명 , 가격 , 재고 
		String _tomato = "토마토";
		int _tomatoPrice = 2000;
		
		String apple = "사과";
		int applePrice = 1000;
		
		
//		과일목록 전체 출력
//		메소드명 :  print
//		전달인자 :  없음
//		리턴타입 : void
		
		void print () {
			System.out.println(apple +","+applePrice+"원");
			System.out.println("수박");
			System.out.println("자두");
			System.out.println(this._tomato+", "+_tomatoPrice+"원");
		}
		
//		과일 가격 문의 
//		메소드명 : ask
//		전달인자 : 과일명 
//		리턴타입 : 가격 
		int ask (String fruitName) {
			if(apple.equals(fruitName)) {
			return applePrice;
		} else if (this._tomato.equals(fruitName)) {
			return _tomatoPrice;
		} else {
			System.out.println("그런과일 없습니다");
			return -1;
		}
			
			//과일추가기능
			//하는일 기존 배열에 새로운 과일 클래스를 추가 하는것
			// 메소드이름 :addFruit
			// 전달인자   :Fruit
			// 리턴 타입  : void
		
		
//			int ask2 (String fruitName) {
//				// 전체 과일중에서
//				for (int i =0; i < fruits.length; i++) {
//					// 전달받은 이름과 같은게 있다면
//					if (this.fruits[i].equals(fruitName)) {
//						//가격을 돌려줘라
//						return this.fruits[i].price;
//					}
//				void addFruit(Fruit fruit) {
////			//기존것의 마지막에 하나추가
//					this.fruit
//					//기존것 보다 하나큰배열 만들기
//					Fruit[] newFruits = new Fruit[this.fruits.length +1];
//						//기존것 복사
//						for (int i =0; i < fruits.length; i++) {
//							new
//						}
//						
//				}
			}
			
			}
	
		
		
