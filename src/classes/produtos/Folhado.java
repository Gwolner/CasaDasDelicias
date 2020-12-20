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
public class Folhado extends Massa implements Salgado{

    @Override
    public String dobrarMassa() {
        System.out.println("Por uma tira sobre a outra e dobrar nas bordas");
        
        return "Por uma tira sobre a outra e dobrar nas bordas";
    }

    @Override
    public String recortarMassa() {
        System.out.println("Recortar três tirar de formato quadrado");
        
        return "Recortar três tiras de formato retangular";
    }

    @Override
    public double custo() {
        return 0.70;
    }

    @Override
    public String descricao() {
        return "folhado recheado com";
    }
    
}
