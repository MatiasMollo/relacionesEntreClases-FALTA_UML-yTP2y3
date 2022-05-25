/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author info7
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(10,10);
        
        Circunferencia circulo = new Circunferencia(5);
        
        String data = "Medidas Rectangulo: " + rectangulo.toString() + "\n"
                + "Area Rectangulo: " + rectangulo.calcularArea() + "\n" 
                + "Perimetro Rectangulo: " + rectangulo.calcularPerimetro() + "\n"
                + "----------\n"
                + "Radio Circunferencia: " + circulo.consultarRadio() + "\n"
                + "Area Circunferencia: " + circulo.calcularArea() + "\n"
                + "Perimetro Circunferencia: " + circulo.calcularPerimetro();
        
        System.out.println(data);
        
        circulo.modificarRadio(10);
        
        System.out.println("\n" + circulo.consultarRadio());
        
    }
    
}
