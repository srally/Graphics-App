package app.graph;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class AppGraph extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Texture img3;
	float x, y;
	float dx, dy;
	float w, h;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("soccer.jpg");
		img2 = new Texture("up.png");
		img3 = new Texture("down.png");
		x = 5;
		y = 5;
		dx = 12;
		dy = 15;
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 1, 0, 1);
		x+=dx;
		y+=dy;
		if(x>w||x<0){
			dx = -dx;
		}
		if(y>h||y<0){
			dy = -dy;
		}
		batch.begin();
		batch.draw(img, x, y);
		batch.draw(img2, 1400, 250);
		batch.draw(img3, 50, 250);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public void resize(int width, int height){
		w = width;
		h = height;
	}
}
