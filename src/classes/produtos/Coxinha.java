/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.produtos;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

/**
 *
 * @author wolner
 */
public class Coxinha extends Massa implements Salgado{
    
    @Override
    public String dobrarMassa() {
        System.out.println("Formar uma cavidade interna.");
        
        return "Formar uma cavidade interna";
    }

    @Override
    public String recortarMassa() {
        System.out.println("Separar uma porção esférica da massa.");
        
        return "Separar uma porção esférica da massa";
    }

    @Override
    public double custo() {
        return 0.9;
    }

    @Override
    public String descricao() {
        return "coxinha recheada com ";
    }
    
}
