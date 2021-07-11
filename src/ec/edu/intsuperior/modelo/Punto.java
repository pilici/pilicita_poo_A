/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 * los grados de visibilidad son: private, public, protected y defaut los
 * atributos son de visibilidad private
 *
 *
 * @author Invitado
 */
public class Punto {

    private int x;
    private int y;

    //constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
        System.out.println("objeto creado");
    }

    public Punto(int x1, int y1) {
        this.x = x1;
        this.y = y1;
        System.out.println("objeto creado");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
