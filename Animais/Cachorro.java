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
public class Cachorro extends Animal {
    private boolean temPulga;
    private boolean baba;

    public boolean temPulga() {
        return temPulga;
    }

    public void setTemPulga(boolean temPulga) {
        this.temPulga = temPulga;
    }

    public boolean baba() {
        return baba;
    }

    public void setBaba(boolean baba) {
        this.baba = baba;
    }
     @Override
     public void emiteSom(){
        System.out.println("au au au");
        especie = "teste";
    }
    
}
