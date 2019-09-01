package com.example.testverstka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.testverstka.databinding.VoteActivityBinding;

public class VoteAnswers extends AppCompatActivity {

    public String voteAns1;
    public String voteAns2;
    public String voteAns3;
    public String voteAnsPerc1;
    public String voteAnsPerc2;
    public String voteAnsPerc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vote_activity);
        VoteAnswers voteAnswers = new VoteAnswers("Устройство световой стелы – " +
                "«Я люблю Солнечнодольск» в нижней части бульвара Солнечный", "Обустройство " +
                "детской игровой площадки в средней части бульвара Солнечный", "Обустройство зоны" +
                " с фигурами «Топиари»", "21.34 %", "34.41 %", "29.88 %");
        VoteActivityBinding voteBinding = DataBindingUtil.setContentView(this, R.layout.vote_activity);
        voteBinding.setVoteAnswers(voteAnswers);
    }

    public VoteAnswers(String voteAns1, String voteAns2, String voteAns3, String voteAnsPerc1, String voteAnsPerc2, String voteAnsPerc3) {
        this.voteAns1 = voteAns1;
        this.voteAns2 = voteAns2;
        this.voteAns3 = voteAns3;
        this.voteAnsPerc1 = voteAnsPerc1;
        this.voteAnsPerc2 = voteAnsPerc2;
        this.voteAnsPerc3 = voteAnsPerc3;
    }

    public String getVoteAns1() {
        return voteAns1;
    }

    public void setVoteAns1(String voteAns1) {
        this.voteAns1 = voteAns1;
    }

    public String getVoteAns2() {
        return voteAns2;
    }

    public void setVoteAns2(String voteAns2) {
        this.voteAns2 = voteAns2;
    }

    public String getVoteAns3() {
        return voteAns3;
    }

    public void setVoteAns3(String voteAns3) {
        this.voteAns3 = voteAns3;
    }

    public String getVoteAnsPerc1() {
        return voteAnsPerc1;
    }

    public void setVoteAnsPerc1(String voteAnsPerc1) {
        this.voteAnsPerc1 = voteAnsPerc1;
    }

    public String getVoteAnsPerc2() {
        return voteAnsPerc2;
    }

    public void setVoteAnsPerc2(String voteAnsPerc2) {
        this.voteAnsPerc2 = voteAnsPerc2;
    }

    public String getVoteAnsPerc3() {
        return voteAnsPerc3;
    }

    public void setVoteAnsPerc3(String voteAnsPerc3) {
        this.voteAnsPerc3 = voteAnsPerc3;
    }
}
