package com.app2calc_carlosag;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class resultado extends AppCompatActivity {

    Button btnVolverMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        // Recuperar los resultados del Intent
        double seno = getIntent().getDoubleExtra("seno", 0.0);
        double coseno = getIntent().getDoubleExtra("coseno", 0.0);
        double area = getIntent().getDoubleExtra("area", 0.0);
        double perimetro = getIntent().getDoubleExtra("perimetro", 0.0);

        // Mostrar los resultados en TextViews
        TextView senoTextView = findViewById(R.id.senoTextView);
        senoTextView.setText("Seno: " + seno);

        TextView cosenoTextView = findViewById(R.id.cosenoTextView);
        cosenoTextView.setText("Coseno: " + coseno);

        TextView areaTextView = findViewById(R.id.areaTextView);
        areaTextView.setText("Área: " + area);

        TextView perimetroTextView = findViewById(R.id.perimetroTextView);
        perimetroTextView.setText("Perímetro: " + perimetro);

    }
}