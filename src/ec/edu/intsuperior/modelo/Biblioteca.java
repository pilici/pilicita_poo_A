/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Invitado
 */
public class Biblioteca {
    float tamanio;
    int aforo;
    Libro libro; //tiene de un tipo de dato abstracto 
    String direccion;
    private Libro Libro;
    
    public Biblioteca (){
        
    }

    public Biblioteca(float tamanio, int aforo, Libro libro, String direccion, Libro Libro) {
        this.tamanio = tamanio;
        this.aforo = aforo;
        this.libro = libro;
        this.direccion = direccion;
        
    }

    public Biblioteca(int i, int i0, Libro L1, String cayambe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
        
                
        
        
    }

