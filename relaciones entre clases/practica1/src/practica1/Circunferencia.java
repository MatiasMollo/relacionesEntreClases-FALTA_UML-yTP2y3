/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author info7
 */
public class Circunferencia {
    double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    double calcularArea(){
        double r = this.radio;
        return Math.PI * (r * r);
    }
    
    double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    void modificarRadio(double r){
        this.radio = r;
    }
    
    double consultarRadio(){
        return this.radio;
    }
    
    
    
}
