package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter
{

	SpriteBatch batch;
	Ball ball;
	
	@Override
	public void create ()
	{
		batch = new SpriteBatch();
		ball = new Ball();
	}

	@Override
	public void render ()
	{
		update();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		ball.render(batch);
		batch.end();
	}

	public void update()
	{
		ball.update();
	}

	@Override
	public void dispose ()
	{

		batch.dispose();
	}
}
