package net.wte.aschmidt.lotterytickets;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private TextView luckyNumbers;
    private Random rand = new Random();
    private String lotteryticket="";
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luckyNumbers=(TextView)findViewById(R.id.showLuckyNumbers);
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
    /**
     * generateTicket Called when button is clicked
     * generates 6 random numbers and put them into a string
     */
    public void generateTicket(View view)
    {
        //reset to blank first
        lotteryticket="";
        luckyNumbers.setText(lotteryticket);
        for(int i=0; i<6; i++)
        {
            number=rand.nextInt(49)+1;
            lotteryticket+=(String.valueOf(number)+ " ");
        }
        //test if this works
        System.out.println(lotteryticket);
        luckyNumbers.setText(lotteryticket);

    }

}
