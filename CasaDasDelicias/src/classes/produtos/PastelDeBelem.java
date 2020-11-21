/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.produtos;

import padrao.templatemethod.Massa;

/**
 *
 * @author wolner
 */
public class PastelDeBelem{    
    
    public void modelarMassa() {
        System.out.println("Deformar a massa em uma pequena forma de metal.");
    }

    public void aplicarMoldeCircular() {
        System.out.println("Aplicar molde circular na massa fina.");
    }
    
    public double preco() {
        return 0.70;
    }
    
    public String rechear() {
        return "a massa circular com recheio de nata até a borda.";
    }
}
