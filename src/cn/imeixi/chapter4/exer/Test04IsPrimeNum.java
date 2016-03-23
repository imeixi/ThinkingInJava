package cn.imeixi.chapter4.exer;
//�Ƿ�������
public class Test04IsPrimeNum {
	static boolean isPrimeNum(int num){
		boolean result = true;
		for(int i = 2;i <= Math.sqrt(num);i++){
			if(num % i == 0){
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int Max = 100;
		if(args.length != 0){
			Max = Integer.valueOf(args[0]);
		}
		
		System.out.println(Max + "���ڵ����������У�");
		for(int i = 0;i < Max;i++){
			if(i > 1){
				if(isPrimeNum(i)){
					System.out.print(" " + i);
				}				
			}
		}
	}
}
	
