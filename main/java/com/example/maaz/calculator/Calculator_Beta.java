package com.example.maaz.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class Calculator_Beta extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equal, reset, delete;
    TextView result;
 Character op='q';
    float num, numTemp;
    String str="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator__beta);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        sub = (Button) findViewById(R.id.sub);
        add = (Button) findViewById(R.id.add);
        delete=(Button)findViewById(R.id.delete);
        reset = (Button) findViewById(R.id.reset);
        result=(TextView)findViewById(R.id.result);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
insert(9);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num>0){

insert(0);
            }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 reset();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calculate();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perform();
                op='/';
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perform();
                op='*';
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perform();
                op='-';
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perform();
                op='+';
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });


    }

    private void calculate() {
        if(op=='/'){
            num=numTemp/num;
        }else if (op=='*'){
            num=numTemp*num;
        }
        else if (op=='-'){
            num=numTemp-num;
        }else if (op=='+'){
            num=numTemp+num;
        }
        result.setText(""+num);
    }

    private void perform() {
    str="";
        numTemp=num;
    }

    private void insert(int i) {


        str = str + Integer.toString(i); // Remeber The string value should be initialized in the declaration or else string will contain null value
        num = Integer.parseInt(str);

        result.setText(str);

}


    private void reset() {
        str="";
        num=0;
        numTemp=0;
        op='q';
        result.setText(""+num);

    }
    public void delete(){
int temp=Integer.valueOf(str).intValue();
  if(temp==0){

      str=Integer.toString(temp);

      result.setText(""+str);
}else{

    temp=temp/10;
    str=Integer.toString(temp);
    num=Integer.valueOf(str).intValue();
      result.setText(""+str);
}
    }



}
