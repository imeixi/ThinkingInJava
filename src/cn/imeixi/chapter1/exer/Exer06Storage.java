package cn.imeixi.chapter1.exer;
/*方式一
public class Exer06Storage{
	public static void main(String[] args) {
		System.out.println(storage("Hello my world!"));
	}
	
	public static int storage(String s){
		return s.length() * 2;
	}
}
*/

//方法二
public class Exer06Storage{
	public static void main(String[] args) {
		GetStorageValue gsv = new GetStorageValue();
		System.out.println(gsv.storage("Hello my world!"));
	}
}

class GetStorageValue{
	int storage(String s){
		return s.length() * 2;
	}
}