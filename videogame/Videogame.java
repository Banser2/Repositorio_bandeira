/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

/**
 *
 * @author MiltonJr
 */
public class Videogame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personagem humano = new Personagem();
        humano.setEspecie("homo sapiens");
        humano.setAltura(1.90);
        humano.setPeso(110);
        humano.setForca(800);
        Arma escopeta = new Arma();
        escopeta.setDescricao("Escopeta 12");
        escopeta.setPoderDestruicao(6);
        humano.setArma(escopeta);
                
        Personagem elfo = new Personagem();
        elfo.setEspecie("elfus");
        elfo.setAltura(2.30);
        elfo.setPeso(180);
        elfo.setForca(1200);
        Arma espada = new Arma();
        espada.setDescricao("Espada Longa");
        espada.setPoderDestruicao(3);
        elfo.setArma(espada);
        
        if(humano.getPoderTotalCombate() > elfo.getPoderTotalCombate())
            System.out.println("ganhou o humano!!!");
        else
            System.out.println("ganhou o elfo!!!");
    }
    
}
