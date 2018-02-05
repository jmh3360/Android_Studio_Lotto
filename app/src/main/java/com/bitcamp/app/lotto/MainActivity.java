package com.bitcamp.app.lotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = findViewById(R.id.result);
        findViewById(R.id.yab_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] lotto = new int[6];

                String res = "";
                for(int i = 0; i<6;i++){
                    lotto[i] =  ((int)(Math.random()*44+1));
                        for(int j = 0;j<i;j++){
                            if (lotto[i]==(lotto[j])){
                                i--;
                            }
                        }
                }
                Arrays.sort(lotto);
                for (int i =0; i<6;i++){
                    res += lotto[i]+" ";
                }
                result.setText(res);
            }
        });
    }
}
