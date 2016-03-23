package cn.imexi.chapter7.exer;

public class Test06Chess {
	public static void main(String[] args) {
		Chess c = new Chess();
	}
}

class Game{
	public Game(int i){
		System.out.println("Game constructor.");
	}
}

class BoardGame extends Game{
	public BoardGame(int i){
		super(i);
		System.out.println("BoardGame constructor.");
	}
}

class Chess extends BoardGame{
	public Chess(){
		super(11);
		System.out.println("Chess constructor.");
	}
}


/*
 * 
chess   
 英 [tʃes]   美 [tʃɛs]  跟读 口语练习
n. 国际象棋，西洋棋
n. (Chess)人名；(英)切斯
 * 
 */