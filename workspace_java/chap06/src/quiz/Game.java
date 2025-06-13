package quiz;

public class Game {

	
	
	int age;
	int old ;
	
	String a ( int age ) {
		old = (int)(Math.random()*9 )+1;
		
		if (age == old ) {
			return " 정답" ;
		} else if(age > old){
			return " up";
		} else {
			return "down";
		}
		
		
	}
	
}
