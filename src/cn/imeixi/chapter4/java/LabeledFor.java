package cn.imeixi.chapter4.java;
import static net.mindview.util.Print.*;
//��ǩ������

public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		Outer:
		for(;;){
			Inner:
			for(;i < 10;i++){
				print("i = " + i);
				if(i == 2){
					print("continue");
					continue;
				}
				if(i == 3){
					print("break");
					i++;
					break;
				}
				if(i == 7){
					print("continue Outer");
					i++;
					continue Outer;
				}
				if(i == 8){
					print("break Outer");
					break Outer;
				}
				
				for(int k = 0;k < 5;k++){
					if(k == 3){
						print("continue inner");
						continue Inner;
					}
				}
				
				
			}
		}
	}
}
