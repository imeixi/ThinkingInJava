package cn.imexi.chapter7.java;

public class SpaceShip extends SpaceShipControls{
	private String Name;
	public SpaceShip(String name){ this.Name = name;}
	public String toStirng(){ return Name;}
	public static void main(String[] args){
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.back(100);
	}
	
}
