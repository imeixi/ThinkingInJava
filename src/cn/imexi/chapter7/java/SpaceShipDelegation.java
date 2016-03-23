package cn.imexi.chapter7.java;

public class SpaceShipDelegation {
	private String Name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name){
		this.Name = name;
	}
	
	public void up(int velocity){
		controls.up(velocity);
	}
	public void down(int velocity){
		controls.down(velocity);
	}
	public void left(int velocity){
		controls.left(velocity);
	}
	public void right(int velocity){
		controls.right(velocity);
	}
	public void forward(int velocity){
		controls.forward(velocity);
	}
	public void back(int velocity){
		controls.back(velocity);
	}
	public void turboBoost(int velocity){
		controls.turboBoost(velocity);
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation ss = new SpaceShipDelegation("TRALVAL");
		ss.forward(100);
	}
}


//delegation   
//英 [delɪ'geɪʃ(ə)n]   美 [,dɛlɪ'ɡeʃən] 
//n. 代表团；授权；委托

//velocity
//英 [vəˈlɒsəti]   美 [və'lɑsəti]
//n. 【物】速度

//boost   
//英 [buːst]   美 [bʊst]  
//vt. 促进；增加；支援
//vi. 宣扬；偷窃
//n. 推动；帮助；宣扬
//n. (Boost)人名；(英)布斯特；(德)博斯特
//
//turbo boost 涡轮增压
