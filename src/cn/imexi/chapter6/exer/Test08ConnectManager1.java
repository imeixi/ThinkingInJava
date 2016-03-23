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
	private static int counter = 0;                                    //声明为static变量是为了，创建多个对象时，修改同一个static变量的值
	private int id = counter++;
	Connection(){}
	public String toString(){
		return "Connection " + id;
	}
	public void doSomething(){}
}

class ConnectionManager{
	private static Connection[] pool = new Connection[10];              //调用类方法时，首先会初始化类的变量，static变量最先被初始化。
	private static int counter = 0;                                     //
	static{                                                             //
		for(int i = 0;i < pool.length;i++)
			pool[i] = new Connection();
	}
	
	public static Connection getConnection(){                           //在static的main方法中直接调用，故方法声明为static
		if(counter < pool.length){
			return pool[counter++];
		}else
			return null;
	}
}