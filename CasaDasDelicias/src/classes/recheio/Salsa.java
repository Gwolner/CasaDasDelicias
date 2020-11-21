/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.recheio;

import interfaces.Salgado;
import padrao.decorator.DecoratorSalgado;

/**
 *
 * @author wolner
 */
public class Salsa extends DecoratorSalgado{
    
    public Salsa(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.07 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + " ,salsa";
    }
}
