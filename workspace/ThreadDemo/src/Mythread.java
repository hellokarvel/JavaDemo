
public class Mythread extends Thread {
	String str = null;
	public Mythread(String str) {
		this.str = str;
	}
	public Mythread() {};
	@Override
	public void run() {
		
		System.out.println("�����߳�"+str);
		
	}
}
