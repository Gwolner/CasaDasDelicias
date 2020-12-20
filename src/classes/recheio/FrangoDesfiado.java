/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.recheio;

import padrao.decorator.DecoratorSalgado;
import interfaces.Salgado;

/**
 *
 * @author wolner
 */
public class FrangoDesfiado extends DecoratorSalgado{

    public FrangoDesfiado(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.36 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + "e frango desfiado.";
    }
    
}
