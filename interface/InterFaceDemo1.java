//�ӿ�֮�以��̳�
//��ֻ�ܵ��̳У��ӿ�֧�ֶ�ʵ��
//�ӿڶ�ʵ�֣��ӿڿ��԰Ѻܶ಻��ص����ݽ�������
// �ӿ����еķ������� ���� ������
// �ӿ����е� �������Ǿ�̬���ڴ���ֻ��һ��
public class InterFaceDemo1{
	public static void main(String[] args){
			
	new Gold().getMoney();
			
	Valuable g1 = new Gold();
	
	g1.getMoney();		
			
	System.out.println(g1.moneny);
				
	}
}
interface Valuable{
	
	 int moneny =  100;//�ӿڱ�������
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