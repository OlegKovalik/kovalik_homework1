package com.example.oleg.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout mainFrame = (FrameLayout) findViewById(R.id.mainFrame);

        int inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 5, getResources()
                        .getDisplayMetrics());


        LinearLayout lFrame = new LinearLayout(this);
        lFrame.setOrientation(LinearLayout.VERTICAL);
        lFrame.setBackgroundColor(Color.parseColor("#679a02"));
        LinearLayout.LayoutParams paramLFrame = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        paramLFrame.setMargins(inDp, inDp, inDp, inDp);
        paramLFrame.gravity = Gravity.LEFT;
        lFrame.setLayoutParams(paramLFrame);

        for (int i = 0; i < 3; i++) {
            LinearLayout frameButton = new LinearLayout(this);
            frameButton.setBackgroundColor(Color.WHITE);
            frameButton.setPadding(inDp, inDp, inDp, inDp);
            LinearLayout.LayoutParams paramFrameButton = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            paramFrameButton.setMargins(inDp, inDp, inDp, inDp);
            frameButton.setLayoutParams(paramFrameButton);

            TextView t1 = new TextView(this);
            t1.setBackgroundResource(R.mipmap.ic_launcher);
            LinearLayout.LayoutParams t1Param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            t1Param.gravity = Gravity.CENTER_VERTICAL;
            t1.setLayoutParams(t1Param);


            TextView t2 = new TextView(this);
            t2.setText("Some text");
            t2.setTextSize(18);
            t2.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
            LinearLayout.LayoutParams t2Param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            t2Param.gravity = Gravity.CENTER_VERTICAL | Gravity.RIGHT;
            t2.setLayoutParams(t2Param);

            frameButton.addView(t1);
            frameButton.addView(t2);
            lFrame.addView(frameButton);


        }


        mainFrame.addView(lFrame);


    }
}
