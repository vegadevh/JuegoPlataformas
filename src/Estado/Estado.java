/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

/**
 *
 * @author diego
 */
public abstract class Estado {
    
    public abstract void iniciar();
    public abstract void actualizar();
    public abstract void dibujar();
    public abstract void presion(int t);
    public abstract void seleccion(int t);
    
}
