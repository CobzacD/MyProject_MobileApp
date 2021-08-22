package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
RadioButton zero, one, two, three, four, five, six, seven, eight, nine, rom, rus, eng;
    Button result;
TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        zero=(RadioButton) findViewById(R.id.zero);
        one=(RadioButton) findViewById(R.id.one);
        two=(RadioButton) findViewById(R.id.two);
        three=(RadioButton) findViewById(R.id.three);
        four=(RadioButton) findViewById(R.id.four);
        five=(RadioButton) findViewById(R.id.five);
        six=(RadioButton) findViewById(R.id.six);
        seven=(RadioButton) findViewById(R.id.seven);
        eight=(RadioButton) findViewById(R.id.eight);
        nine=(RadioButton) findViewById(R.id.nine);
        rom=(RadioButton) findViewById(R.id.rom);
        rus=(RadioButton) findViewById(R.id.rus);
        eng=(RadioButton) findViewById(R.id.eng);
        result = (Button)findViewById(R.id.result);
        resultView = (TextView)findViewById(R.id.resultView);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (zero.isChecked()&&rom.isChecked()){
                resultView.setText("Zero");
            } else
            if (zero.isChecked()&&rus.isChecked()){
                resultView.setText("Ноль");
            } else
            if (zero.isChecked()&&eng.isChecked()){
                resultView.setText("Zero");
            } else
            if (one.isChecked()&&rom.isChecked()){
                resultView.setText("Unu");
            } else
            if (one.isChecked()&&rus.isChecked()){
                resultView.setText("Один");
            } else
            if (one.isChecked()&&eng.isChecked()){
                resultView.setText("One");
            } else
            if (two.isChecked()&&rom.isChecked()){
                resultView.setText("Doi");
            } else
            if (two.isChecked()&&rus.isChecked()){
                resultView.setText("Два");
            } else
            if (two.isChecked()&&eng.isChecked()){
                resultView.setText("Two");
            } else
            if (three.isChecked()&&rom.isChecked()){
                resultView.setText("Trei");
            } else
            if (three.isChecked()&&rus.isChecked()){
                resultView.setText("Три");
            } else
            if (three.isChecked()&&eng.isChecked()){
                resultView.setText("Three");
            } else
            if (four.isChecked()&&rom.isChecked()){
                resultView.setText("Patru");
            } else
            if (four.isChecked()&&rus.isChecked()){
                resultView.setText("Четыре");
            } else
            if (four.isChecked()&&eng.isChecked()){
                resultView.setText("Four");
            } else
            if (five.isChecked()&&rom.isChecked()){
                resultView.setText("Cinci");
            } else
            if (five.isChecked()&&rus.isChecked()){
                resultView.setText("Пять");
            } else
            if (five.isChecked()&&eng.isChecked()){
                resultView.setText("Five");
            } else
            if (six.isChecked()&&rom.isChecked()){
                resultView.setText("Șase");
            } else
            if (six.isChecked()&&rus.isChecked()){
                resultView.setText("Шесть");
            } else
            if (six.isChecked()&&eng.isChecked()){
                resultView.setText("Six");
            } else
            if (seven.isChecked()&&rom.isChecked()){
                resultView.setText("Șapte");
            } else
            if (seven.isChecked()&&rus.isChecked()){
                resultView.setText("Семь");
            } else
            if (seven.isChecked()&&eng.isChecked()){
                resultView.setText("Seven");
            } else
            if (eight.isChecked()&&rom.isChecked()){
                resultView.setText("Opt");
            } else
            if (eight.isChecked()&&rus.isChecked()){
                resultView.setText("Восемь");
            } else
            if (eight.isChecked()&&eng.isChecked()){
                resultView.setText("Eight");
            } else
            if (nine.isChecked()&&rom.isChecked()){
                resultView.setText("Nouă");
            } else
            if (nine.isChecked()&&rus.isChecked()){
                resultView.setText("Девять");
            } else
            if (nine.isChecked()&&eng.isChecked()){
                resultView.setText("Nine");
                                }
            }
        });
    }
}