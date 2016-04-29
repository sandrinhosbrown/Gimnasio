/*
 * Clase que encapsula el ArrayList del Socio
 */
package gimnasio;

import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaSocio {
    
    private ArrayList<Socio> lista;

    //constructor sin parametros
    //iniciamos una lista nueva con "lista = new ArrayList<>()"
    public ListaSocio() {
        lista = new ArrayList<>();
    }
    
    //metodo que añade un socio a la lista
    public void altaSocio(Socio s){
        lista.add(s);
    }
    
    //metodo que indica si un Socio existe o no en la lista
    //Utiliza el equales sobreescrito en la clase Socio
    //Dos socios son iguales si tienen el mismo nº de socio
    public boolean existe(Socio s){
        return lista.contains(s);
    }
    
    //Metodo que devuelve la cantidad de socios que hay en la lista
    public int cantidad(){
        return lista.size();
    }
    
    //Metodo que a partir del nº socio me devuelve el Socio
    //Si no existe devuelve null
    public Socio getSocio(int numSocio){
        for(Socio s: lista){
            if(s.getNumSocio() == numSocio){
                return s;
            }
        }
        return null;
    }
    
    //Metodo que devuelve la suma de todas las cuotas de los socios
    public double cuotasTotales(){
        double total = 0;
        for (Socio s:lista){
            total += s.getCuota();
        }
        return total;
    }
    
    public ArrayList<Socio> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Socio> lista) {
        this.lista = lista;
    }

}
