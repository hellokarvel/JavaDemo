import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class demo2_receive {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(7878);
			
		byte[] buf = new byte[1024];
		String s1 ="���ǽ���";
		String s2 =" ����";
		s2 = s2.concat(s1);
		System.out.println(s2);
		int length = buf.length;
		
		DatagramPacket dp = new DatagramPacket(buf, length);
		
		ds.receive(dp);//�����ȴ�
	
		System.out.println("��ַ��"+dp.getAddress());
		String str = new String(dp.getData());
		System.out.println("��Ϣ��"+str);
		ds.close();
	}
}
