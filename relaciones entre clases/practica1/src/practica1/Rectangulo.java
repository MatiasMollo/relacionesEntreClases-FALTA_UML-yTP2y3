/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author info7
 */
public class Rectangulo {
    
    double largo,ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    double calcularArea(){
        return this.largo * this.ancho;
    }
    
    double calcularPerimetro(){
        return this.largo * 2 + this.ancho * 2;
    }
    
    
    public String toString(){
        return this.largo + " x " + this.ancho;
    }
    
}
