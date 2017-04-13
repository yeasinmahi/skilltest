package com.gits.arafat.skilltest.Activity;

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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gits.arafat.skilltest.Api.ApiHelper;
import com.gits.arafat.skilltest.Database.DbHelper;
import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.Question;
import com.gits.arafat.skilltest.NetworkManager.NetworkUtil;
import com.gits.arafat.skilltest.Others.MyInterface;
import com.gits.arafat.skilltest.Others.Utility;
import com.gits.arafat.skilltest.R;

import java.util.ArrayList;
import java.util.HashMap;

public class QuestionActivity extends AppCompatActivity implements MyInterface.OnTaskCompleted,MyInterface.OnRetry{
    private int categoryId,subCategoryId,currentPosition,questionSize,totalAnsweredQuestion;
    private TextView questionTextView,correctAnsTextView,headingQuestionStatus;
    private RadioButton optionARadioButton,optionBRadioButton,optionCRadioButton,optionDRadioButton;
    private Button checkButton, nextButton,prvButton;
    private LinearLayout checkLayout;
    private RelativeLayout nextLayout;
    private RadioGroup radioGroup;
    private ProgressDialog progressBar;
    public ArrayList<HashMap<String,String> > list = new ArrayList<HashMap<String,String>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Init();
        InitConfig();

    }

    private void Init() {
        Intent intent = getIntent();
        categoryId=(Integer) intent.getExtras().get("categoryId");
        subCategoryId=(Integer) intent.getExtras().get("subCategoryId");

        questionTextView= (TextView) findViewById(R.id.questionTextView);
        correctAnsTextView= (TextView) findViewById(R.id.correctAnsTextView);
        headingQuestionStatus= (TextView) findViewById(R.id.headingQuestionStatus);
        optionARadioButton = (RadioButton) findViewById(R.id.optionARadioButton);
        optionBRadioButton = (RadioButton) findViewById(R.id.optionBRadioButton);
        optionCRadioButton = (RadioButton) findViewById(R.id.optionCRadioButton);
        optionDRadioButton = (RadioButton) findViewById(R.id.optionDRadioButton);
        checkButton = (Button) findViewById(R.id.checkButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        prvButton = (Button) findViewById(R.id.prvButton);
        checkLayout = (LinearLayout) findViewById(R.id.checkLayout);
        nextLayout = (RelativeLayout) findViewById(R.id.nextLayout);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

    }
    public void InitConfig(){
        //requestToApi();
        getQuestionFomDatabase();
    }

    private void requestToApi() {
        if (NetworkUtil.isConnectingToInternet(this)){
            progressBar = Utility.getProgressBar(this);
            progressBar.show();
            new ApiHelper(this).execute("getQuestion",String.valueOf(categoryId),String.valueOf(subCategoryId));

        }
        else {
            Utility.popUpWindow(this,this,"Check your internet",true);
        }
    }
    private void getQuestionFomDatabase(){
        DbHelper dbHelper = new DbHelper(this);
        progressBar=Utility.getProgressBar(this);
        progressBar.show();
            ArrayList<Question> questions=dbHelper.getQuestion(categoryId,subCategoryId);
            list.clear();
            for (Question question:questions) {
                HashMap<String, String> temp = new HashMap<String, String>();
                temp.put("id", String.valueOf(question.getId()));
                temp.put("question", question.getQuestion());
                temp.put("optionA", question.getOptionA());
                temp.put("optionB", question.getOptionB());
                temp.put("optionC", question.getOptionC());
                temp.put("optionD", question.getOptionD());
                temp.put("correctAns", question.getCorrectAns());
                temp.put("categoryId", String.valueOf(question.getCategoryId()));
                temp.put("subCategoryId", String.valueOf(question.getSubCategoryId()));
                temp.put("isAnswered", "0");
                temp.put("isCorrect", "0");
                list.add(temp);
            }

        questionSize=list.size();
        if(questionSize>0){
            setControlVisibility(true);
            list = Utility.getRandomizationList(list);
            questionSize = Utility.setQuestionSize(questionSize);
            headingQuestionStatus.setText(String.valueOf(totalAnsweredQuestion)+"/"+ String.valueOf(questionSize));
            setQuestion(0);
            if (currentPosition>=questionSize-1){
                nextButton.setVisibility(View.INVISIBLE);
            }
            if (currentPosition>=0){
                prvButton.setVisibility(View.INVISIBLE);
            }

        }else {
            setControlVisibility(false);
            Utility.popUpWindow(this,this,"No question available",true);
        }
        progressBar.cancel();
        progressBar.dismiss();
    }

    @Override
    public void onTaskCompleted(Utility.Status isSuccess) {
        if (isSuccess== Utility.Status.success){
            questionSize=list.size();
            if(questionSize>0){
                setControlVisibility(true);
                list = Utility.getRandomizationList(list);
                questionSize = Utility.setQuestionSize(questionSize);
                headingQuestionStatus.setText(String.valueOf(totalAnsweredQuestion)+"/"+ String.valueOf(questionSize));
                setQuestion(0);
                if (currentPosition>=questionSize-1){
                    nextButton.setVisibility(View.INVISIBLE);
                }
                if (currentPosition>=0){
                    prvButton.setVisibility(View.INVISIBLE);
                }

            }else {
                setControlVisibility(false);
                Utility.popUpWindow(this,this,"No question available",true);
            }


        }else if(isSuccess== Utility.Status.noData){
            setControlVisibility(false);
            Utility.popUpWindow(this,this,"No question available",true);
        }else {
            setControlVisibility(false);
            Utility.popUpWindow(this,this,"Check your internet",true);
        }
        progressBar.cancel();
        progressBar.dismiss();
    }
    public void setControlVisibility(boolean b){
        if (b){
            nextLayout.setVisibility(View.VISIBLE);
            checkLayout.setVisibility(View.VISIBLE);
            radioGroup.setVisibility(View.VISIBLE);
            correctAnsTextView.setVisibility(View.VISIBLE);
            questionTextView.setVisibility(View.VISIBLE);
        }else {
            nextLayout.setVisibility(View.GONE);
            checkLayout.setVisibility(View.GONE);
            radioGroup.setVisibility(View.GONE);
            correctAnsTextView.setVisibility(View.GONE);
            questionTextView.setVisibility(View.GONE);
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

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        if(radioButtonID!=-1){
            totalAnsweredQuestion++;
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
            String text= radioButton.getText().toString();
            String correctAns=Utility.getCorrectAnswered(list,currentPosition);
            if (text.startsWith(correctAns)){
                Utility.setQuestionProperty(list,currentPosition,"1","1");
                correctAnsTextView.setTextColor(Color.parseColor("#0d7700"));
                correctAnsTextView.setText("Your ans is Correct");
            }else {
                Utility.setQuestionProperty(list,currentPosition,"1","0");
                correctAnsTextView.setTextColor(Color.parseColor("#ff0000"));
                correctAnsTextView.setText("Wrong!!! Correct Ans is "+correctAns);
            }
            checkButton.setEnabled(false);
        }else {
            correctAnsTextView.setTextColor(Color.parseColor("#ff0000"));
            correctAnsTextView.setText("Select one option first");
        }

        headingQuestionStatus.setText(String.valueOf(totalAnsweredQuestion)+"/"+ String.valueOf(questionSize));
        if (totalAnsweredQuestion==questionSize){
            Utility.popUpWindow(this,this,"Your total correct answer is\n"+Utility.getTotalCorrectAnswer(list,questionSize)+" out of "+questionSize,false);
        }
    }

    @Override
    public void onRetry() {
        //requestToApi();
        getQuestionFomDatabase();
    }
}
