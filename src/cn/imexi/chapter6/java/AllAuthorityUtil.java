package cn.imexi.chapter6.java;

public class AllAuthorityUtil {
	public String pu = "I am Public";
	private String pri = "I am Private";
	protected String pro = "I am Protected";
	
	public void publicPrint(){
		System.out.println("I'm a Public Method to Print arguments,like public \"" + pu + "\"");
		System.out.println("I'm a Public Method to Print arguments,like private \"" + pri + "\"");
		System.out.println("I'm a Public Method to Print arguments,like protected \"" + pro + "\"");
	}
	protected void protectedPrint(){
		System.out.println("I'm a protected Method to Print arguments,like public \"" + pu + "\"");
		System.out.println("I'm a protected Method to Print arguments,like private \"" + pri + "\"");
		System.out.println("I'm a protected Method to Print arguments,like protected \"" + pro + "\"");
	}
	private void privatePrint(){
		System.out.println("I'm a private Method to Print arguments,like public \"" + pu + "\"");
		System.out.println("I'm a private Method to Print arguments,like private \"" + pri + "\"");
		System.out.println("I'm a private Method to Print arguments,like protected \"" + pro + "\"");
	}
	
}
