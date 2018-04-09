package com.example.talatec.practica01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varPalabra;
    TextView varLetrero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varPalabra = (EditText) findViewById(R.id.txtpalabra);
        varLetrero = (TextView) findViewById(R.id.txtLetrero);
    }

    public void cambiar(){
        String Palabra = varPalabra.getText().toString();
        StringBuilder aux = new StringBuilder();
        aux.append(Palabra);
        String nueva =aux.reverse().toString();
        varLetrero.setText(nueva);

    }
}
