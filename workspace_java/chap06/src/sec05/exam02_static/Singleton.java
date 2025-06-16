package sec05.exam02_static;

public class Singleton {
	
//	Singleton singleton =null;
//	
//	private static Singleton singleton = null;
//	
//	
//	private Singleton(){
//		
//	}
//	
//	static Singleton getInstance() {
//		if(singleton == null){
//			singleton = new Singleton();
//			
//			}
//			return singleton;
//		}
	private static Singleton singleton = new Singleton();
	private Singleton(){}
	static Singleton getInstance() {
		return singleton;
	}
	
	
	
}
