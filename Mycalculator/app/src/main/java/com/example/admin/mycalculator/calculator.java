package com.example.admin.mycalculator;

import android.graphics.Path;
import android.icu.util.IslamicCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

import static com.example.admin.mycalculator.R.id.btn7;
import static com.example.admin.mycalculator.R.id.btn8;
import static com.example.admin.mycalculator.R.id.btndivide;
import static com.example.admin.mycalculator.R.id.btnequal;

public class calculator extends AppCompatActivity implements View.OnClickListener {

    @Override
    public  void onClick(View v){

        switch (v.getId()) {
            case R.id.btn7:
                numberistapped(7);
                break;
            case R.id.btn8:
                numberistapped(8);
                break;
            case R.id.btn9:
                numberistapped(9);
                break;
            case R.id.btnmultiply:
                operatoristapped(OPERATOR.multiply);
                calculationstring +=" * ";
                break;
            case R.id.btndivide:
                operatoristapped(OPERATOR.divide);
                calculationstring += " / ";
                break;
            case R.id.btn4:
                numberistapped(4);
                break;
            case R.id.btn5:
                numberistapped(5);
                break;
            case R.id.btn6:
                numberistapped(6);
                break;
            case R.id.btnminus:

                operatoristapped(OPERATOR.minus);
                calculationstring += " - ";
                break;
            case R.id.btn1:
                numberistapped(1);
                break;
            case R.id.btn2:numberistapped(2);
                break;

            case R.id.btnplus:

                operatoristapped(OPERATOR.plus);
                calculationstring +=" = ";
                break;
            case R.id.btnequal:
                operatoristapped(OPERATOR.equal);
                break;
            case R.id.btnzero:
                numberistapped(0);
                break;
            case R.id.btnclear: clear();
                break;



        }
        txtcalculation.setText(calculationstring);

    }

    private enum OPERATOR{
        plus,minus,multiply,divide,equal
    }
     private String currentNumbers;
    private  String stringNumbersatleft;
    private  String stringNumbersatright;
    private  OPERATOR currentoperator;
    private  int Result;

   private String calculationstring;


     TextView txtcalculation;
      TextView txtResults;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ImageButton btn7,btn1,btn2,btn3,btn4,btn5,btn6,btn8,btn9,btnmultiply,btnminus,btnplus,btnzero,btndivide,btnequal,btnclear;



        btn1 = (ImageButton)findViewById(R.id.btn1);
        btn2 = (ImageButton)findViewById(R.id.btn2);
        btn3 = (ImageButton)findViewById(R.id.btn3);
        btn4 = (ImageButton)findViewById(R.id.btn4);
        btn5 = (ImageButton)findViewById(R.id.btn5);
        btn6 = (ImageButton)findViewById(R.id.btn6);
        btn7 = (ImageButton)findViewById(R.id.btn7);
        btn8 = (ImageButton)findViewById(R.id.btn8);
        btn9 = (ImageButton)findViewById(R.id.btn9);
        btnplus = (ImageButton)findViewById(R.id.btnplus);
        btnminus = (ImageButton)findViewById(R.id.btnminus);
        btnmultiply = (ImageButton)findViewById(R.id.btnmultiply);
        btndivide = (ImageButton)findViewById(R.id.btndivide);
        btnzero = (ImageButton)findViewById(R.id.btnzero);
        btnequal = (ImageButton)findViewById(R.id.btnequal);
        btnclear = (ImageButton)findViewById(R.id.btnclear);
        currentNumbers="";
        calculationstring="";
        Result=0;
        txtcalculation=(TextView) findViewById(R.id.txtcalculation);
        txtResults=(TextView) findViewById(R.id.txtResults);


            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numberistapped(7);
                            Toast.makeText(calculator.this,"7",Toast.LENGTH_LONG).show();
                            }
            });

            btn8.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){
                    numberistapped(8);
                    Toast.makeText(calculator.this,"8",Toast.LENGTH_LONG).show();
            }

        });

            btn9.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){
                          numberistapped(9);
                          Toast.makeText(calculator.this,"9",Toast.LENGTH_LONG).show();
            }
        });

            btnmultiply.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){

                            operatoristapped(OPERATOR.multiply);
                            calculationstring += " * " ;
                            txtcalculation.setText(calculationstring);

                Toast.makeText(calculator.this,"*",Toast.LENGTH_LONG).show();

            }
        });

            btndivide.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {

                operatoristapped(OPERATOR.divide);
                calculationstring += " / " ;
            txtcalculation.setText(calculationstring);


            Toast.makeText(calculator.this, "/", Toast.LENGTH_LONG).show();
        }
        });

            btn4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V){
            numberistapped(4);
            Toast.makeText(calculator.this,"4",Toast.LENGTH_LONG).show();

        }
    });

            btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V){
                numberistapped(5);
                Toast.makeText(calculator.this, "5", Toast.LENGTH_LONG).show();

            }
        });

            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    numberistapped(6);
                    Toast.makeText(calculator.this, "6", Toast.LENGTH_LONG).show();

                }
            });

            btnminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    operatoristapped(OPERATOR.minus);
                    calculationstring +=" - ";
                    txtcalculation.setText(calculationstring);
                    Toast.makeText(calculator.this, "-", Toast.LENGTH_LONG).show();

                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    numberistapped(3);
                    Toast.makeText(calculator.this, "3", Toast.LENGTH_LONG).show();

                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    numberistapped(2);
                    Toast.makeText(calculator.this, "2", Toast.LENGTH_LONG).show();

                }
            });

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    numberistapped(1);
                    Toast.makeText(calculator.this, "1", Toast.LENGTH_LONG).show();

                }
            });

            btnplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    operatoristapped(OPERATOR.plus);
                    calculationstring +=" + ";
                    txtcalculation.setText(calculationstring);
                    Toast.makeText(calculator.this, "+", Toast.LENGTH_LONG).show();

                }
            });

            btnequal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    operatoristapped(OPERATOR.equal);
                    Toast.makeText(calculator.this, "=", Toast.LENGTH_LONG).show();

                }
            });

            btnzero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    numberistapped(0);
                    Toast.makeText(calculator.this, "0", Toast.LENGTH_LONG).show();

                }
            });

            btnclear.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V){
            clear();
            Toast.makeText(calculator.this,"clear",Toast.LENGTH_LONG).show();

        }

    });


        }

        private void numberistapped(int tappednumber){
            currentNumbers=currentNumbers + String.valueOf(tappednumber);
            txtResults.setText(currentNumbers);
            calculationstring=currentNumbers;
            txtcalculation.setText(calculationstring);
        }
        private  void operatoristapped(OPERATOR tappedoperator){
            if(currentoperator != null ) {
                if (currentNumbers != "") {
                    stringNumbersatright = currentNumbers;
                    currentNumbers = "";
                    switch (currentoperator) {
                        case plus:
                            Result = Integer.parseInt(stringNumbersatleft) + Integer.parseInt(stringNumbersatright);
                            break;
                        case multiply:
                            Result = Integer.parseInt(stringNumbersatleft) * Integer.parseInt(stringNumbersatright);
                            break;
                        case minus:
                            Result = Integer.parseInt(stringNumbersatleft) - Integer.parseInt(stringNumbersatright);
                            break;
                        case divide:
                            Result = Integer.parseInt(stringNumbersatleft) / Integer.parseInt(stringNumbersatright);
                            break;


                    }
                    stringNumbersatleft = String.valueOf(Result);
                    txtResults.setText(stringNumbersatleft);
                    calculationstring = stringNumbersatleft;

                }
            }
            else{
                stringNumbersatleft=currentNumbers;

                currentNumbers="";
            }
            currentoperator=tappedoperator;
        }
        private void clear(){
        currentNumbers="";
        stringNumbersatleft="";
        stringNumbersatright="";
        currentoperator=null;
        Result=0;
        txtResults.setText("0");
        calculationstring="";
        txtcalculation.setText("0");
        }

}
