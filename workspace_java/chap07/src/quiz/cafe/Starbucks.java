package quiz.cafe;

public class Starbucks extends Cafe{
	
	Starbucks(){
		super("백자빌딩","스벅 천안역점");
		HashMap = map =new HashMap();
		
		map.put("아아",4500);
		map.put("뜨아",4000);
		setMenuMap(map);
	}
	
	
	void serve(String nick) {
		System.out.println(nick+"님");
		super.serve();
	}
	
	void make() {
		System.out.println("우리는"+this.menu+"잘만든다");
	}
	
	
	
}
