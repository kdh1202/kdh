package quiz.cafe;

import java.util.ArrayList;
import java.util.HashMap;

public class Cafe {
	
//	가격 + 메뉴 
//	가게이름
//	비품
//	건물
//	직원
	String building;	// 건물명
	String name;		// 가게이름
	int emp; 			// 직원 수
	private HashMap menuMap; 	// 메뉴 : 가격
	
//	void getMenuMap()
	
	void setMenuMap(HashMap menuMap){
		this.menuMap = menuMap;
	}
	
	ArrayList List;		//비품
	int money = -1;		// 받아야 하는돈  
	String menu;
	int count;
	
//	생성자 // 카페차리기
	Cafe(String building, String name, int emp,HashMap menuMap ){
		this.building = building;
		this.name = name;
		this.emp = emp;
		this.menuMap = menuMap;
	}
	Cafe(String building, String name){
//		HashMap m = new HashMap();					
		this(building, name, 0,null);		//전달인자로 new 하는 경우도 많으니 알고있어야함
	}
	
//	건물명 설정
//	가게이름
//	직원 고용 
//	메뉴 가격 설정

//	주문받기   
//	메뉴와 개수를 입력하면 
//  메뉴의 가격을 구하고 
//	메뉴가 없으면 -1 return
//	메뉴가 있으면 개수를 곱해서 return
	int order(String menu, int count) {
		System.out.println("주문 내역");
		System.out.println("메뉴 : "+ menu);
		System.out.println("count : "+ count);
		
		int money = -1;

		if(this.menuMap.get(menu) != null ) {
			money = (int)this.menuMap.get(menu) * count;
			this.menu = menu;
			this.count = count;
		}
		this.money = money;
		return money;
	}
//	결제하는 메소드 
//  메소드명 :pay
//	전달인자 :int money, 
//	리턴타입 :int 거스름돈  
	int pay(int money) {
		if(this.money == -1) {
		//주문내역이 없는 경우
			return money;
		} else if( this.money <= 1) {
		// 받은 금액이 결제할 금액 이상
			return money - this.money;
		// 받은 금액이 결제할 금액 미만 
		} else  {
			return money;
		}
	
	}
//	메소드
	
//	서빙
// 	메소드명 : serve
//	전달인자 : 없음
//  리턴타입 : void
	void serve() {
		System.out.println("주문하신 "+this.menu+","+this.count+"개 나왔습니다");
	}
	
	void make() {
		System.out.println("우리는"+this.menu+"만든다");
		// 랜덤으로 커피 결과물 선택
		
		serve();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
