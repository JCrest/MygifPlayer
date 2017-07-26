package com.example.mygifplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		InputStream is = null;
		try {
			is = getAssets().open("feature3.gif");
		} catch (IOException e) {
			e.printStackTrace();
		}
		GifDecoderView view = new GifDecoderView(this, is);
		setContentView(view);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
