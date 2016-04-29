/*
 * Clase para guardar la info de una Actividad del gimnasio
 */
package gimnasio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sandro Gamarra
 */
public class Actividad implements Serializable {
    
    private String nombre;
    private int maxPlazas;
    private int inscritos;
    private double precio;
    
    
    
    
    //constructor vacio
    public Actividad() {
    }
    
    //consrtuctor (sin inscritos)
    public Actividad(String nombre, int maxPlazas, int inscritos, double precio) {
        this.nombre = nombre;
        this.maxPlazas = maxPlazas;
        this.inscritos = inscritos;
        this.precio = precio;
        inscritos =0;
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Actividad{" + "nombre=" + nombre + ", maxPlazas=" + maxPlazas + ", inscritos=" + inscritos + ", precio=" + precio + '}';
    }
    
    //Metodo para comprobar si la actividad esta llena (maxPlazas = nº inscritos)
    public boolean isFull(){
        return (maxPlazas == inscritos);
    }
    //metodo que devuelve el nº de plazas disponibles
    public int getPlazasDisponibles(){
        return maxPlazas - inscritos;
    }
    
    //metodo hashCode (solo nombre)
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    //Arreglamos el equals para que no sea Case Sensitive.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actividad other = (Actividad) obj;
        /*/*/
        return this.nombre.equalsIgnoreCase(other.getNombre());
    }
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }


    public int getMaxPlazas() {
        return maxPlazas;
    }

    public void setMaxPlazas(int maxPlazas) {
        this.maxPlazas = maxPlazas;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
