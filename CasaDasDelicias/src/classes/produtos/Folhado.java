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
    public void dobrarMassa() {
        System.out.println("Por uma tira sobre a outra e dobrar nas bordas.");
    }

    @Override
    public void recortarMassa() {
        System.out.println("Recortar três tirar de formato retangular.");
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
