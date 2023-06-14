package com.example.app1;

public class GameController {
	GameConsoleInterface mario;
	public GameController(GameConsoleInterface mario)
	{
		this.mario=mario;
	}
	
	public void performActions()
	{
		mario.up();
		mario.down();
		mario.left();
		mario.right();
	}

}
