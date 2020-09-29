package com.example.projetoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 18.5){
            lblResultado.setText("Magreza");
        }
        else if(resultado <= 25.0){
            lblResultado.setText("Peso Normal!!");
        }
        else if(resultado <= 30.0){
            lblResultado.setText("Sobrepeso");
        }
        else if(resultado <= 35.0){
            lblResultado.setText("Obesidade grau I");
        }
        else if(resultado <= 40.0){
            lblResultado.setText("Obesidade grau II");
        } else {
            lblResultado.setText("Obesidade grau III");
        }

    }
}