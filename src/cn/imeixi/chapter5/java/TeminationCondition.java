package cn.imeixi.chapter5.java;

public class TeminationCondition {
	public static void main(String[] args) {
		Book b = new Book(true);
		b.checkIn();
		new Book(true);
		System.gc();
	}
	
}

class Book{
	boolean checkedOut = false;
	Book(boolean checkout){
		checkedOut = checkout;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error:checked out.");
//			try {
//				super.finalize();
//			} catch (Throwable e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
}
