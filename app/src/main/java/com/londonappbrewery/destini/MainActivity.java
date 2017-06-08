package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final Button mButtonTop = (Button) findViewById(R.id.buttonTop);
        final Button mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        final TextView mStoryTv = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Top Button Pressed!!!", Toast.LENGTH_SHORT).show();
                if (mStoryIndex == 1) {
                    mStoryTv.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2) {
                    mStoryTv.setText(R.string.T3_Story);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mButtonBottom.setText(R.string.T3_Ans1);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mStoryTv.setText(R.string.T6_End);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mStoryIndex = 5;
                }
            }

        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bottom Button Pressed!!!", Toast.LENGTH_SHORT).show();
                if (mStoryIndex == 1) {
                    mStoryTv.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryTv.setText(R.string.T4_End);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mStoryIndex = 5;
                } else if (mStoryIndex == 3) {
                    mStoryTv.setText(R.string.T5_End);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mStoryIndex = 5;
                }
            }
        });
    }

            public void displayEnd()
            {
                AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
                alert.setCancelable(false);
                alert.setTitle("Destini Ends!!!");
                alert.setPositiveButton("Close the App", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    }
                });
            }
}

