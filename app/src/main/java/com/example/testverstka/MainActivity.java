package com.example.testverstka;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView voteDescriptionText;
    TextView initEnterText;
    TextView typeEnterText;
    TextView dateEnterText;
    TextView linkText;
    TextView descTextVote1;
    TextView descTextVote2;
    TextView descTextVote3;
    TextView percVote1;
    TextView percVote2;
    TextView percVote3;
    Dialog dialog;
   /* RadioButton vote1;
    RadioButton vote2;
    RadioButton vote3; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        voteDescriptionText = (TextView)findViewById(R.id.voteDescriptionText);
        voteDescriptionText.setText("Благосутройство бульвара Солнечный");

        initEnterText = (TextView)findViewById(R.id.initEnterText);
        initEnterText.setText("Сообщество");

        typeEnterText = (TextView)findViewById(R.id.typeEnterText);
        typeEnterText.setText("Открытое");

        dateEnterText = (TextView)findViewById(R.id.dateEnterText);
        dateEnterText.setText("05.07.2019 - 20.07.2019");

        linkText = (TextView)findViewById(R.id.linkText);
        linkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_layout);

        descTextVote1 = (TextView)findViewById(R.id.descTextVote1);
        descTextVote1.setText("Устройстро световой стелы - 'Я люблю Солнечнодольск' в нижней части бульвара Солнечный");

        descTextVote2 = (TextView)findViewById(R.id.descTextVote2);
        descTextVote2.setText("Обустройство детской игровой площадки в средней части бульвара Солнечный");

        descTextVote3 = (TextView)findViewById(R.id.descTextVote3);
        descTextVote3.setText("Обустройство зоны с фигурами 'Топиари'");

        percVote1 = (TextView)findViewById(R.id.percVote1);
        percVote1.setText("21.34%");

        percVote2 = (TextView)findViewById(R.id.percVote2);
        percVote2.setText("38.41%");

        percVote3 = (TextView)findViewById(R.id.percVote3);
        percVote3.setText("29.88%");

      /*  vote1 = (RadioButton)findViewById(R.id.vote1);
        vote1.setText("Устройстро световой стелы - 'Я люблю Солнечнодольск' в нижней части бульвара Солнечный");

        vote2 = (RadioButton)findViewById(R.id.vote2);
        vote2.setText("Обустройство детской игровой площадки в средней части бульвара Солнечный");

        vote3 = (RadioButton)findViewById(R.id.vote3);
        vote3.setText("Обустройство зоны с фигурами 'Топиари'"); */
    }
}