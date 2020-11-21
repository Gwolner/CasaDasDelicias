/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.templatemethod;

/**
 *
 * @author wolner
 */
public abstract class Massa {
    
    public void adicionarAgua(){
        System.out.println("Adicionar água");
    }
    
    public void adicionarFarinha(){
        System.out.println("Adicionar farinha.");
    }
    
    public void adicionarFermento(){
        System.out.println("Adicionar fermento.");
    }
    
    public void baterMistura(){
        System.out.println("Bater mistura.");
    }
    
    public void adicionarSal(){
        System.out.println("Adicionar sal.");
    }
    
    public void descansarMassa(){
        System.out.println("~Massa descansando~");
    }
    
    public abstract void recortarMassa();
    
    public abstract void dobrarMassa();
    
    public void prepararMassa(){
        adicionarAgua();
        adicionarFarinha();
        adicionarFermento();
        baterMistura();
        adicionarSal();
        baterMistura();
        descansarMassa();
        recortarMassa();
        dobrarMassa();
                
    }
}
