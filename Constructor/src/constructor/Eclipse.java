/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 * Ejercicio: CONSTRUCTORES
 * 
 * 
 * @author Rodriguez Morua Genaro
 * @version 1.0.0
 * @since 01-09-2017
 */
public class Eclipse extends Vida {
    
    
    private int Reproduccion;
    private int SeresVivos;
    
/** SOBRE ESCRITURA DE DATOS*/
    
    public Eclipse(int SeresVivos) {
        this.SeresVivos=SeresVivos;
        this.Reproduccion=0;
    }
    
    public Eclipse(int SeresVivos, int Reproduccion){
        this.Reproduccion = Reproduccion;
        this.SeresVivos = SeresVivos;
    }
    
    @Override
    public void Juntos(String Agua){
        this.setAgua(Agua);
        System.out.println(Agua + "La vida esta por generarse");
    }
    
    private void Generar(){
        System.out.println("La vida fue generada");
        this.Reproduccion -=10;
    }
    /** Lee la reproduccion y verifica si habra sobrepoblacion o no*/
    private void Reproduccion(int Reproduccion){
    if(Reproduccion < 0 || Reproduccion + this.Reproduccion > 100){
            System.out.println("No es posible generar sobrepoblacion");
        } else {
            this.Reproduccion += Reproduccion;
            System.out.println("Poblacion " + this.Reproduccion);
        }
    }
    /** GETTERS Y SETTERS*/
    public int getReproduccion(){
        return Reproduccion;
    }
    public void setReproduccion (int Reproduccion){
        this.Reproduccion=Reproduccion;
    }
    
}
