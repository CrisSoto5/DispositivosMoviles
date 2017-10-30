package co.edu.uniquindio.android.electiva.simpson.vo;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Clase para definir los datos de un personaje
 *
 * @author Elkin Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class Personaje implements Parcelable {

    /**
     * Atributo para definir el id del personaje
     */
    private String id;
    /**
     * Atributo para definir el nombre del personaje
     */
    private String nombre;
    /**
     * Atributo para definir la fecha de creación del personaje
     */
    private Date fecha;
    /**
     * Atributo para definir una descripción del personaje
     */
    private String descripcion;
    /**
     * Atributo para definir la URL con información del personaje
     */
    private String urlVideo;
    /**
     * atributo para definir la ruta de la imagen
     */

    private int imagen;




    /**
     * Constructor de la clase Personaje
     *
     * @param nombre el nombre del personaje
     * @param fecha  la fecha de creación del personaje
     */
    public Personaje(String nombre, Date fecha,int imagen ,String descripcion,String urlVideo ) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.imagen=imagen;
        this.descripcion=descripcion;
        this.urlVideo=urlVideo;

    }




    protected Personaje(Parcel in) {
        id = in.readString();
        nombre = in.readString();
        descripcion = in.readString();
        urlVideo = in.readString();
        imagen= in.readInt();
    }

    public static final Creator<Personaje> CREATOR = new Creator<Personaje>() {
        @Override
        public Personaje createFromParcel(Parcel in) {
            return new Personaje(in);
        }

        @Override
        public Personaje[] newArray(int size) {
            return new Personaje[size];
        }
    };

    //Getter y Setter clase Personaje

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    //Métodos implementados de la interfaz parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(nombre);
        parcel.writeString(descripcion);
        parcel.writeString(urlVideo);
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
