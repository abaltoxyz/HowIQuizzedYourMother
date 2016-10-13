/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Android Basics Nanodegree by Google & Udacity
 * Project #3: Quiz App
 * Student: Kevin Baltodano
 * WARNING: "How I Met Your Mother" SPOILERS ahead!
 */

package com.android.example.howiquizzedyourmother;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.android.example.howiquizzedyourmother.R.id.question10_answer;
import static com.android.example.howiquizzedyourmother.R.id.question1_option2;
import static com.android.example.howiquizzedyourmother.R.id.question2_option3;
import static com.android.example.howiquizzedyourmother.R.id.question3_option1;
import static com.android.example.howiquizzedyourmother.R.id.question4_option2;
import static com.android.example.howiquizzedyourmother.R.id.question5_option1;
import static com.android.example.howiquizzedyourmother.R.id.question6_option1;
import static com.android.example.howiquizzedyourmother.R.id.question6_option2;
import static com.android.example.howiquizzedyourmother.R.id.question6_option3;
import static com.android.example.howiquizzedyourmother.R.id.question6_option4;
import static com.android.example.howiquizzedyourmother.R.id.question7_option4;
import static com.android.example.howiquizzedyourmother.R.id.question8_option2;
import static com.android.example.howiquizzedyourmother.R.id.question9_option3;

public class MainActivity extends AppCompatActivity {
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates the total score.
     * Adds one point to the score for each correct answer submitted.
     * If answer is wrong, highlights the right answer using setTextAppearance.
     *
     * @return total score
     */
    private int calculateScore() {
        //Checks and adds a point if answer for question # 1 is correct. (correct = question1_option2)
        RadioButton question1 = (RadioButton) findViewById(question1_option2);
        boolean isQuestion1Correct = question1.isChecked();
        if (isQuestion1Correct) {
            score = score + 1;
        } else {
            question1.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 2 is correct. (correct = question2_option3)
        RadioButton question2 = (RadioButton) findViewById(question2_option3);
        boolean isQuestion2Correct = question2.isChecked();
        if (isQuestion2Correct) {
            score = score + 1;
        } else {
            question2.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 3 is correct. (correct = question3_option1)
        RadioButton question3 = (RadioButton) findViewById(question3_option1);
        boolean isQuestion3Correct = question3.isChecked();
        if (isQuestion3Correct) {
            score = score + 1;
        } else {
            question3.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 4 is correct. (correct = question4_option2)
        RadioButton question4 = (RadioButton) findViewById(question4_option2);
        boolean isQuestion4Correct = question4.isChecked();
        if (isQuestion4Correct) {
            score = score + 1;
        } else {
            question4.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 5 is correct. (correct = question5_option1)
        RadioButton question5 = (RadioButton) findViewById(question5_option1);
        boolean isQuestion5Correct = question5.isChecked();
        if (isQuestion5Correct) {
            score = score + 1;
        } else {
            question5.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if the answers for question # 6 are correct (correct = question6_option1 && question6_option3 && question6_option4).
        CheckBox question6Option1 = (CheckBox) findViewById(question6_option1);
        boolean isQuestion6Option1Checked = question6Option1.isChecked();
        CheckBox question6Option2 = (CheckBox) findViewById(question6_option2);
        boolean isQuestion6Option2Checked = question6Option2.isChecked();
        CheckBox question6Option3 = (CheckBox) findViewById(question6_option3);
        boolean isQuestion6Option3Checked = question6Option3.isChecked();
        CheckBox question6Option4 = (CheckBox) findViewById(question6_option4);
        boolean isQuestion6Option4Checked = question6Option4.isChecked();
        if (isQuestion6Option1Checked && isQuestion6Option2Checked && isQuestion6Option3Checked && isQuestion6Option4Checked) {
            //Explicit for "keep the score unchanged" as all options are selected.
            score = score;
            question6Option1.setTextAppearance(this, R.style.CorrectAnswer);
            question6Option3.setTextAppearance(this, R.style.CorrectAnswer);
            question6Option4.setTextAppearance(this, R.style.CorrectAnswer);
        } else if (isQuestion6Option1Checked && isQuestion6Option3Checked && isQuestion6Option4Checked) {
            score = score + 1;
        } else {
            question6Option1.setTextAppearance(this, R.style.CorrectAnswer);
            question6Option3.setTextAppearance(this, R.style.CorrectAnswer);
            question6Option4.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 7 is correct. (correct = question7_option4)
        RadioButton question7 = (RadioButton) findViewById(question7_option4);
        boolean isQuestion7Correct = question7.isChecked();
        if (isQuestion7Correct) {
            score = score + 1;
        } else {
            question7.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 8 is correct. (correct = question8_option2)
        RadioButton question8 = (RadioButton) findViewById(question8_option2);
        boolean isQuestion8Correct = question8.isChecked();
        if (isQuestion8Correct) {
            score = score + 1;
        } else {
            question8.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question # 9 is correct. (correct = question9_option3)
        RadioButton question9 = (RadioButton) findViewById(question9_option3);
        boolean isQuestion9Correct = question9.isChecked();
        if (isQuestion9Correct) {
            score = score + 1;
        } else {
            question9.setTextAppearance(this, R.style.CorrectAnswer);
        }
        //Checks and adds a point if answer for question #10 is correct. (correct = "Tracy")
        EditText question10 = (EditText) findViewById(question10_answer);
        String question10Answer = question10.getText().toString();
        if (question10Answer.equalsIgnoreCase("Tracy")) {
            score = score + 1;
        }else {
            question10.setText("Tracy");
            question10.setTextAppearance(this, R.style.CorrectAnswer);
        }

        return score;
    }

    /**
     * Defines score.
     * Makes toast message for score gained.
     * Resets score back to zero.
     */
    public void submitAnswers(View v) {
        score = calculateScore();
        if (score == 10) {
            Toast.makeText(this, getString(R.string.you_scored) + " " + score + " " + getString(R.string.out_of_ten) + "\n" + getString(R.string.legen_dary), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, getString(R.string.you_scored) + " " + score + " " + getString(R.string.out_of_ten) + "\n" + getString(R.string.try_again), Toast.LENGTH_LONG).show();
        }
        //Resets score back to zero.
        score = 0;
    }


}
