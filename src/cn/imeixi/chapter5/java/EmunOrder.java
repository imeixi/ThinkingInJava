package cn.imeixi.chapter5.java;

public class EmunOrder {
	public static void main(String[] args) {
		for(Spiciness s:Spiciness.values()){
			System.out.println(s + ",Ordinal " + s.ordinal());
		}
		
	}
}

//Ordinal: n .序数  adj.顺序的，依次的
//Order   n 命令；顺序；规则
//		vt 命令；整理；定购
//		vi 命令；定货
//Orders  n  订单；命令；决议
	
