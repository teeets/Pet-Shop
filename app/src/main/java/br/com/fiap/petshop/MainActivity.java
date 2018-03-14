package br.com.fiap.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgCachorro;
    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacinado;
    TextView txtCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rdgCachorro = findViewById(R.id.rdgCachorros);


    }
}
