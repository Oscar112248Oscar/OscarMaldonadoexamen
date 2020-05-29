package com.example.oscarmaldonadoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
  EditText nombre,inicial,pago;
  TextView usuario;
  Button btnCalcula, btnGuarda;
  double monto=1800;
  double calculo;
  double operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre=(EditText) findViewById(R.id.campoNombre);
        inicial=(EditText) findViewById(R.id.editText2);
        pago=(EditText) findViewById(R.id.editText3);
        btnCalcula=(Button) findViewById(R.id.btncalcular);
        btnGuarda=(Button) findViewById(R.id.btnGuardar);
        usuario=(TextView) findViewById(R.id.idusuario);


        Bundle extras=getIntent().getExtras();
        String nombre1="";
        if(extras!=null){
            nombre1=extras.getString("nombre");



        }

        usuario.setText(nombre1.toString());


        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo=(monto-Double.parseDouble(inicial.getText().toString()))/3;
                operacion=calculo+(0.05*monto);
                pago.setText(operacion+"");


            }
        });


        final String finalNombre = nombre1;
        btnGuarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Encuesta.class);
             //   intent.putExtra("nombre", finalNombre.toString());
                intent.putExtra("nombre",nombre.getText().toString());
                getApplicationContext().startActivity(intent);

                Toast.makeText(getApplicationContext(),"Elmento guardado con exito", Toast.LENGTH_LONG).show();
            }
        });





    }
}
