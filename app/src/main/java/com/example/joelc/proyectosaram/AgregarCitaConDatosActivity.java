package com.example.joelc.proyectosaram;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity para agregar más horarios de asesoria a un monitor
 *
 * @author John Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class AgregarCitaConDatosActivity extends AppCompatActivity {

    /**
     * componente para agregar un horario de atención
     */
    private FloatingActionButton btnAgregarMas;

    /**
     * componente para finalizar el formulario de inscripción de un monitor
     */
    private Button btnFinRegistro;

    /**
     * Método para configurar el activity y las acciones de los componentes creados
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_cita_con_datos);

        /**
         * configuración del btnAgregarMas con el creado en el layout
         * y su evento respectivo
         */
        btnAgregarMas = (FloatingActionButton) findViewById(R.id.floatingActionButtonAgregar_a_c_d);
        btnAgregarMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irARegistrarHorarioMonitorActivity(v);
            }
        });

        /**
         * configuración del btnFinRegistro con el creado en el layout
         * y su evento respectivo
         */
        btnFinRegistro = (Button) findViewById(R.id.btn_finalizar_a_c_d);
        btnFinRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje("Pendiente por hacer ventana ppal monitor");
            }
        });
    }

    /**
     * Método para pasar al activity RegistrarHorarioMonitorActivity
     *
     * @param view
     */
    public void irARegistrarHorarioMonitorActivity(View view) {
        Intent intent = new Intent(AgregarCitaConDatosActivity.this, RegistrarHorarioMonitorActivity.class);
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
