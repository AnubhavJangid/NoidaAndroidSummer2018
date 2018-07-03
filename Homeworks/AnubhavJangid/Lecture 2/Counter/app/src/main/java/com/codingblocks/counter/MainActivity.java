
package com.codingblocks.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main Activity";

    int count = 0;
    TextView counterText;
    Button b1, b2, b3;
    String s;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "OnCreate was called");
        counterText = (TextView) findViewById(R.id.countTv);
        b1 = (Button) findViewById(R.id.btnPlus);
        b2 = (Button) findViewById(R.id.btnMinus);
        b3 = (Button) findViewById(R.id.btnReset);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "OnStart was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "OnResume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,  "OnPause was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,  "OnRestart was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "OnDestroy was called");
    }

    public void decrement(View view) {
        if (count >0){
            count--;
        }
        counterText.setText(String.valueOf(count));
        Log.e(TAG, "decrement: " +count);
    }

    public void increment(View view) {

            count++;
        counterText.setText(String.valueOf(count));
        Log.e(TAG, "increment: " +count);

    }

    public void Reset(View view) {
        count = 0;
        Log.e(TAG, "Reset"+ count);
        counterText.setText(String.valueOf(count));
    }

    public void compute(View view) {
        switch (view.getId()){
            case  R.id.btnPlus :
                //Do something
                break;
            case R.id.btnMinus :
                //Do something
                break;
            case R.id.btnReset :
                //Do something
                break;
        }
    }
}
