/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.facade;

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
public class ProducaoFacade {
    
    //Preparando o forno
    Forno forno;
    
    public void produzirCoxinhaDeCharque(){
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
    }
    
    public void produzirFolhadoDeFrango(){
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
    }
    
    public void produzirSalgadinhoDeQueijo(){
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
    }
    
    public void produzirPastelDeBelem(){
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
