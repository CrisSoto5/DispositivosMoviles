package com.example.joelc.proyectosaram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Activity para realizar el registro de los datos personales de un monitor
 *
 * @author John Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class RegistrarMonitorActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnActualizarImg;
    private Button btnSgte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_monitor);

        btnActualizarImg = (Button) findViewById(R.id.btn_update_image);
        btnActualizarImg.setOnClickListener(this);
        btnSgte = (Button) findViewById(R.id.btn_siguiente);
        btnSgte.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (btnActualizarImg.getId() == v.getId()) {
            //Ejecutar tarea 1
        } else if (btnSgte.getId() == v.getId()) {
            //ir a ventana RegistrarHorarioMonitorActivity
            irARegistrarHorarioMonitorActivity(v);

        }
    }

    public void irARegistrarHorarioMonitorActivity(View view) {
        Log.v("MainActivity", "presioné el botón");
        Intent intent = new Intent(this, RegistrarHorarioMonitorActivity.class);
        startActivity(intent);
    }
}
