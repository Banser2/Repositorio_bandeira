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
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal umAnimal = new Gato();
        umAnimal.emiteSom();
        //----------------------
        umAnimal = new Cachorro();
        umAnimal.emiteSom();
        
      //  Gato umAnimal = new Animal();
        
      //  umGato.setEspecie("Felis catus");
      //  umGato.setNomePopular("gato domestico");
       // umGato.emiteSom();
      //  umGato.setCastrado(false);
        
       // Cachorro umCachorro = new Cachorro();
       // umCachorro.setEspecie("Canis familiaris");
       // umCachorro.setNomePopular("cachorro");
       // umCachorro.emiteSom();
        
        
        
    }
    
}
