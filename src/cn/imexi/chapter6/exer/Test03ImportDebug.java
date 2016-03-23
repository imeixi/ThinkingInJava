package cn.imexi.chapter6.exer;

//import cn.imeixi.debug.PrintArgs;      // [1]
//import cn.imeixi.debugoff.PrintArgs;   // [1]
//import cn.imeixi.debug.*;      // [1]
import cn.imeixi.debugoff.*;   // [1]
 
//import static cn.imeixi.debug.PrintArgs.*;  // [2]
import static cn.imeixi.debugoff.PrintArgs.*; // [2]

public class Test03ImportDebug {
	public static void main(String[] args) {
		PrintArgs.printArgs(args); //import[1 ]
//		printArgs(args);           //import[2]
	}
}
