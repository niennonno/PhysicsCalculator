package com.mapplinks.physicscalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button frBlack, srBlack, trBlack,
            frBrown, srBrown, trBrown,
            frRed, srRed, trRed,
            frOrange, srOrange, trOrange,
            frYellow, srYellow, trYellow,
            frGreen, srGreen, trGreen,
            frBlue, srBlue, trBlue,
            frViolet, srViolet, trViolet,
            frGray, srGray, trGray,
            frWhite, srWhite, trWhite,
            tolBrown, tolRed, tolGold, tolSilver, tolNone;

    TextView resValue, tolValue;
    String suffix = "";

    int btnCount = 0;
    double value, first, second, multiplier, tolerance, tolVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resValue = (TextView) findViewById(R.id.value);
        tolValue = (TextView) findViewById(R.id.tolerance);

        frBlack = (Button) findViewById(R.id.fb_black);
        frBlack.setOnClickListener(this);
        srBlack = (Button) findViewById(R.id.sb_black);
        srBlack.setOnClickListener(this);
        trBlack = (Button) findViewById(R.id.tb_black);
        trBlack.setOnClickListener(this);

        frBrown = (Button) findViewById(R.id.fb_brown);
        frBrown.setOnClickListener(this);
        srBrown = (Button) findViewById(R.id.sb_brown);
        srBrown.setOnClickListener(this);
        trBrown = (Button) findViewById(R.id.tb_brown);
        trBrown.setOnClickListener(this);

        frRed = (Button) findViewById(R.id.fb_red);
        frRed.setOnClickListener(this);
        srRed = (Button) findViewById(R.id.sb_red);
        srRed.setOnClickListener(this);
        trRed = (Button) findViewById(R.id.tb_red);
        trRed.setOnClickListener(this);

        frOrange = (Button) findViewById(R.id.fb_orange);
        frOrange.setOnClickListener(this);
        srOrange = (Button) findViewById(R.id.sb_orange);
        srOrange.setOnClickListener(this);
        trOrange = (Button) findViewById(R.id.tb_orange);
        trOrange.setOnClickListener(this);

        frYellow = (Button) findViewById(R.id.fb_yellow);
        frYellow.setOnClickListener(this);
        srYellow = (Button) findViewById(R.id.sb_yellow);
        srYellow.setOnClickListener(this);
        trYellow = (Button) findViewById(R.id.tb_yellow);
        trYellow.setOnClickListener(this);

        frGreen = (Button) findViewById(R.id.fb_green);
        frGreen.setOnClickListener(this);
        srGreen = (Button) findViewById(R.id.sb_green);
        srGreen.setOnClickListener(this);
        trGreen = (Button) findViewById(R.id.tb_green);
        trGreen.setOnClickListener(this);

        frBlue = (Button) findViewById(R.id.fb_blue);
        frBlue.setOnClickListener(this);
        srBlue = (Button) findViewById(R.id.sb_blue);
        srBlue.setOnClickListener(this);
        trBlue = (Button) findViewById(R.id.tb_blue);
        trBlue.setOnClickListener(this);

        frViolet = (Button) findViewById(R.id.fb_violet);
        frViolet.setOnClickListener(this);
        srViolet = (Button) findViewById(R.id.sb_violet);
        srViolet.setOnClickListener(this);
        trViolet = (Button) findViewById(R.id.tb_violet);
        trViolet.setOnClickListener(this);

        frGray = (Button) findViewById(R.id.fb_gray);
        frGray.setOnClickListener(this);
        srGray = (Button) findViewById(R.id.sb_gray);
        srGray.setOnClickListener(this);
        trGray = (Button) findViewById(R.id.tb_gray);
        trGray.setOnClickListener(this);

        frWhite = (Button) findViewById(R.id.fb_white);
        frWhite.setOnClickListener(this);
        srWhite = (Button) findViewById(R.id.sb_white);
        srWhite.setOnClickListener(this);
        trWhite = (Button) findViewById(R.id.tb_white);
        trWhite.setOnClickListener(this);

        tolBrown = (Button) findViewById(R.id.tol_brown);
        tolBrown.setOnClickListener(this);
        tolRed = (Button) findViewById(R.id.tol_red);
        tolRed.setOnClickListener(this);
        tolGold = (Button) findViewById(R.id.tol_gold);
        tolGold.setOnClickListener(this);
        tolSilver = (Button) findViewById(R.id.tol_silver);
        tolSilver.setOnClickListener(this);
        tolNone = (Button) findViewById(R.id.tol_none);
        tolNone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fb_black:
                ++btnCount;
                first = 0;
                calculate();
                break;
            case R.id.sb_black:
                ++btnCount;
                second = 0;
                calculate();
                break;
            case R.id.tb_black:
                ++btnCount;
                multiplier = 0;
                calculate();
                break;
            case R.id.fb_brown:
                ++btnCount;
                first = 1;
                calculate();
                break;
            case R.id.sb_brown:
                ++btnCount;
                second = 1;
                calculate();
                break;
            case R.id.tb_brown:
                ++btnCount;
                multiplier = 1;
                calculate();
                break;
            case R.id.fb_red:
                ++btnCount;
                first = 2;
                calculate();
                break;
            case R.id.sb_red:
                ++btnCount;
                second = 2;
                calculate();
                break;
            case R.id.tb_red:
                ++btnCount;
                multiplier = 2;
                calculate();
                break;
            case R.id.fb_orange:
                ++btnCount;
                first = 3;
                calculate();
                break;
            case R.id.sb_orange:
                ++btnCount;
                second = 3;
                calculate();
                break;
            case R.id.tb_orange:
                ++btnCount;
                multiplier = 3;
                calculate();
                break;
            case R.id.fb_yellow:
                ++btnCount;
                first = 4;
                calculate();
                break;
            case R.id.sb_yellow:
                ++btnCount;
                second = 4;
                calculate();
                break;
            case R.id.tb_yellow:
                ++btnCount;
                multiplier = 4  ;
                calculate();
                break;
            case R.id.fb_green:
                ++btnCount;
                first = 5;
                calculate();
                break;
            case R.id.sb_green:
                ++btnCount;
                second = 5;
                calculate();
                break;
            case R.id.tb_green:
                ++btnCount;
                multiplier = 5;
                calculate();
                break;
            case R.id.fb_blue:
                ++btnCount;
                first = 6;
                calculate();
                break;
            case R.id.sb_blue:
                ++btnCount;
                second = 6;
                calculate();
                break;
            case R.id.tb_blue:
                ++btnCount;
                multiplier = 6;
                calculate();
                break;
            case R.id.fb_violet:
                ++btnCount;
                first = 7;
                calculate();
                break;
            case R.id.sb_violet:
                ++btnCount;
                second = 7;
                calculate();
                break;
            case R.id.tb_violet:
                ++btnCount;
                multiplier = 7;
                calculate();
                break;
            case R.id.fb_gray:
                ++btnCount;
                first = 8;
                calculate();
                break;
            case R.id.sb_gray:
                ++btnCount;
                second = 8;
                calculate();
                break;
            case R.id.tb_gray:
                ++btnCount;
                multiplier = 8;
                calculate();
                break;
            case R.id.fb_white:
                ++btnCount;
                first = 9;
                calculate();
                break;
            case R.id.sb_white:
                ++btnCount;
                second = 9;
                calculate();
                break;
            case R.id.tb_white:
                ++btnCount;
                multiplier = 9;
                calculate();
                break;
            case R.id.tol_brown:
                ++btnCount;
                tolerance = 0.01;
                calculate();
                break;
            case R.id.tol_red:
                ++btnCount;
                tolerance = 0.02;
                calculate();
                break;
            case R.id.tol_gold:
                ++btnCount;
                tolerance = 0.05;
                calculate();
                break;

            case R.id.tol_silver:
                ++btnCount;
                tolerance = 0.1;
                calculate();
                break;
            case R.id.tol_none:
                ++btnCount;
                tolerance = 0.2;
                calculate();
                break;
            default:
                break;
        }
    }

    void calculate() {
        if (btnCount >= 3) {
            if(multiplier>3 && multiplier<6){
                suffix="K";
                multiplier-=3;
            }else if (multiplier>5){
                suffix ="M";
                multiplier-=6;
            }else if (multiplier<3){
                suffix="";
            }
            value = (first * 10) + second;
            value *= Math.pow(10, multiplier);
            resValue.setText("R = " + value + " " + suffix + "Ω");
            tolVal = value * tolerance;
            tolValue.setText("±" + tolVal + " " + suffix + "Ω");

        }
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
}
