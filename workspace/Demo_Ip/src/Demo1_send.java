import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1_send {
	public static void main(String[] args)throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		byte[] buf = "hellokarve".getBytes();
		
		int length =buf.length;
		
		InetAddress address = InetAddress.getLocalHost();
		
		int port = 7878;
		
		DatagramPacket dp = new DatagramPacket(buf , length, address , port);
	
		ds.send(dp);
		
		ds.close();
	}
}
