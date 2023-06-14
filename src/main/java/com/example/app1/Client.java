package com.example.app1;

public class Client {
	
	public static void main(String[] args) {
		//Configuration or dependencies
		Mario mario=new Mario();
		Contra contra=new Contra();
		//which i am trying to inject into game controller class
		GameController controller=new GameController(contra);
		controller.performActions();
		GameController control=new GameController(mario);
		control.performActions();
	}

}
