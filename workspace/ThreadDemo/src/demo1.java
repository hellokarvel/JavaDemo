
public class demo1 {
	public static void main(String[] args) {
		

	Mythread th = new Mythread("���캯���е�����");
	
	
	Thread t1 = new Thread(th,"1");
	Thread t2 = new Thread(th,"2");
	
	t1.start();
	t2.start();
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	
}

}