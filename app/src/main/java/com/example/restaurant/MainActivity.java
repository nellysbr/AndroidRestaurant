package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextTotal, resultTextPessoa;
    private EditText inputConsumo, inputCouvert, inputDivided, inputTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextTotal = findViewById(R.id.resultTextTotal);
        resultTextPessoa = findViewById(R.id.resultTextPessoa);
        inputConsumo = findViewById(R.id.inputConsumo);
        inputCouvert = findViewById(R.id.inputCouvert);
        inputDivided = findViewById(R.id.inputDivided);
        inputTax = findViewById(R.id.inputDivided);
    }

    public void handleTotal(View view){

        DecimalFormat form = new DecimalFormat("R$: 0.00");

        double valorConsumo = Double.parseDouble(inputConsumo.getText().toString());
        double valorCouvert = Double.parseDouble(inputCouvert.getText().toString());
        int qntPessoas = Integer.parseInt(inputDivided.getText().toString());
        double valorTaxa = Double.parseDouble(inputTax.getText().toString());

        double totalConta = valorConsumo + valorCouvert + valorTaxa;
        double totalContaPessoa = totalConta / qntPessoas;

        resultTextTotal.setText(form.format(totalConta));
        resultTextPessoa.setText(form.format(totalContaPessoa));


    }
}