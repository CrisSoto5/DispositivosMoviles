package co.edu.uniquindio.android.electiva.simpson.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;

import co.edu.uniquindio.android.electiva.simpson.R;
import co.edu.uniquindio.android.electiva.simpson.util.AdaptadorDePersonaje;
import co.edu.uniquindio.android.electiva.simpson.vo.Personaje;

/**
 * Maneja la información del fragmento para listar clientes
 */
public class ListaDePersonajesFragment extends Fragment implements AdaptadorDePersonaje.OnClickAdaptadorDePersonaje {

    /**
     * Recycler view para guardar los personajes creados
     */
    private RecyclerView listadoDePersonajes;
    /**
     * Lista para guardar los personajes creados
     */
    private ArrayList<Personaje> personajes;
    /**
     * Objeto para implementar el evento del recycler
     */
    private AdaptadorDePersonaje adaptador;
    /**
     * Interface para seleccionar un personaje
     */
    private OnPersonajeSeleccionadoListener listener;

    /**
     * Constructor del fragment
     */
    public ListaDePersonajesFragment() {
        // Required empty public constructor
    }

    /**
     * Evento de clic para seleccionar personaje
     *
     * @param pos
     */
    @Override
    public void onClickPosition(int pos) {
        listener.onPersonajeSeleccionado(pos);

    }

    /**
     * Crea la conexion entre el fragmento y su parte grafica
     */
    public interface OnPersonajeSeleccionadoListener {
        void onPersonajeSeleccionado(int position);
    }

    /**
     * Asignar un fragmento a un activity
     *
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
            try {
                listener = (OnPersonajeSeleccionadoListener) activity;
            } catch (ClassCastException e) {
                throw new ClassCastException(activity.toString() + " debe implementar la interfaz OnPersonajeSeleccionadoListener");
            }
        }
    }

    /**
     * Crear el fragmento
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    /**
     * Crea la conexion entre el fragmento y su parte grafica
     *
     * @param inflater           Elemento para adptar el fragmento a su contenedor
     * @param container          contenedor
     * @param savedInstanceState elemento para salvar informacion
     * @return vista del fragmento
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_de_personajes, container, false);
    }

    /**
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adaptador = new AdaptadorDePersonaje(personajes, this);
        listadoDePersonajes = (RecyclerView) getView().findViewById(R.id.listaPersonajes);
        listadoDePersonajes.setAdapter(adaptador);
        listadoDePersonajes.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        //listadoDePersonajes.setLayoutManager(new GridLayoutManager(this,2)); //parte en 2 la app


    }

    /**
     * Crear el menu de opciones
     *
     * @param menu
     * @param inflater
     */
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    /**
     * Evento para definir una acción de menu
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_agregar) {
            personajes.add(1, new Personaje("Milhouse", new Date(),R.drawable.icono9,"descripcion","url"));
            adaptador.notifyItemInserted(1);
        } else if (id == R.id.menu_eliminar) {
            personajes.remove(1);
            adaptador.notifyItemRemoved(1);
        } else if (id == R.id.menu_modificar) {
            Personaje aux = personajes.get(1);
            personajes.set(1, personajes.get(2));
            personajes.set(2, aux);
            adaptador.notifyItemMoved(1, 2);
        }
        return super.onOptionsItemSelected(item);
    }

    //Getter y Setter
    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }
}