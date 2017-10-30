package co.edu.uniquindio.android.electiva.simpson.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Date;

import co.edu.uniquindio.android.electiva.simpson.R;
import co.edu.uniquindio.android.electiva.simpson.fragments.DetalleDePersonajeFragment;
import co.edu.uniquindio.android.electiva.simpson.fragments.ListaDePersonajesFragment;
import co.edu.uniquindio.android.electiva.simpson.vo.Personaje;

/**
 * Activity para establecer el RecyclerView e implementar el fragmento
 *
 * @author Elkin Calderón
 * @author Raul Londoño
 * @author Cristian Soto
 */
public class SimpsonActivity extends AppCompatActivity implements ListaDePersonajesFragment.OnPersonajeSeleccionadoListener {

    /**
     * Lista para almacenar personajes de la clase Personaje
     */
    private ArrayList<Personaje> personajes;
    /**
     * Metodo para crear los personajes en el activity
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpson);

        personajes = new ArrayList();

        personajes.add(new Personaje("Camila Echeverry", new Date(), R.drawable.icono2, "Homer Jay Simpson (Homero Jay\n" +
                "Simpson en Hispanoamérica), más conocido como Homer Simpson (Homero Simpson\n" +
                "en Hispanoamérica), es un personaje ficticio protagonista de la serie de\n" +
                "televisión de dibujos animados Los Simpson. Es el padre de la familia\n" +
                "protagonista y uno de los personajes centrales y más importantes de la serie.\n" +
                "Fue creado por el dibujante Matt Groening e hizo su debut en televisión el 19\n" +
                "de abril de 1987, en el corto Good Night del programa El show de Tracey\n" +
                "Ullman. El segundo nombre de Homer Simpson es un juego de palabras; durante\n" +
                "muchas temporadas no se supo qué había detrás de la J hasta que en el\n" +
                "capítulo «Doh-in In the Wind» Homer descubre que su segundo nombre es Jay\n" +
                "(nombre en inglés de la letra j); de este modo, cuando Homer pronuncia en\n" +
                "inglés su propio nombre, no se distingue si da la letra inicial del segundo\n" +
                "nombre o este al completo", "https://www.youtube.com/watch?v=sSw4ctf4d6k"));
        personajes.add(new Personaje("Carlos Fernandez", new Date(), R.drawable.icono5, "es un personaje de la serie de televisión" +
                " de dibujos animados Los Simpson. Es la hija mediana" +
                " de Homer y Marge Simpson, y hermana de Bart y Maggie." +
                " Goza de notable protagonismo y complejidad en la serie.\n" +
                "\n" +
                "Lisa fue concebida por el caricaturista Matt " +
                "Groening y debutó en la televisión el 19 de abril de 1987, " +
                "en el cortometraje de dibujos animados titulado Good Night del " +
                "programa de variedades El show de Tracey Ullman", "https://www.youtube.com/watch?v=hP3fmnMuZZU"));
        personajes.add(new Personaje("Michel rodriguez", new Date(), R.drawable.icono6, " (Bartolomeo J. Simpson en Hispanoamérica), es uno de los personajes ficticios protagonistas de la serie de televisión de dibujos animados Los Simpson. Bart tiene 10 años y es el primogénito, y único hijo varón de Homer y Marge Simpson. Es el hermano mayor de Lisa y Maggie.1\u200B\n" +
                "\n" +
                "Este personaje fue creado improvisadamente por Matt Groening y debutó en el corto Good Night de El show de Tracey Ullman el 19 de abril de 1987, originalmente, con la voz de Nancy Cartwright. En América Latina, Bart ha sido siempre doblado por Marina Huerta, salvo por un lapsus entre la décima y decimoquinta temporada, que fue interpretado por Claudia Mota; mientras que en España, Sara Vivas le ha puesto regularmente su voz.3\u200B\n" +
                "\n" +
                "Bart es uno de los personajes principales de la serie" +
                " y ha resultado ser uno de los más conocidos en la historia de " +
                "la animación en la televisión estadounidense.4\u200B La revista " +
                "Time consideró a Bart como el cuadragésimo sexto personaje (de cien) " +
                "más influyente del siglo XX; la revista norteamericano " +
                "TV Guide le otorgó el undécimo lugar (junto a Lisa) en la " +
                "lista de los «50 mejores personajes de dibujos animados de todos " +
                "los tiempos» y el Entertainment Weekly nombró a Bart el «artista del año» en 1990." +
                " Cartwright ha recibido varios premios por dar su voz a Bart, incluyendo el premio Emmy" +
                " por la voz de doblaje más destacada en horario de máxima audiencia en 1992 y el premio Annie" +
                " por su «interpretación en el campo de la animación» en 1995","https://www.youtube.com/watch?v=cJ0GoTHS79A"));
        personajes.add(new Personaje("Andres Sepulveda", new Date(), R.drawable.icono7, "Marjorie \"Marge\" Bouvier Simpson es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de esta unión amorosa: Bart, Lisa y Maggie. Ella, junto al resto de su familia, conforman el elenco de personajes protagonistas de Los Simpson, su presencia ha demostrado ser fundamental para mantener la familia unida.\n" +
                "\n" +
                "Marge fue creada por el dibujante Matt Groening en el vestíbulo de la oficina de James" +
                " L. Brooks, para debutar en la televisión el 19 de abril de 1987, en el corto Good " +
                "Night emitido en El show de Tracey Ullman","https://www.youtube.com/watch?v=8TJ5Rt2Kh7c"));
        personajes.add(new Personaje("Cristian Soto", new Date(), R.drawable.icono9, "Margaret Evelyn \"Maggie\" Simpson es un personaje " +
                "ficticio de la serie de televisión de dibujos animados Los Simpson." +
                " Es la tercera hija del matrimonio protagonista, Homer y Marge Simpson," +
                " y la más joven de ellos. Sus hermanos mayores son Bart y Lisa Simpson." +
                " Siempre se la ve succionando un chupete y cuando camina, suele tropezar" +
                " con el mono y cae de frente.\n" +
                "\n" +
                "Maggie fue creada por el dibujante Matt Groening en el vestíbulo de la oficina " +
                "de James L. Brooks, para debutar en televisión el 19 de agosto de 1985, " +
                "en el corto Good Night para el programa El show de Tracey Ullman","https://www.youtube.com/watch?v=PTIU7arGhR8"));
        personajes.add(new Personaje("Elkin Calderon", new Date(), R.drawable.icono7, "En Treehouse of Horror VII, Bart y Lisa empiezan a oir ruidos extraños en el ático de su casa, y al preguntarles a sus padres Homer y Marge estos muestran una actitud muy sospechosa;.en la cena del sábado todo va bien hasta que corre algo por la ventilación y Marge se acuerda y le dice a Homer que ya es hora, y Homer se va al ático con una cubeta llena de cabezas de pescado, y Bart y Lisa deciden, con la ayuda de Maggie, subir de una vez por todas. Una vez arriba ven unas cadenas rotas en la pared, un plato vació y alguien corriendo por detrás, al ver esto ultimo huyen a sus padres, que acababan de volver a casa, y deciden que es hora de la verdad.\n" +
                "\n" +
                "La historia cuenta que hace diez años Marge dio a luz a gemelos siameses, al mostrarlos a Marge" +
                ", el gemelo de la izquierda se enfurece y empieza a morder al de la derecha, " +
                "y que luego de varios estudios confirmaron una vieja leyenda urbana: que el gemelo " +
                "de la izquierda es malo, por lo que los separaron e hicieron lo mas humano posible: " +
                "encerrar en su ático al gemelo malvado y darle cabezas de pescado los sábados, y quedarse " +
                "con el bueno. Dicho esto, todos excepto Bart salieron a buscar a Hugo," +
                " pero resulta que Hugo nunca salió, y lo encuentra " +
                "comiendo cabezas de pescado y con un vaso de leche","https://www.youtube.com/watch?v=zoO0s1ukcqQ"));
        personajes.add(new Personaje("carolina Londoño", new Date(), R.drawable.icono2, "Es el mejor amigo de Bart Simpson, " +
                "cursan juntos cuarto grado en la Escuela Primaria de Springfield como alumno de " +
                "la clase de la profesora Edna Krabappel. Tiene aspecto " +
                "y comportamientos de nerd, pero dista mucho de serlo. De hecho, en una ocasión " +
                "señaló que no era un nerd \"porque los nerds son listos","https://www.youtube.com/watch?v=Zfu7fWlyZBg"));
        personajes.add(new Personaje("Moloto Arias", new Date(), R.drawable.icono1, "es un personaje secundario y principal." +
                " Es el dueño de una tienda en Springfield. El Kwik-E-Mart " +
                "(Traducido como El badulaque en la version española y en la versión " +
                "hispanoamericana es llamado Kwik-E-Mart, o a veces minisúper o la tienda de Apu)" +
                ", a la cual recurren diariamente los Simpson para comprar sus víveres. Es un inmigrante" +
                " indio e hindú y, como todos los personajes de Los Simpson, representa " +
                "un estereotipo: el dueño de origen hindú de una tienda o el inmigrante " +
                "en busca del sueño americano. En un capítulo, Apu se escapa de América, " +
                "pero en la continuidad de episodios siguió apareciendo " +
                "en su tienda de Springfield.","https://www.youtube.com/watch?v=yE-7DQTMtdM"));
        personajes.add(new Personaje("Hugo Ned", new Date(), R.drawable.icono9, "Ned es el vecino de" +
                " junto de la familia Simpson. Normalmente es odiado por" +
                " Homer Simpson, que lo define como «peor que Frankenstein y" +
                " el Dr. No». Es un cristiano devoto y es el más amigable y " +
                "compasivo de todos los habitantes de Springfield," +
                " considerado normalmente como uno" +
                " de los pilares de su comunidad.","https://www.youtube.com/watch?v=qqb0bKABC1g"));
        personajes.add(new Personaje("Raul Londoño", new Date(), R.drawable.icono10, "Es un personaje malvado " +
                "y recurrente. Es el propietario de la Planta Nuclear " +
                "de Springfield y es el jefe de Homer Simpson. Es atendido" +
                " casi todo el tiempo por Waylon Smithers, su leal y adulador" +
                " ayudante, asesor, confidente y admirador secreto. El señor Burns " +
                "es el ciudadano más rico, poderoso y anciano de Springfield; " +
                "la revista Forbes calcula que su fortuna ronda los 16,8 billones " +
                "de dólares. Suele usar su poder y riquezas para hacer lo que " +
                "le place sin pensar en sus consecuencias y sin la intervención" +
                " de las autoridades. Estas características han hecho que la revista" +
                " Wizard lo considerara como el cuadragésimo quinto gran " +
                "villano de todos los tiempos.","https://www.youtube.com/watch?v=zu7aLgykqC0"));
        personajes.add(new Personaje(" Daniela Mancilla", new Date(), R.drawable.icono2, "Posiblemente es uno de los personajes" +
                " más oscuros y complejos de la serie. Refleja a los niños " +
                "pobres de familias rotas de Estados Unidos. Su padre lo abandonó " +
                "(diciendo: \"Voy a comprar unos cigarrillos\"). En otras ocasiones " +
                "se ha dicho que el padre de Nelson está en prisión. Su madre apenas" +
                " le toma en cuenta y se ha sugerido varias veces que trabaja como prostituta" +
                " o bailarina exótica. Posiblemente haya tenido una hermana ya que en el mismo" +
                " capítulo le dijo a Lisa \"tengo una hermana..., creo que está muerta\". Es fuerte, abusón," +
                " le encanta golpear y fastidiar a los demás. Su obvia delincuencia proviene " +
                "de su interés por las armas de fuego y su gusto por la destrucción. Aun así, hay " +
                "datos que muestran que Nelson es un personaje hasta cierto punto gentil, " +
                "estrangulado por la desesperanza de su vida y con un posible mal futuro.\n" +
                "\n" +
                "Al principio se mostraba como un niño pobre que había reprobado el " +
                "curso y que llegó al grupo de Bart (siendo más grande de edad que el) " +
                "pero despues, por causas desconocidas, " +
                "lo hicieron de su misma edad.","https://www.youtube.com/watch?v=flC6kvjTMiY&t=7s"));

        ListaDePersonajesFragment listaDePersonajesFragment =
                (ListaDePersonajesFragment)
                        getSupportFragmentManager().findFragmentById(R.id.fragmento_lista_personajes);
        listaDePersonajesFragment.setPersonajes(personajes);

    }


    /**
     * Permite determinar cual elemento del menu fue seleccionado
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);

        return  true;
    }

    /**
     * Método para mostrar un personaje seleccionado
     *
     * @param position
     */
    @Override
    public void onPersonajeSeleccionado(int position) {

        boolean esFragmento = getSupportFragmentManager().findFragmentById(R.id.fragmento_detalle_personaje) != null;
        if (esFragmento) {
            ((DetalleDePersonajeFragment) getSupportFragmentManager().findFragmentById(R.id.fragmento_detalle_personaje))
                    .mostrarPersonaje(personajes.get(position));
        } else {
            Intent i = new Intent(this, TabbedActivity.class);
            i.putExtra("per", personajes.get(position));
            startActivity(i);
        }

    }


}
