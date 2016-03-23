package cn.imexi.chapter6.exer;

public class Test08ConnectManager {
	public static void main(String[] args) {
		Connection1[] con = new Connection1[12];
		for(int i = 0;i < con.length;i++){
			con[i] = Test08ConnectManager.makeConnection1();
		}
	}
	
	static Connection1 makeConnection1(){
		return Connection1.getNewObject();
	}
}

class Connection1{
	static int counter = 0;
	private Connection1(){
		System.out.println("Connecter " + counter );
		counter++;
	}
	
	public static Connection1 getNewObject(){
		return new Connection1();
	}
}
