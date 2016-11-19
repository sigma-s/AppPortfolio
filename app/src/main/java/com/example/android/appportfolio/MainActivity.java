package com.example.android.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Some tag","Some log");
        Log.d("tag","new feature");
        Log.d("thing","thing");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*Called when the user touches button media_streamer*/
    public void media_streamer(View view){
        //Do something in response to button click
        setToast("This button will launch Spotify Streamer app!");
    }

    /*Called when the user touches button super_duo1*/
    public void super_duo1(View view){
        //Do something in response to button click
        setToast("This button will launch Scores app!");
    }
    /*Called when the user touches button super_duo2*/
    public void super_duo2(View view){
        //Do something in response to button click
        setToast("This button will launch Library app!");
    }
    /*Called when the user touches button ant_terminator*/
    public void ant_terminator(View view){
        //Do something in response to button click
        setToast("This button will launch Build It Bigger app!");
    }
    /*Called when the user touches button materialize*/
    public void materialize(View view){
        //Do something in response to button click
        setToast("This button will launch Bacon Reader app!");
    }
    /*Called when the user touches button capstone*/
    public void capstone(View view){
        //Do something in response to button click
        setToast("This button will launch my Capstone app!");
    }

    public void setToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence myText = text;
        Toast toast = Toast.makeText(context,myText,duration);
        toast.show();
    }
}
