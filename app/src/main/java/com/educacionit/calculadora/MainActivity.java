package com.educacionit.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtNumero;
    private Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
    }

    private void setupUI() {
        txtNumero = findViewById(R.id.txtNumero);
        btnSumar = findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numeroActual = Integer.parseInt(txtNumero.getText().toString());
                int numeroNuevo = numeroActual + 1;
                txtNumero.setText(String.valueOf(numeroNuevo));
            }
        });
    }
}