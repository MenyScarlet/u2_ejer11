package com.example.didact.u2_ejer11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEtiquetaSuperior, tvEtiquetaInferior;
    ImageView ivImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEtiquetaSuperior = (TextView)findViewById(R.id.tvSuperior);
        tvEtiquetaInferior = (TextView)findViewById(R.id.tvInferior);
        ivImagen = (ImageView)findViewById(R.id.imgView1);

        //Evento click para la imagen
        ivImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEtiquetaInferior.setText("Has pulsado el boton");
            }
        });

        //Editar en un TextView
        tvEtiquetaSuperior.setText("Hola Mundo");

        //Obtener el texto
        String textoRecogido = tvEtiquetaSuperior.getText().toString();

        tvEtiquetaInferior.setText(textoRecogido);



    }//FIN On Create

    public void escribirTextView (View view) {
        tvEtiquetaInferior.setText("Has pulsado el boton");
    }

}// FIN Main Activity
