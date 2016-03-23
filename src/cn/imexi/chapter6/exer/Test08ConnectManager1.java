package cn.imexi.chapter6.exer;

public class Test08ConnectManager1 {
	public static void main(String[] args) {
		Connection c = ConnectionManager.getConnection();
		while(c != null){
			System.out.println(c);	
			c.doSomething();
			c = ConnectionManager.getConnection();
		}
	}
}

class Connection{
	private static int counter = 0;                                    //����Ϊstatic������Ϊ�ˣ������������ʱ���޸�ͬһ��static������ֵ
	private int id = counter++;
	Connection(){}
	public String toString(){
		return "Connection " + id;
	}
	public void doSomething(){}
}

class ConnectionManager{
	private static Connection[] pool = new Connection[10];              //�����෽��ʱ�����Ȼ��ʼ����ı�����static�������ȱ���ʼ����
	private static int counter = 0;                                     //
	static{                                                             //
		for(int i = 0;i < pool.length;i++)
			pool[i] = new Connection();
	}
	
	public static Connection getConnection(){                           //��static��main������ֱ�ӵ��ã��ʷ�������Ϊstatic
		if(counter < pool.length){
			return pool[counter++];
		}else
			return null;
	}
}