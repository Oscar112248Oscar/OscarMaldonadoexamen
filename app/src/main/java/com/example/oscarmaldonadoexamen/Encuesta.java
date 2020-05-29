package com.example.oscarmaldonadoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {
EditText razon;
    private RadioButton r1,r2;
    private CheckBox ch1,ch2,ch3;
    private Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        razon=(EditText)findViewById(R.id.editText);
        ch1=(CheckBox) findViewById(R.id.checkBox);
        ch2=(CheckBox) findViewById(R.id.checkBox2);
        ch3=(CheckBox) findViewById(R.id.checkBox3);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r2=(RadioButton) findViewById(R.id.radioButton2);
        btnEnviar=(Button) findViewById(R.id.btnEnviarEncuesta);


        final Bundle extras=getIntent().getExtras();
        String nombre1="";
        String usuario1="";
        if(extras!=null){
            nombre1=extras.getString("nombre");
            usuario1=extras.getString("usuario");



        }


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Resumen.class);

                //intent.putExtra("nonbre", extras.getString("nombre"));



                startActivity(intent);

            }
        });

    }
}
