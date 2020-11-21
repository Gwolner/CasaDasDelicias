/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.singleton;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

/**
 *
 * @author wolner
 */
public class Forno {
    
    private static Forno forno;
    
    private Forno(){
        
    }
    
    public static Forno getInstance(){
        if(forno == null){
            forno = new Forno();
            System.out.println("Forno ligado");
        }else{
            System.out.println("O forno já está ligado!");
        }
        
        return forno;
    }
    
    public static Forno ligar(){
        return getInstance();
    }
    
    public void assar(Salgado salgado){
        System.out.println("~Assando "+salgado.descricao()+"~");
    }
    
    public void retirarMassa(){
        System.out.println("Assado está pronto para consumo!\n");
    }
    
    public void desligar(){
        forno = null;
    }
    
}
