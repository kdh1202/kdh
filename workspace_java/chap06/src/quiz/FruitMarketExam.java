package quiz;

public class FruitMarketExam {

	public static void main(String[] args) {

		FruitMarket market= new FruitMarket("과일세상","평택");
			
		int price = market.ask("토마토");
		System.out.println("토마토가격은? "+price);
		
		Fruit fruit = new Fruit();
		market.addFruit(null);
		
		
	}

}
