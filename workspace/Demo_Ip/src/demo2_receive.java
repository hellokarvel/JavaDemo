import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class demo2_receive {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(7878);
			
		byte[] buf = new byte[1024];
		String s1 ="这是接收";
		String s2 =" 程序";
		s2 = s2.concat(s1);
		System.out.println(s2);
		int length = buf.length;
		
		DatagramPacket dp = new DatagramPacket(buf, length);
		
		ds.receive(dp);//程序会等待
	
		System.out.println("地址是"+dp.getAddress());
		String str = new String(dp.getData());
		System.out.println("消息是"+str);
		ds.close();
	}
}
