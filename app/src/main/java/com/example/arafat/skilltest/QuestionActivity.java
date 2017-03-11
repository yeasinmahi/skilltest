package com.example.arafat.skilltest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class QuestionActivity extends AppCompatActivity implements MyInterface.OnTaskCompleted,MyInterface.OnRetry{
    private int categoryId,currentPosition,questionSize,totalAnsweredQuestion;
    private TextView questionTextView,correctAnsTextView;
    private RadioButton optionARadioButton,optionBRadioButton,optionCRadioButton,optionDRadioButton;
    private Button checkButton, nextButton,prvButton;
    private LinearLayout checkLayout,nextLayout;
    private RadioGroup radioGroup;
    private ProgressDialog progressDialog;
    public ArrayList<HashMap<String,String> > list = new ArrayList<HashMap<String,String>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Init();
        requestToApi();
    }

    private void Init() {
        Intent intent = getIntent();
        categoryId=(Integer) intent.getExtras().get("categoryId");

        questionTextView= (TextView) findViewById(R.id.questionTextView);
        correctAnsTextView= (TextView) findViewById(R.id.correctAnsTextView);
        optionARadioButton = (RadioButton) findViewById(R.id.optionARadioButton);
        optionBRadioButton = (RadioButton) findViewById(R.id.optionBRadioButton);
        optionCRadioButton = (RadioButton) findViewById(R.id.optionCRadioButton);
        optionDRadioButton = (RadioButton) findViewById(R.id.optionDRadioButton);
        checkButton = (Button) findViewById(R.id.checkButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        prvButton = (Button) findViewById(R.id.prvButton);
        checkLayout = (LinearLayout) findViewById(R.id.checkLayout);
        nextLayout = (LinearLayout) findViewById(R.id.nextLayout);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        questionTextView.setText("");
        setControlVisibility(false);

    }

    private void requestToApi() {
        if (Utility.isConnectingToInternet(this)){
            progressDialog = Utility.getProgressBar(this);
            progressDialog.show();
            new ApiHelper(this, this,list).execute("getQuestion",String.valueOf(categoryId));
        }
        else {
            Utility.popUpWindow(this,this,"Check your internet");
        }
    }

    @Override
    public void onTaskCompleted(Utility.Error isSuccess) {
        if (isSuccess== Utility.Error.success){
            questionSize=list.size();
            if(questionSize>0){
                setControlVisibility(true);
                list = Utility.getRandomizationList(list);
                setQuestion(0);
                if (currentPosition>=questionSize-1){
                    nextButton.setVisibility(View.INVISIBLE);
                }
                if (currentPosition>=0){
                    prvButton.setVisibility(View.INVISIBLE);
                }

            }else {
                setControlVisibility(false);
                Utility.popUpWindow(this,this,"No question available");
            }


        }else if(isSuccess== Utility.Error.noData){
            setControlVisibility(false);
            Utility.popUpWindow(this,this,"No question available");
        }else {
            setControlVisibility(false);
            Utility.popUpWindow(this,this,"Check your internet");
        }
        progressDialog.cancel();
        progressDialog.dismiss();
    }
    public void setControlVisibility(boolean b){
        if (b){
            nextLayout.setVisibility(View.VISIBLE);
            checkLayout.setVisibility(View.VISIBLE);
            radioGroup.setVisibility(View.VISIBLE);
            correctAnsTextView.setVisibility(View.VISIBLE);
        }else {
            nextLayout.setVisibility(View.GONE);
            checkLayout.setVisibility(View.GONE);
            radioGroup.setVisibility(View.GONE);
            correctAnsTextView.setVisibility(View.GONE);
        }
    }

    private void setQuestion(int questionNo){
        correctAnsTextView.setText("");
        questionTextView.setText(String.valueOf(questionNo+1)+". "+String.valueOf(list.get(questionNo).get("question")));
        optionARadioButton.setText("A. "+String.valueOf(list.get(questionNo).get("optionA")));
        optionBRadioButton.setText("B. "+String.valueOf(list.get(questionNo).get("optionB")));
        optionCRadioButton.setText("C. "+String.valueOf(list.get(questionNo).get("optionC")));
        optionDRadioButton.setText("D. "+String.valueOf(list.get(questionNo).get("optionD")));

    }

    public void navigationButtonOnClick(View view){
        radioGroup.clearCheck();
        nextButton.setVisibility(View.VISIBLE);
        prvButton.setVisibility(View.VISIBLE);
        questionSize = Utility.setQuestionSize(questionSize);
        if (view.getId()==R.id.nextButton){
            currentPosition++;
            if (currentPosition>=questionSize-1){
                nextButton.setVisibility(View.INVISIBLE);
            }

        }else if(view.getId()==R.id.prvButton){
            currentPosition--;
            if (currentPosition<=0){
                prvButton.setVisibility(View.INVISIBLE);
            }
        }
        if (Utility.isAnswered(list,currentPosition)){
            checkButton.setEnabled(false);
            checkRadioButtonOnCorrectAns();
        }else {
            checkButton.setEnabled(true);
        }
        setQuestion(currentPosition);

    }

    private void checkRadioButtonOnCorrectAns() {
        String correctAns=Utility.getCorrectAnswered(list,currentPosition);
        switch (correctAns){
            case "A":
                optionARadioButton.setChecked(true);
                break;
            case "B":
                optionBRadioButton.setChecked(true);
                break;
            case "C":
                optionCRadioButton.setChecked(true);
                break;
            case "D":
                optionDRadioButton.setChecked(true);
                break;
        }
    }

    public void checkButtonOnClick(View view){
        totalAnsweredQuestion++;
        if (totalAnsweredQuestion==Utility.questionToBeAnswered){
            Utility.popUpWindow(this,this,"Your total correct answer is "+Utility.getTotalCorrectAnswer(list,questionSize));
        }
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        if(radioButtonID!=-1){
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
            String text= radioButton.getText().toString();
            String correctAns=Utility.getCorrectAnswered(list,currentPosition);
            if (text.startsWith(correctAns)){
                Utility.setQuestionProperty(list,currentPosition,"1","1");
                correctAnsTextView.setTextColor(Color.parseColor("#00ff00"));
            }else {
                Utility.setQuestionProperty(list,currentPosition,"1","0");
                correctAnsTextView.setTextColor(Color.parseColor("#ff0000"));
            }
            checkButton.setEnabled(false);
            correctAnsTextView.setText("Correct Ans is "+correctAns);
        }else {
            correctAnsTextView.setTextColor(Color.parseColor("#ff0000"));
            correctAnsTextView.setText("Select one option first");
        }

    }

    @Override
    public void onRetry() {
        requestToApi();
    }
}
