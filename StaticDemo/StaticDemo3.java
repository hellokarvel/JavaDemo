//静态代码块，做初始化
public class StaticDemo3{
	public static void main(String[] args){
			
		
		Circle c1 = new Circle();
			
			
			
			
			
	}
}

class Circle{
	static{
			System.out.println("静态代码块，只会执行一次");
		
	}
	
	public Circle(){};
	
	
}