package com.example.oscarmaldonadoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        t1=(TextView)findViewById(R.id.textView12);
        t2=(TextView)findViewById(R.id.textView13);
        t3=(TextView)findViewById(R.id.textView14);



        String r1="",r2="",r3="",r4="",r5="";

        Bundle extras=getIntent().getExtras();

        if(extras!=null){
            r1=extras.getString("nombre");
         //   r2=extras.getString("usuario");
            //r3=extras.getString("respuesta3");


        }

        t1.setText("estudiante2020");
       // t2.setText(r2.toString());
       // t3.setText(r3.toString());


    }
}
