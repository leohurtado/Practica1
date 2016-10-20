package edu.tecii.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNum;
    EditText txtRes;
    Button btnSum;
    int num,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = (EditText) findViewById(R.id.txtNumero);
        txtRes = (EditText) findViewById(R.id.txtResultado);
        btnSum = (Button) findViewById(R.id.btnSumar);
    }
    public void suma (View v){
        num = Integer.parseInt(txtNum.getText().toString());
        res = (num*(num+1))/2;
        txtRes.setText(res+"");
    }
}
