package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView tv1,tv2,anstv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        tv1 = (TextView)findViewById(R.id.editTextTextPersonName);
        tv2 = (TextView)findViewById(R.id.editTextTextPersonName2);
        anstv =(TextView)findViewById(R.id.textView4);

      /*  tv1.setText(getIntent().getStringExtra("num1"));
        tv2.setText(getIntent().getStringExtra("num2"));
        */
       String no1 = intent.getStringExtra("num1");
       tv1.setText(no1);
       String no2 = intent.getStringExtra("num2");
       tv2.setText(no2);

       btnAdd = (Button)findViewById(R.id.btnAdd);
       btnSub =(Button)findViewById(R.id.btnSub);
       btnMul =(Button)findViewById(R.id.btnMul);
       btnDiv =(Button)findViewById(R.id.btnDiv);

       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Integer s1 =Integer.parseInt(tv1.getText().toString());
               Integer s2 =Integer.parseInt(tv2.getText().toString());
               Integer result =s1+s2;
               anstv.setText(tv1.getText()+"+"+tv2.getText()+"=" +Integer.toString(result));
           }
       });
       btnSub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Integer s1 =Integer.parseInt(tv1.getText().toString());
               Integer s2 =Integer.parseInt(tv2.getText().toString());
               Integer result =s1-s2;
               anstv.setText(tv1.getText()+"-"+tv2.getText()+"=" +Integer.toString(result));

           }
       });
       btnMul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Integer s1 =Integer.parseInt(tv1.getText().toString());
               Integer s2 =Integer.parseInt(tv2.getText().toString());
               Integer result =s1*s2;
               anstv.setText(tv1.getText()+"*"+tv2.getText()+"=" +Integer.toString(result));
           }
       });
       btnDiv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Integer s1 =Integer.parseInt(tv1.getText().toString());
               Integer s2 =Integer.parseInt(tv2.getText().toString());
               Double result =s1/(s2*1.0);
               anstv.setText(tv1.getText()+"/"+tv2.getText()+"=" +Double.toString(result));
           }
       });

    }
}