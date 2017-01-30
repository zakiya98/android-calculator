package com.example.tutu.myapplication;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String a;
    char operation;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display1);
    }

    public void buttonNumberClick(View v) {

        String text = textView.getText().toString();
        Button btn = (Button) v;

        if (text.equals("0") && btn.getText().equals("0")) {
            return;
        }
        if(btn.getText().equals(".") && text.contains(".")) {
            return;
        }
        textView.setText(text + btn.getText());
    }

    public void buttonClearClick(View v) {

        textView.setText("");
    }

    public void buttonAddClick(View v) {

        a = textView.getText().toString();
        operation = '+';
        textView.setText("");
    }

    public void buttonSubtrcatClick(View v) {

        a = textView.getText().toString();
        operation = '-';
        textView.setText("");
    }

    public void buttonMultiplyClick(View v) {

        a = textView.getText().toString();
        operation = '*';
        textView.setText("");
    }

    public void buttonDivideClick(View v) {

        a = textView.getText().toString();
        operation = '/';
        textView.setText("");
    }

    public void buttonEqualClick(View v) {
        double eded1 = Double.parseDouble(a);
        double cavab = 0;
        String b = textView.getText().toString();
        double eded2 = Double.parseDouble(b);
        switch (operation) {
            case '+':
                cavab = eded1 + eded2;
                break;
            case '-':
                cavab = eded1 - eded2;
                break;
            case '*':
                cavab = eded1 * eded2;
                break;
            case '/':
                cavab = eded1 / eded2;
                break;
        }
        textView.setText(cavab + "");

    }
}
