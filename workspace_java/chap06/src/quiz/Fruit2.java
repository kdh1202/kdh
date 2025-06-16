package quiz;

public class Fruit2 {

	String name; // 이름
	int price;  // 가격
	String worh;	//  재고

	Fruit2(String name, int price){
		this.name = name ;
		this.price = price;
		
	}
	
	
	Fruitf[] fruit = new Fruitf[4];
	
	
	void init( ) {
		fruit[0] = new Fruitf();
		fruit[0].name = "사과";
		fruit[0].price = 5000;
		fruit[0].worh = 5;
		
	}
	
	
}
