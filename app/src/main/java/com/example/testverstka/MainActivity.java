package com.example.testverstka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView voteDescriptionText;
    TextView initEnterText;
    TextView typeEnterText;
    TextView dateEnterText;
    TextView linkText;

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
        linkText.setText(Html.fromHtml("<a href=http://www.google.com>Показать описание и QR-код голосования</a>"));
    }
}