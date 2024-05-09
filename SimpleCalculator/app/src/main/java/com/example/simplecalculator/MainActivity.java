package com.example.simplecalculator;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

import javax.xml.transform.Result;
//import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            number1text = findViewById(R.id.number1text);
            number2text = findViewById(R.id.number2text);
            resultText = findViewById(R.id.resultText);



            return insets;
        });
    }


    public void sum (View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Write Number!!");
        }
        else
        {
            //String myString=number1text.getText().toString();
            //int number1 = Integer.parseInt(myString);
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result : " + result);
        }

    }


    public void deduct (View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Write Number!!");
        }
        else
        {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result : " + result);
        }
    }


    public void multiply (View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Write Number!!");
        }
        else
        {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result : " + result);
        }

    }

    public void devide (View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Write Number!!");
        }
        else
        {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result : " + result);
        }
    }

    public  void Karekok (View view){

        String myString = number1text.getText().toString();
        String  myString2 = number2text.getText().toString();


        if (!myString.isEmpty() && myString2.matches("")){
            double number1 = Double.parseDouble(myString);
            double result = Math.sqrt(number1);
            resultText.setText("Result : " +result );
        }
        else if (myString.isEmpty() && !myString2.isEmpty())
        {
            double number2 = Double.parseDouble(myString2);
            double result = Math.sqrt(number2);
            resultText.setText("Result : " +result );
        }
        else if (!myString.isEmpty() && !myString2.isEmpty())
        {
            resultText.setText("Lutfen tek bir deger giriniz");
        }

        else if (myString.isEmpty() && myString2.isEmpty())
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }
    }

    public void us_alma (View view){
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resultText.setText("Write Number!!");
        }
        else
        {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            double result = Math.pow(number1, number2);
            resultText.setText("Result : " + result);
        }
    }

    public  void  yuzde_alma (View view){
        String myString = number1text.getText().toString();
        String  myString2 = number2text.getText().toString();


        if (!myString.isEmpty() && myString2.matches("")){
            double number1 = Double.parseDouble(myString);
            double result = number1 / 100;
            resultText.setText("Result : " +result );
        }
        else if (myString.isEmpty() && !myString2.isEmpty())
        {
            double number2 = Double.parseDouble(myString2);
            double result = number2 / 100;
            resultText.setText("Result : " +result );
        }
        else if (!myString.isEmpty() && !myString2.isEmpty())
        {
            resultText.setText("Lutfen tek bir deger giriniz");
        }

        else if (myString.isEmpty() && myString2.isEmpty())
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }


    }

    public  void mod_alma (View view){
        if (number1text.getText().toString().isEmpty() || number2text.getText().toString().isEmpty()){
            resultText.setText("Lutfen gecerli bir deger giriniz.");
            //System.out.println("Lutfen gecerli bir deger giriniz");
        }
        else
        {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());
            int result = number1 % number2;

            resultText.setText("Result: " + result);
        }

    }


}