package com.example.testverstka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.testverstka.databinding.ActivityMainBinding;
import com.example.testverstka.databinding.DialogLayoutBinding;
import com.example.testverstka.databinding.VoteActivityBinding;

public class MainActivity extends AppCompatActivity {

    TextView linkText;
    Dialog dialog;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VoteMainDescription voteMainDescription =
                new VoteMainDescription("Благоустройство бульвара Солнечный",
                        "Сообщество", "Открытое", "05.07.2019 - 20.07.2019");
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVoteMainDescription(voteMainDescription);

        linkText = (TextView)findViewById(R.id.linkText);
        linkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_layout);

    /*    VoteQR voteQR = new VoteQR("В 2019 году в рамках регионального проекта " +
                "«Повышение комфортности городской среды Ставропольского края» проводится " +
                "благоустройство бульвара Солнечный. На бульваре будут оборудованы зоны для " +
                "проведения праздников, для семейного и тихого отдыха, входная группа. \n" +
                "Мы хотим, чтобы бульвар стал излюбленным местом отдыха для всех жителей. " +
                "Как вам кажется, какой точки притяжения еще не хватает на бульваре? Это может " +
                "быть детская площадка, фотозона, топиарные фигуры или световая стела. " +
                "Ваше мнение очень важно.\n");
        DialogLayoutBinding dlBinding = DataBindingUtil.setContentView( dialog.show(), R.layout.dialog_layout);
        dlBinding.setVoteQR(voteQR); */

    }
}