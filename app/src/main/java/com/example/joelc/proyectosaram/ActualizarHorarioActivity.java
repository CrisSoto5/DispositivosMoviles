package com.example.joelc.proyectosaram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity para realizar la actualización del horario de asesoria de un monitor
 * @author John Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class ActualizarHorarioActivity extends AppCompatActivity {
    /**
     * componente para guardar un horario de asesoria de un monitor
     */
    private Button btnGuardar;

    /**
     * Método para configurar el activity y las acciones de los componentes creados
     *
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_horario);

        /**
         * configuración del btnGuardar con el creado en el layout
         * y su evento respectivo
         */
        btnGuardar = (Button) findViewById(R.id.btn_guardar_a_h);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje(getResources().getString(R.string.msj_Horario_monitor_creado));
                irAAgregarCitaConDatosActivity(v);
            }
        });

    }

    /**
     * Método para pasar al activity AgregarCitaConDatosActivity
     *
     * @param view
     */
    public void irAAgregarCitaConDatosActivity(View view) {
        Intent intent = new Intent(ActualizarHorarioActivity.this, ActualizarCitaConDatosActivity.class);
        startActivity(intent);
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
