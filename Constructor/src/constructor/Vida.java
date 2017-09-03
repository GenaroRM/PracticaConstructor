/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 * 
 * @author Rodriguez Morua Genaro
 * @version 1.0.0
 * @since 01-09-2017
 */
public abstract class Vida {
    private String Agua;
    public abstract void Juntos(String Agua);
    /** 
     *
     * Metodo abstracto para la creacion de vida
     */
    public String getAgua() {
        return Agua;
    }
    public void setAgua(String Agua) {
        this.Agua=Agua;
    }
}
