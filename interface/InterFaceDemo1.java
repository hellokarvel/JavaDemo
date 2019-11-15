//接口之间互相继承
//类只能单继承，接口支持多实现
//接口多实现，接口可以把很多不相关的内容进行整合
// 接口所有的方法都是 抽象 公开的
// 接口所有的 变量都是静态的内存中只有一份
public class InterFaceDemo1{
	public static void main(String[] args){
			
	new Gold().getMoney();
			
	Valuable g1 = new Gold();
	
	g1.getMoney();		
			
	System.out.println(g1.moneny);
				
	}
}
interface Valuable{
	
	 int moneny =  100;//接口变量隐藏
	 void getMoney();
	
}
interface Valuable2{
	

	 void getMoney2();
	
}

class Gold implements Valuable{
	
	
	public void getMoney(){
		
		System.out.println("1");
		
	}
	
}