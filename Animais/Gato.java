/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author MiltonJr
 */
public class Gato extends Animal{
    private boolean castrado;

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    @Override
     public void emiteSom(){
        System.out.println("miauuuuu");
    }
}
