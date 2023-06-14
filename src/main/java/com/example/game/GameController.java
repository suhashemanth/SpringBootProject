package com.example.game;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameController {
	
	
	
	@Bean(name="MarioObject")
	public GameConsoleInterface game()
	{
		return new Mario();
	}
	
	@Bean(name="ContraObject")
	public GameConsoleInterface game1()
	{
		return new Contra();
	}
	
	@Bean
	public GameConsoleInterface gameConsole(GameConsoleInterface MarioObject)
	{
		return MarioObject;
	}

	public void performActions(GameConsoleInterface gameConsole)
	{
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}

}
