package com.animalvoices.babyzoo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	MediaPlayer snakeSound;
	MediaPlayer cowSound;
	MediaPlayer catSound;
	MediaPlayer pigSound;
	MediaPlayer goatSound;
	MediaPlayer sheepSound;
	MediaPlayer chickenSound;
	MediaPlayer duckSound;
	MediaPlayer frogSound;
	MediaPlayer donkeySound;
	MediaPlayer dogSound;
	MediaPlayer birdSound;
	Button mButton;

	// String for LogCat documentation
	private final static String TAG = "Baby Zoo";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG, "Entered the onCreate() method");
		
		//Button handler
	    mButton = (Button) findViewById(R.id.button1);
	    mButton.setOnClickListener(mButtonHandler);
	};

	View.OnClickListener mButtonHandler = new View.OnClickListener() {
	    public void onClick(View v) {
	        Intent i = new Intent(MainActivity.this,ZooInfo.class);
	        startActivity(i);
	        
	    }
	};

	//Media Players for sound when an animal icon is clicked
	public void Snake(View v) {
		Log.i(TAG, "Snake");
		snakeSound = MediaPlayer.create(MainActivity.this, R.raw.snake);
		snakeSound.start();
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Snake, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Cow(View v) {
		Log.i(TAG, "Cow");
		cowSound = MediaPlayer.create(MainActivity.this, R.raw.cow);
		cowSound.start();
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Cow, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Cat(View v) {
		Log.i(TAG, "Cat");
		catSound = MediaPlayer.create(MainActivity.this, R.raw.cat);
		catSound.start();
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Cat, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Dog(View v) {
		Log.i(TAG, "Dog");
		dogSound = MediaPlayer.create(MainActivity.this, R.raw.dog);
		dogSound.start();
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Dog, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Sheep(View v) {
		Log.i(TAG, "Sheep");
		sheepSound = MediaPlayer.create(MainActivity.this, R.raw.sheep);
		sheepSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Sheep, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Chicken(View v) {
		Log.i(TAG, "Chicken");
		chickenSound = MediaPlayer.create(MainActivity.this, R.raw.chicken);
		chickenSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Chicken, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Frog(View v) {
		Log.i(TAG, "Frog");
		frogSound = MediaPlayer.create(MainActivity.this, R.raw.frog);
		frogSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Frog, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Donkey(View v) {
		Log.i(TAG, "Donkey");
		donkeySound = MediaPlayer.create(MainActivity.this, R.raw.donkey);
		donkeySound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Donkey, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Duck(View v) {
		Log.i(TAG, "Duck");
		duckSound = MediaPlayer.create(MainActivity.this, R.raw.duck);
		duckSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Duck, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Bird(View v) {
		Log.i(TAG, "Bird");
		birdSound = MediaPlayer.create(MainActivity.this, R.raw.bird);
		birdSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Bird, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Goat(View v) {
		Log.i(TAG, "Goat");
		goatSound = MediaPlayer.create(MainActivity.this, R.raw.goat);
		goatSound.start();
		
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Goat, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}
	
	public void Pig(View v) {
		Log.i(TAG, "Pig");
		pigSound = MediaPlayer.create(MainActivity.this, R.raw.pig);
		pigSound.start();
		
		//A toast message for the respective animal
		Toast.makeText(getApplicationContext(), R.string.Pig, Toast.LENGTH_LONG).show();
		
		super.onResume();
	}

}
