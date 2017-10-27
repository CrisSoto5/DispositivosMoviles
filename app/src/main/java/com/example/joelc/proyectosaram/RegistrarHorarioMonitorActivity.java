package com.example.joelc.proyectosaram;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity para realizar el registro de los datos personales de un monitor
 *
 * @author John Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class RegistrarHorarioMonitorActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * componente para agregar un horario de atención
     */
    private FloatingActionButton btnAgregar;

    /**
     * componente para finalizar el formulario de inscripción de un monitor
     */
    private Button btnFin;

    /**
     * Método para configurar el activity y las acciones de los componentes creados
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_horario_monitor);

        /**
         * configuración del btnAgregar con el creado en el layout
         * y su evento respectivo
         */
        btnAgregar = (FloatingActionButton) findViewById(R.id.floatingActionButtonAgregar_r_h_m);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irARegistrarHorarioActivity(v);
            }
        });

        /**
         * configuración del btnFin con el creado en el layout
         * y su evento respectivo
         */
        btnFin = (Button) findViewById(R.id.btn_finalizar_cita_r_h_m);
        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje("Pendiente por hacer ventana ppal monitor");
            }
        });
    }

    /**
     * Método para pasar al activity RegistrarHorarioActivity
     *
     * @param view
     */
    public void irARegistrarHorarioActivity(View view) {
        Intent intent = new Intent(RegistrarHorarioMonitorActivity.this, RegistrarHorarioActivity.class);
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

    /**
     * Evento onClick global para los componentes creados
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

        //finish();
    }
}
