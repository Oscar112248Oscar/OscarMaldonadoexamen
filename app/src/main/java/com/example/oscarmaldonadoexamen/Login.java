package com.example.oscarmaldonadoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usuario;
    EditText contrasena;
    String nombre="estudiante2020";
    String pass="uisrael2020";
    Button ingresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
                usuario= (EditText) findViewById(R.id.usuario);
        contrasena=(EditText) findViewById(R.id.contrasena);
        ingresa=(Button) findViewById(R.id.btnIngresa);

        ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuario.getText().toString().equals(nombre) && contrasena.getText().toString().equals(pass)){
                    Intent intent = new Intent(getApplicationContext(),Registro.class);
                    intent.putExtra("nombre",usuario.getText().toString());

                    getApplicationContext().startActivity(intent);

                    Toast.makeText(getApplicationContext(),"Acceso Exitoso", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Acceso Denegado", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
