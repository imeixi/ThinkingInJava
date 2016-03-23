package cn.imeixi.chapter4.exer;
import static net.mindview.util.Print.*;
import java.util.*;
public class Test08Switch {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for(int i = 0;i < 100;i++){
			int x = rand.nextInt(100);
			switch(x % 6){
			case 0: print(x + " % 6 余数为 0"); //break;
			case 1: print(x + " % 6 余数为 1"); //break;
			case 2: print(x + " % 6 余数为 2"); //break;
			case 3: print(x + " % 6 余数为 3"); //break;
			case 4: print(x + " % 6 余数为 4"); //break;
			case 5: print(x + " % 6 余数为 5"); //break;
			default:
			}
		}
	}
}
