package com.example.delano.flashycards;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    boolean isShowingAnswers = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            }
        });


        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
            }
        });

        //Choice 1 is correct

        findViewById(R.id.answer_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.turqBlue));


            }
        });
        //Choice 2 and 3 are wrong
        findViewById(R.id.answer_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.turqBlue));
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        findViewById(R.id.answer_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.turqBlue));
                findViewById(R.id.answer_3).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });


        //Reset the choice when pressing eye
        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the questions to the answer
                ImageView imageView = (ImageView) findViewById(R.id.toggle_choices_visibility);
                //Change answers to invisible when showing is false
                if(isShowingAnswers == true) {
                    imageView.setImageResource(R.drawable.ic_visibility_off_black_24dp);
                    findViewById(R.id.answer_1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer_2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer_3).setVisibility(View.INVISIBLE);

                    isShowingAnswers = false;
                }else{
                    isShowingAnswers = true;
                    imageView.setImageResource(R.drawable.ic_visibility_black_24dp);
                    findViewById(R.id.answer_1).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_3).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.peach));
                    findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.peach));
                    findViewById(R.id.answer_3).setBackgroundColor(getResources().getColor(R.color.peach));

                }
            }
        });


    }
    //Onclick listener


}
