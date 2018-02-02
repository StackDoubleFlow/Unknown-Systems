package logic;

import org.lwjgl.opengl.Display;

import renderers.GameDisplay;
import renderers.Renderer;

public class MainGameLoop {
	
	public static void main(String[] args) {
		
		
		GameDisplay gameDisplay = new GameDisplay();
		Renderer renderer = new Renderer();
		
		while(!Display.isCloseRequested()) {

			//logic
			
			//render
			
			//update display
			gameDisplay.update();
		}
		gameDisplay.close();
		
		
	}
	
	
}
