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
public class Salgadinho extends Massa implements Salgado{

    @Override
    public void dobrarMassa() {
        System.out.println("Amassar levemente as partes superior e inferior da esfera.");
    }

    @Override
    public void recortarMassa() {
        System.out.println("Separar um pedaço esférico pequeno da massa.");
    }

    @Override
    public double custo() {
        return 0.3;
    }

    @Override
    public String descricao() {
        return "salgadinho com";
    }
    
}
