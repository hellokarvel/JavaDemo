//继承类,子类比父类更强大
//只有单继承，子类不能访问父类私有
public class StaticDemo4{
	public static void main(String[] args){
			
		Son s1 = new Son(5);
		
	
		s1.q1();
		
			
	}
}
class Father{
	int number1  = 0;
	public Father(int number1){
		
		int num1  = number1+1;
		System.out.println(num1+"父类构造方法");
	}
	
	private void q1(int number1){
		
		
		System.out.println(number1+"这是父类");
	}
	
	
	
}
class Son extends Father{

	public Son(int num){
		super(num);//必须运用super 对父类先进行构造，super 和 this 对于父类与当前类
		//q1(num);
		System.out.println(num+"子类构造方法");
		
		
	}
	public void q1(){
		System.out.println("这是子类");
	}
	
}
