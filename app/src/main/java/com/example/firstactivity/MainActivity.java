package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonLister();
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

    }
    public void OnClickButtonLister(){
        button = (Button)findViewById(R.id.button);
        final EditText num1 = (EditText)findViewById(R.id.editTextTextPersonName);
        final EditText num2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence message = "You just clicked the OK button";

                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, message, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.show();

                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        final String no1 = num1.getText().toString();
                        final String no2 = num2.getText().toString();
                       // final Integer no1 = Integer.parseInt(num1.getText().toString());
                        // final Integer no2 = Integer.parseInt(num2.getText().toString());
                        intent.putExtra("num1",no1);
                        intent.putExtra("num2",no2);
                        startActivity(intent);
                    }
                }
        );
    }
}