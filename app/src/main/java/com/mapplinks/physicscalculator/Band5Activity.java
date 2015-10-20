package com.mapplinks.physicscalculator;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

import java.text.DecimalFormat;

public class Band5Activity extends AppCompatActivity implements View.OnClickListener {

    Button frBlack, srBlack, mulBlack,
            frBrown, srBrown, mulBrown,
            frRed, srRed, mulRed,
            frOrange, srOrange, mulOrange,
            frYellow, srYellow, mulYellow,
            frGreen, srGreen, mulGreen,
            frBlue, srBlue, mulBlue,
            frViolet, srViolet, mulViolet,
            frGray, srGray, mulGray,
            frWhite, srWhite, mulWhite,
            trBlack, trBrown, trRed, trOrange, trYellow, trGreen, trBlue, trViolet, trGray, trWhite,
            tolBrown, tolRed, tolGold, tolSilver, tolNone;

    TextView resValue, tolValue;
    String suffix = "";

    int btnCount = 0;
    double value, first, second, third, multiplier, tolerance, tolVal;

    TextView firstBand, secondBand, thirdBand, fourthBand, fifthBand,
            firstBandValue, secondBandValue, thirdBandValue, fourthBandValue, fifthBandValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band5);

        String projectToken = "0009db2010b6dc8e95ab2649e124fee1"; // e.g.: "1ef7e30d2a58d27f4b90c42e31d6d7ad"
        MixpanelAPI mixpanel = MixpanelAPI.getInstance(this, projectToken);

        FontChangeCrawler fontChanger = new FontChangeCrawler(getAssets(), "gotham_light.otf");
        fontChanger.replaceFonts((ViewGroup) this.findViewById(android.R.id.content));

        SpannableString s = new SpannableString("Resistance Calculator");
        s.setSpan(new TypefaceSpan("gotham_bold.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);

        mixpanel.track("5 Band Opened");

        resValue = (TextView) findViewById(R.id.value);
        tolValue = (TextView) findViewById(R.id.tolerance);

        frBlack = (Button) findViewById(R.id.fb_black);
        frBlack.setOnClickListener(this);
        srBlack = (Button) findViewById(R.id.sb_black);
        srBlack.setOnClickListener(this);
        mulBlack = (Button) findViewById(R.id.mul_black);
        mulBlack.setOnClickListener(this);

        frBrown = (Button) findViewById(R.id.fb_brown);
        frBrown.setOnClickListener(this);
        srBrown = (Button) findViewById(R.id.sb_brown);
        srBrown.setOnClickListener(this);
        mulBrown = (Button) findViewById(R.id.mul_brown);
        mulBrown.setOnClickListener(this);

        frRed = (Button) findViewById(R.id.fb_red);
        frRed.setOnClickListener(this);
        srRed = (Button) findViewById(R.id.sb_red);
        srRed.setOnClickListener(this);
        mulRed = (Button) findViewById(R.id.mul_red);
        mulRed.setOnClickListener(this);

        frOrange = (Button) findViewById(R.id.fb_orange);
        frOrange.setOnClickListener(this);
        srOrange = (Button) findViewById(R.id.sb_orange);
        srOrange.setOnClickListener(this);
        mulOrange = (Button) findViewById(R.id.mul_orange);
        mulOrange.setOnClickListener(this);

        frYellow = (Button) findViewById(R.id.fb_yellow);
        frYellow.setOnClickListener(this);
        srYellow = (Button) findViewById(R.id.sb_yellow);
        srYellow.setOnClickListener(this);
        mulYellow = (Button) findViewById(R.id.mul_yellow);
        mulYellow.setOnClickListener(this);

        frGreen = (Button) findViewById(R.id.fb_green);
        frGreen.setOnClickListener(this);
        srGreen = (Button) findViewById(R.id.sb_green);
        srGreen.setOnClickListener(this);
        mulGreen = (Button) findViewById(R.id.mul_green);
        mulGreen.setOnClickListener(this);

        frBlue = (Button) findViewById(R.id.fb_blue);
        frBlue.setOnClickListener(this);
        srBlue = (Button) findViewById(R.id.sb_blue);
        srBlue.setOnClickListener(this);
        mulBlue = (Button) findViewById(R.id.mul_blue);
        mulBlue.setOnClickListener(this);

        frViolet = (Button) findViewById(R.id.fb_violet);
        frViolet.setOnClickListener(this);
        srViolet = (Button) findViewById(R.id.sb_violet);
        srViolet.setOnClickListener(this);
        mulViolet = (Button) findViewById(R.id.mul_violet);
        mulViolet.setOnClickListener(this);

        frGray = (Button) findViewById(R.id.fb_gray);
        frGray.setOnClickListener(this);
        srGray = (Button) findViewById(R.id.sb_gray);
        srGray.setOnClickListener(this);
        mulGray = (Button) findViewById(R.id.mul_gray);
        mulGray.setOnClickListener(this);

        frWhite = (Button) findViewById(R.id.fb_white);
        frWhite.setOnClickListener(this);
        srWhite = (Button) findViewById(R.id.sb_white);
        srWhite.setOnClickListener(this);
        mulWhite = (Button) findViewById(R.id.mul_white);
        mulWhite.setOnClickListener(this);

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

        trBlack = (Button) findViewById(R.id.tb_black);
        trBlack.setOnClickListener(this);
        trBrown = (Button) findViewById(R.id.tb_brown);
        trBrown.setOnClickListener(this);
        trRed = (Button) findViewById(R.id.tb_red);
        trRed.setOnClickListener(this);
        trOrange = (Button) findViewById(R.id.tb_orange);
        trOrange.setOnClickListener(this);
        trYellow = (Button) findViewById(R.id.tb_yellow);
        trYellow.setOnClickListener(this);
        trGreen = (Button) findViewById(R.id.tb_green);
        trGreen.setOnClickListener(this);
        trBlue = (Button) findViewById(R.id.tb_blue);
        trBlue.setOnClickListener(this);
        trViolet = (Button) findViewById(R.id.tb_violet);
        trViolet.setOnClickListener(this);
        trGray = (Button) findViewById(R.id.tb_gray);
        trGray.setOnClickListener(this);
        trWhite = (Button) findViewById(R.id.tb_white);
        trWhite.setOnClickListener(this);

        firstBand = (TextView) findViewById(R.id.firstBand);
        secondBand = (TextView) findViewById(R.id.secondBand);
        thirdBand = (TextView) findViewById(R.id.thirdBand);
        fourthBand = (TextView) findViewById(R.id.fourthBand);
        fifthBand = (TextView) findViewById(R.id.fifthBand);

        firstBandValue = (TextView) findViewById(R.id.first_band_value);
        secondBandValue = (TextView) findViewById(R.id.second_band_value);
        thirdBandValue = (TextView) findViewById(R.id.third_band_value);
        fourthBandValue = (TextView) findViewById(R.id.fourth_band_value);
        fifthBandValue = (TextView) findViewById(R.id.fifth_band_value);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fb_black:
                ++btnCount;
                first = 0;
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                calculate();
                break;
            case R.id.sb_black:
                ++btnCount;
                second = 0;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.mul_black:
                ++btnCount;
                multiplier = 0;
                suffix = "";
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                break;

            case R.id.fb_brown:
                ++btnCount;
                first = 1;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                break;
            case R.id.sb_brown:
                ++btnCount;
                second = 1;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                break;
            case R.id.mul_brown:
                ++btnCount;
                multiplier = 1;
                suffix = "";
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                break;

            case R.id.fb_red:
                ++btnCount;
                first = 2;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.sb_red:
                ++btnCount;
                second = 2;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.mul_red:
                ++btnCount;
                multiplier = 2;
                suffix = "K";
                multiplier-=3;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;

            case R.id.fb_orange:
                ++btnCount;
                first = 3;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                break;
            case R.id.sb_orange:
                ++btnCount;
                second = 3;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                break;
            case R.id.mul_orange:
                ++btnCount;
                suffix = "K";
                multiplier = 3;
                multiplier -= 3;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                break;

            case R.id.fb_yellow:
                ++btnCount;
                first = 4;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case R.id.sb_yellow:
                ++btnCount;
                second = 4;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case R.id.mul_yellow:
                ++btnCount;
                suffix = "K";
                multiplier = 4;
                multiplier -= 3;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;

            case R.id.fb_green:
                ++btnCount;
                first = 5;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.sb_green:
                ++btnCount;
                second = 5;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.mul_green:
                ++btnCount;
                multiplier = 5;
                suffix = "M";
                multiplier -= 6;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;

            case R.id.fb_blue:
                ++btnCount;
                first = 6;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                break;
            case R.id.sb_blue:
                ++btnCount;
                second = 6;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                break;
            case R.id.mul_blue:
                ++btnCount;
                multiplier = 6;
                suffix = "M";
                multiplier -= 6;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                break;

            case R.id.fb_violet:
                ++btnCount;
                first = 7;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorViolet));
                break;
            case R.id.sb_violet:
                ++btnCount;
                second = 7;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorViolet));
                break;
            case R.id.mul_violet:
                ++btnCount;
                multiplier = 7;
                suffix = "G";
                multiplier -= 9;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorViolet));
                break;

            case R.id.fb_gray:
                ++btnCount;
                first = 8;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorGrey));
                break;
            case R.id.sb_gray:
                ++btnCount;
                second = 8;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorGrey));
                break;
            case R.id.mul_gray:
                ++btnCount;
                multiplier = 8;
                suffix = "G";
                multiplier -= 9;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorGrey));
                break;

            case R.id.fb_white:
                ++btnCount;
                first = 9;
                calculate();
                firstBand.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;
            case R.id.sb_white:
                ++btnCount;
                second = 9;
                calculate();
                secondBand.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;
            case R.id.mul_white:
                ++btnCount;
                multiplier = 9;
                suffix = "G";
                multiplier -= 9;
                calculate();
                fourthBand.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;

            case R.id.tol_brown:
                tolerance = 1;
                calculateTolerance();
                fifthBand.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                break;
            case R.id.tol_red:
                tolerance = 2;
                calculateTolerance();
                fifthBand.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.tol_gold:
                tolerance = 5;
                calculateTolerance();
                fifthBand.setBackgroundColor(getResources().getColor(R.color.colorGold));
                break;
            case R.id.tol_silver:
                tolerance = 10;
                calculateTolerance();
                fifthBand.setBackgroundColor(getResources().getColor(R.color.colorSilver));
                break;
            case R.id.tol_none:
                tolerance = 20;
                calculateTolerance();
                fifthBand.setBackgroundColor(getResources().getColor(R.color.colorNone));
                break;

            case R.id.tb_black:
                ++btnCount;
                third = 0;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.tb_brown:
                ++btnCount;
                third = 1;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorBrown));
                break;
            case R.id.tb_red:
                ++btnCount;
                third = 2;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.tb_orange:
                ++btnCount;
                third = 3;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                break;
            case R.id.tb_yellow:
                ++btnCount;
                third = 4;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case R.id.tb_green:
                ++btnCount;
                third = 5;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.tb_blue:
                ++btnCount;
                third = 6;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                break;
            case R.id.tb_violet:
                ++btnCount;
                third = 7;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorViolet));
                break;
            case R.id.tb_gray:
                ++btnCount;
                third = 8;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorGrey));
                break;
            case R.id.tb_white:
                ++btnCount;
                third = 9;
                calculate();
                thirdBand.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;

            default:
                break;
        }
    }

    void calculate() {
        DecimalFormat precision = new DecimalFormat("0");
        firstBandValue.setText(precision.format(first));
        secondBandValue.setText(precision.format(second));
        thirdBandValue.setText(precision.format(third));
        if (suffix == "") {
            fourthBandValue.setText("10^" + precision.format(multiplier));
        } else if (suffix == "K") {
            fourthBandValue.setText("10^" + precision.format(multiplier + 3));
        } else if (suffix == "M") {
            fourthBandValue.setText("10^" + precision.format(multiplier + 6));
        } else if (suffix == "G") {
            fourthBandValue.setText("10^" + precision.format(multiplier + 9));
        }

        if (btnCount >= 4) {
            value = (first * 100) + (second * 10) + third;
            value *= Math.pow(10, multiplier);
            double formattedNumber = Double.parseDouble(new DecimalFormat("#.##").format(value));
            resValue.setText(formattedNumber + " " + suffix + "Ω");
            calculateTolerance();
        }
    }

    void calculateTolerance() {
        fifthBandValue.setText(tolerance + "%");
        if (btnCount >= 4) {
            tolVal = value * tolerance / 100;
            double formattedNumber = Double.parseDouble(new DecimalFormat("#.##").format(tolVal));
            tolValue.setText("±" + formattedNumber + " " + suffix + "Ω");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_band5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {
            shareTextUrl();
        } else if (id == R.id.rate) {
            rateApp();
        }else if(id==R.id.four_band){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void shareTextUrl() {
        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_SUBJECT, "Resistance Calculator");
        share.putExtra(Intent.EXTRA_TEXT, "I am using Resistance Calculator via @Mapplinks. Find it here: http://mpp.link/133v");

        startActivity(Intent.createChooser(share, "Spread the Word!"));
    }

    void rateApp() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.mapplinks.physicscalculator"));
        if (!MyStartActivity(intent)) {
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?[Id]"));
            if (!MyStartActivity(intent)) {
                Toast.makeText(this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean MyStartActivity(Intent aIntent) {
        try {
            startActivity(aIntent);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }
}
