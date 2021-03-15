package com.cs.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText edt_m;
    private TextView textView2;
    private TextView textView;
    private EditText edt_h;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        edt_m=findViewById(R.id.edt_m);
        edt_h=findViewById(R.id.edt_h);
        result=findViewById(R.id.result);

    }

    public void btn_calc(View view) {

        String h=edt_h.getText().toString();
        String m=edt_m.getText().toString();
        float heightValue = Float.parseFloat(String.valueOf(edt_h)) / 100;
        float weightValue = Float.parseFloat(String.valueOf(edt_m));
        float bmi = weightValue / (heightValue * heightValue);
        result.setText((int) bmi);

    }
}