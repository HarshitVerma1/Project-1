package com.harshit.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,pound,dollar,yen,dinar,bitcoin,rubel,ausdollar,candollar;
    EditText edittext;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        dollar=findViewById(R.id.dollar);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausdollar=findViewById(R.id.ausdollar);
        candollar=findViewById(R.id.candollar);
        edittext=findViewById(R.id.editText);
        textview=findViewById(R.id.textView);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.012;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+" €");
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.014;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+" $");
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.011;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+" £");
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*1.49;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+" ¥");
                }
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0042;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+"ع.د  ");
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0000015;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+"  ₿");
                }
            }
        });
         rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.93;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+"  ₽");
                }
            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.21;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+"  Aus$");
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=edittext.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    edittext.setError("Empty User Input !!! \n Please enter value in Rupees");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(z);
                    textview.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.019;
                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textview.setText(""+numberFormat.format(k));
                    textview.setText(""+k+"  Can$");
                }
            }
        });
    }
}
