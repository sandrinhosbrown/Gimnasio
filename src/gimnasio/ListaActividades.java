/*
 * Class which encapsulate the ArrayList of Actividad
 */
package gimnasio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sandro Gamarra
 */
public class ListaActividades implements Serializable {

    private ArrayList<Actividad> lista;

    //constructor vacio y dentro escribimos la inicializacion del arraylist
    public ListaActividades() {
        lista = new ArrayList<>();
        //si no inicializamos la lista, nos saldria un error del tipo NullPointerException
    }

    //Metodo que añade una Actividad a la lista
    public void altaActividad(Actividad a) {
        lista.add(a);
    }

    //Metodo que indica si una Actividad esta en la lista o no
    //Dos actividades son iguales si tienen el mismo nombre (utiliza equals)
    public boolean existe(Actividad a) {
        return lista.contains(a);
    }

    //metodo que devuelve la cantidad de Actividades que hay en la lista
    public int cantidad() {
        return lista.size();
    }

    //metodo que a partir del nombre nos deuelve la Actividad
    //si no existe devuleve null
    public Actividad getActividad(String nombre) {
        for (Actividad a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }
    
    //Metodo que devuelve un ArrayList con las actividades
    //que tienen plazas disponibles
    public ArrayList<Actividad> actividadesDisponibles(){
        ArrayList<Actividad> disponibles = new ArrayList<>();
        for (Actividad a:lista){
        if(!a.isFull()){ //Si no (!) esta llena, lo añado a la lista
            disponibles.add(a);
        }
    }
        return null;
    }

    public ArrayList<Actividad> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Actividad> lista) {
        this.lista = lista;
    }

}
