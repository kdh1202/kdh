package quiz.cafe;

public class Alba {
	
	Cafe cafe;
	
	Alba(Cafe cafe){
		this.cafe = cafe;
	}
	
	void work(String menu, int count) {
		
		if( cafe instanceof Starbucks) {
			System.out.println("스타벅스입니다");
		}
		
		int money = cafe.order(menu, count);
		if(money == -1) {
			System.out.println("메뉴업성용");
		} else {
			System.out.println("금액"+money+"입니다");
		}
		
		void pay(int money) {
			System.out.println(cafe.pay(money)+"원 돌려줌");
			cafe.make();
		}
	}

}
