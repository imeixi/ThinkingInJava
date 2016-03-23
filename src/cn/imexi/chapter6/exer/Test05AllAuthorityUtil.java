package cn.imexi.chapter6.exer;

import cn.imexi.chapter6.java.AllAuthorityUtil;

public class Test05AllAuthorityUtil extends AllAuthorityUtil{
	public static void main(String[] args) {
		Test05AllAuthorityUtil t = new Test05AllAuthorityUtil();
		System.out.println(t.pu);
		System.out.println(t.pro);
		System.out.println();
		t.publicPrint();
		System.out.println();
		t.protectedPrint();
	}
}
