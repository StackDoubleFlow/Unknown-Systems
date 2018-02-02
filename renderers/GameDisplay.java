package renderers;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

public class GameDisplay {
	
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public GameDisplay() {
		try {
			ContextAttribs attribs = new ContextAttribs(3, 2).withForwardCompatible(true).withProfileCore(true);
			PixelFormat pixelFormat = new PixelFormat().withStencilBits(8).withDepthBits(24);
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.setTitle("Unknown systems");
			Display.create(pixelFormat, attribs);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		Display.update();
		Display.sync(60);
	}
	
	public void close() {
		Display.destroy();
	}
	
}
