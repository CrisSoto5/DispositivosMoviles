package co.edu.uniquindio.android.electiva.simpson.util;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.simpson.R;
import co.edu.uniquindio.android.electiva.simpson.vo.Personaje;

/**
 * Clase para definir el adaptador de un personaje
 *
 * @author Elkin Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class AdaptadorDePersonaje extends RecyclerView.Adapter<AdaptadorDePersonaje.PersonajeViewHolder> {

    /**
     * Lista para guardar personajes
     */
    private ArrayList<Personaje> personajes;
    /**
     * Evento de click de AdaptadorDePersonaje
     */
    private static OnClickAdaptadorDePersonaje listener;

    /**
     * Constructor de la clase AdaptadorDePersonaje
     *
     * @param personajes lista de personajes
     * @param fragment   fragmento para guardar el evento onClick
     */
    public AdaptadorDePersonaje(ArrayList<Personaje> personajes, Fragment fragment) {
        this.personajes = personajes;
        try {
            listener = (OnClickAdaptadorDePersonaje) fragment;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para crear el controlador de selección
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public PersonajeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.resumen_personaje, parent, false);
        PersonajeViewHolder personajeVH = new PersonajeViewHolder(itemView);
        return personajeVH;


    }

    //Métodos heredados de RecyclerView

    /**
     * Interface para dar clic a un adaptador de personaje
     */
    public interface OnClickAdaptadorDePersonaje {
        void onClickPosition(int pos);
    }

    @Override
    /** metodo que permite congelar la vista de la lista donde estabamos
     * anteriormente para no volver al inicio de la lista en el retorno
     *
     */
    public void onBindViewHolder(PersonajeViewHolder holder, int position) {
        Personaje personaje = personajes.get(position);
        holder.binPersonaje(personaje);
    }

    /**
     * Metodo para retornar la cantidad de personajes creados
     * @return cantidad de personajes creados
     */
    @Override
    public int getItemCount() {
        return personajes.size();
    }

    /**
     * Clase estatica para almacenar todos los controles que son cargados por el método
     * <<findViewByID>> de cada uno de los ítems del control de selección
     */
    public static class PersonajeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /**
         * Campo de texto para mostrar el nombre de un personaje
         */
        private TextView txtNombrePersonaje;
        /**
         * Campo de texto para mostrar la fecha de creación de un personaje
         */
        private TextView txtFechaNacimiento;
        private ImageView imagen;

        private Menu menu;

        /**
         * Constructor de la clase estatica
         *
         * @param itemView
         */
        public PersonajeViewHolder(View itemView) {
            super(itemView);
            txtNombrePersonaje = (TextView) itemView.findViewById(R.id.nombre);
            txtFechaNacimiento = (TextView) itemView.findViewById(R.id.fecha_nacimiento);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            itemView.setOnClickListener(this);
        }

        /**
         * Método para definir los campos de texto creados
         *
         * @param personaje Objeto de la clase personaje
         */
        public void binPersonaje(Personaje personaje) {
            txtNombrePersonaje.setText(personaje.getNombre());
            txtFechaNacimiento.setText(personaje.getFecha().toString());

            imagen.setImageResource(personaje.getImagen());
        }

        /**
         * Método de evento de click
         * @param view
         */
        @Override
        public void onClick(View view) {

            listener.onClickPosition(getAdapterPosition());

            Log.d("TAG", "Element " + getAdapterPosition() + " clicked. " + txtNombrePersonaje.getText());
        }


    }
}