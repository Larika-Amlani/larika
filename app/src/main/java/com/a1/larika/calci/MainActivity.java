package com.a1.larika.calci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    TextView tv;
    int num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView);

    }

    public void add(View view) {
        num1 = Integer.parseInt(ed1.getText().toString());
        num2 = Integer.parseInt(ed2.getText().toString());
        res = num1 + num2;
        tv.setText(res);
    }

    public void sub(View view) {

        num1 = Integer.parseInt(ed1.getText().toString());
        num2 = Integer.parseInt(ed2.getText().toString());
        res = num1 - num2;
        tv.setText(res);

    }

    public void mul(View view) {

        num1 = Integer.parseInt(ed1.getText().toString());
        num2 = Integer.parseInt(ed2.getText().toString());
        res = num1 * num2;
        tv.setText(res);


    }

    public void div(View view) {
        num1 = Integer.parseInt(ed1.getText().toString());
        num2 = Integer.parseInt(ed2.getText().toString());
        if (num2 != 0) {
            res = num1 / num2;
            tv.setText(res);
        }


    }
}
