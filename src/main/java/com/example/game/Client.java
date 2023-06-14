package com.example.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context;
		//It is the IOC container that helps in maintaining the life cycle of the beans
		try(var context=new AnnotationConfigApplicationContext(GameController.class))
		{
			GameConsoleInterface game=(GameConsoleInterface)context.getBean("gameConsole");
			game.up();
			game.down();
		}
		//Configuration or dependencies
		/*
		 * Mario mario=new Mario(); Contra contra=new Contra(); //which i am trying to
		 * inject into game controller class GameController controller=new
		 * GameController(contra); controller.performActions(); GameController
		 * control=new GameController(mario); control.performActions();
		 */
		
		
	}

}
