package com.example.joelc.proyectosaram;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Activity para realizar la actualización de los datos personales de un monitor
 * @author John Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class ActualizarMonitorActivity extends AppCompatActivity {
    /**
     * componente para agregar una imagen
     */
    private ImageView imgMostrarImagen;

    /**
     * componente para agregar una imagen
     */
    private Button btnActualizarImg;

    /**
     * componente para pasar a otra ventana para completar el formulario de un monitor
     */
    private Button btnSgte;

    /**
     * Método para configurar el activity y las acciones de los componentes creados
     *
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_monitor);

        /**
         * configuración del btnActualizarImg con el creado en el layout
         * y su evento respectivo
         */
        btnActualizarImg = (Button) findViewById(R.id.btn_update_image_a_m);
        btnActualizarImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarImagen();
                mostrarMensaje(getResources().getString(R.string.msj_img_actualizada));
            }
        });

        /**
         * configuración del btnSgte con el creado en el layout
         * y su evento respectivo
         */
        btnSgte = (Button) findViewById(R.id.btn_siguiente_a_m);
        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAActualizarHorarioMonitorActivity(v);
            }
        });

        /**
         * configuración del imgMostrarImagen con el creado en el layout
         */
        imgMostrarImagen = (ImageView) findViewById(R.id.img_update_SubirFoto_a_m);

    }

    /**
     * Método para mostrar la imagen
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path=data.getData();
            imgMostrarImagen.setImageURI(path);
        }
    }

    /**
     * Método para pasar al activity RegistrarHorarioMonitorActivity
     *
     * @param view
     */
    public void irAActualizarHorarioMonitorActivity(View view) {
        Intent intent = new Intent(ActualizarMonitorActivity.this, ActualizarHorarioActivity.class);
        startActivity(intent);
    }

    /**
     * Método para cargar la imagen
     */
    public void cargarImagen() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent, getResources().getString(R.string.msj_sel_aplicación)), 10);
    }

    /**
     * Método para mostrar un mensaje en un evento de un component
     *
     * @param message
     */
    private void mostrarMensaje(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
