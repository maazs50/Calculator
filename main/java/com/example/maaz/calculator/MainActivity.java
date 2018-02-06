package com.example.maaz.calculator;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
Button  btnadd, btnsub, btnmul,btndiv, clear;
EditText oper1, oper2, result;
TextView txtresult;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
oper1=(EditText) findViewById(R.id.num1);
        oper2=(EditText) findViewById(R.id.num2);
       btnadd=(Button)findViewById(R.id.add);
        btnsub=(Button)findViewById(R.id.minus);
        btnmul=(Button)findViewById(R.id.multiply);
        btndiv=(Button)findViewById(R.id.divide);
clear=(Button)findViewById(R.id.clear);
txtresult=(TextView) findViewById(R.id.result);

        edittext= (EditText) findViewById(R.id.date);

    }

    //Is called when add button is pressed
    public void onAdd(View v) {
        if (oper1.getText().length() > 0 && oper2.getText().length() > 0) {
            double num1 = Double.parseDouble(oper1.getText().toString());
            double num2 = Double.parseDouble(oper2.getText().toString());
            double result = num1 + num2;
            txtresult.setText("" + result);
        } else {
            Toast.makeText(this,"Enter both the numbers",Toast.LENGTH_SHORT).show();
        }
    }
        public void onClear(View v){
        txtresult.setText("");
            oper1.setText("");
            oper2.setText("");
            oper1.requestFocus();
    }


    public void onSub(View v) {
        if (oper1.getText().length() > 0 && oper2.getText().length() > 0) {
            double num1 = Double.parseDouble(oper1.getText().toString());
            double num2 = Double.parseDouble(oper2.getText().toString());
            double result = num1 - num2;
            txtresult.setText("" + result);
        } else {
            Toast.makeText(this,"Enter both the numbers",Toast.LENGTH_SHORT).show();
        }
    }
    public void onMultiply(View v) {
        if (oper1.getText().length() > 0 && oper2.getText().length() > 0) {
            double num1 = Double.parseDouble(oper1.getText().toString());
            double num2 = Double.parseDouble(oper2.getText().toString());
            double result = num1 * num2;
            txtresult.setText("" + result);
        } else {
            Toast.makeText(this,"Enter both the numbers",Toast.LENGTH_SHORT).show();
        }
    }


    public void onDivide(View v) {
        if (oper1.getText().length() > 0 && oper2.getText().length() > 0) {
            double num1 = Double.parseDouble(oper1.getText().toString());
            double num2 = Double.parseDouble(oper2.getText().toString());
            double result = num1 / num2;
            txtresult.setText("" + result);
        } else {
            Toast.makeText(this,"Enter both the numbers",Toast.LENGTH_SHORT).show();
        }
    }

    Calendar myCalendar = Calendar.getInstance();


    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }

    };


        public void onClick(View v) {
            // TODO Auto-generated method stub
            new DatePickerDialog(MainActivity.this, date, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                    myCalendar.get(Calendar.DAY_OF_MONTH)).show();
        }

    private void updateLabel() {
        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        edittext.setText(sdf.format(myCalendar.getTime()));
    }
    }






