package com.a202sgi.android.gtkpenang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Question_Library mQuestionLibrary = new Question_Library();

    private TextView mScoreView;
    private ImageView mQuestionView;
    private Button mButtonChoiceA;
    private Button mButtonChoiceB;
    private Button mButtonChoiceC;
    private Button mButtonChoiceD;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (ImageView)findViewById(R.id.image);
        mButtonChoiceA = (Button)findViewById(R.id.A);
        mButtonChoiceB = (Button)findViewById(R.id.B);
        mButtonChoiceC = (Button)findViewById(R.id.C);
        mButtonChoiceD = (Button)findViewById(R.id.D);

        updateQuestion();

        //Start Button Listener
        mButtonChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Logic

                if(mButtonChoiceA.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Incorrect!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End Button Listener

        //Start Button Listener
        mButtonChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Logic

                if(mButtonChoiceB.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Incorrect!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End Button Listener

        //Start Button Listener
        mButtonChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Logic

                if(mButtonChoiceC.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Incorrect!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End Button Listener

        //Start Button Listener
        mButtonChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Logic

                if(mButtonChoiceD.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this,"Incorrect!",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End Button Listener
    }
    private void updateQuestion(){
        mQuestionView.setImageResource(mQuestionLibrary.getQuestion(mQuestionNumber)); ;
        mButtonChoiceA.setText(mQuestionLibrary.getChoicesA(mQuestionNumber));
        mButtonChoiceB.setText(mQuestionLibrary.getChoicesB(mQuestionNumber));
        mButtonChoiceC.setText(mQuestionLibrary.getChoicesC(mQuestionNumber));
        mButtonChoiceD.setText(mQuestionLibrary.getChoicesD(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber = mQuestionNumber + 1;
    }


    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }
}
