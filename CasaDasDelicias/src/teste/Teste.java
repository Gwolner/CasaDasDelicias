/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classes.produtos.Coxinha;
import classes.produtos.Folhado;
import classes.produtos.PastelDeBelem;
import classes.produtos.Salgadinho;
import classes.recheio.CharqueDesfiada;
import classes.recheio.FrangoDesfiado;
import classes.recheio.QueijoRalado;
import classes.recheio.Salsa;
import interfaces.Salgado;
import padrao.adapter.AdapterDoce;
import padrao.singleton.Forno;

/**
 *
 * @author wolner
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Preparando o forno
        Forno forno;
        
        
        //Definindo receita de coxinha
        Coxinha receitaDeCoxinha = new Coxinha();
        
        //Preparo da massa
        receitaDeCoxinha.prepararMassa();
        
        //Acrescentando recheio
        Salgado coxinha = new CharqueDesfiada(new Salsa(receitaDeCoxinha));
        
        //Assando o salgado
        forno = Forno.ligar();
        forno.assar(coxinha);
        forno.retirarMassa();
        
        
        //Definindo receita do folhado
        Folhado receitaDeFolhado = new Folhado();
        
        //Preparo da massa
        receitaDeFolhado.prepararMassa();
        
        //Acrescentando recheio
        Salgado folhado = new FrangoDesfiado(new Salsa(receitaDeFolhado));
        
        //Assando o salgado
        forno = Forno.ligar();
        forno.assar(folhado);
        forno.retirarMassa();
        
        
        //Definindo receita do salgadinho
        Salgadinho receitaDeSalgadinho = new Salgadinho();
        
        //Preparo da massa
        receitaDeSalgadinho.prepararMassa();
        
        //Acrescentando recheio
        Salgado salgadinho = new QueijoRalado(receitaDeSalgadinho);
        
        //Assando o salgado
        forno = Forno.ligar();
        forno.assar(salgadinho);
        forno.retirarMassa();
        
        //Definindo receita do pastel de Belém
        AdapterDoce receitaDePastelDeBelem = new AdapterDoce(new PastelDeBelem());
        
        //Preparo da massa
        receitaDePastelDeBelem.prepararMassa();
                        
        //Assando o salgado
        forno = Forno.ligar();
        forno.assar(receitaDePastelDeBelem);
        forno.retirarMassa();
        
    }
    
}
