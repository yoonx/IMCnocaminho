package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pesofinal,alturafinal;
    TextView ResultadoIMC;
    ImageView ResultadoImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcIMC (View v){
        ResultadoIMC = findViewById(R.id.resultado);
        ResultadoImg = findViewById(R.id.imageView);
        pesofinal = findViewById(R.id.valorPeso);
        alturafinal = findViewById(R.id.valorAltura);

        String peso = pesofinal.getText().toString();
        float Pfim = Float.parseFloat(peso);

        String altura = alturafinal.getText().toString();
        float Afim = Float.parseFloat(altura);
    }
}
