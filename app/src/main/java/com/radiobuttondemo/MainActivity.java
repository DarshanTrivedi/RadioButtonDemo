package com.radiobuttondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by sotsys016-2 on 6/12/16 in com.radiobuttondemo.
 */

public class MainActivity extends AppCompatActivity{
    private RadioGroup radioGroupOpinion;
    private RadioButton radioPoll;
    private Button btnResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupOpinion = (RadioGroup) findViewById(R.id.radioOpinion);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = radioGroupOpinion.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioPoll = (RadioButton) findViewById(selectedId);

                if(radioPoll.getText().toString().equalsIgnoreCase("Yes")) {
                    Toast.makeText(MainActivity.this,
                            "Aha..! Thank you very much..!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,
                            "Ohh...What is the problem?", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
