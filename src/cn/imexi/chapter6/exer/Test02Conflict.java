package cn.imexi.chapter6.exer;

import java.util.*;
import cn.imexi.chapter6.java.*;

public class Test02Conflict {
	public static void main(String[] args) {
//		Vector v = new Vector();  //ambiguous
		java.util.Vector v = new java.util.Vector();
	}
}


//ambiguous  [æm'bɪgjʊəs]  adj. 模糊不清的；引起歧义的