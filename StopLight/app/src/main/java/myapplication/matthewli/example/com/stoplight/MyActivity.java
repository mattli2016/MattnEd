package myapplication.matthewli.example.com.stoplight;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MyActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        findViewById(R.id.redButton).setOnClickListener(this);
        findViewById(R.id.greenButton).setOnClickListener(this);
        findViewById(R.id.yellowButton).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        String output = "";
        TextView tv = (TextView) findViewById(R.id.displayed_text);


        switch(id) {
            case R.id.redButton:
                output = "STOP!"; tv.setBackgroundColor(Color.RED);break;
            case R.id.yellowButton:
                output = "SLOW DOWN!"; tv.setBackgroundColor(Color.YELLOW);break;
            case R.id.greenButton:
                output = "GOO!"; tv.setBackgroundColor(Color.GREEN);
        }

        tv.setText(output);


    }

}
