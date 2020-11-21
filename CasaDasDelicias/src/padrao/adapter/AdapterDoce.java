/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.adapter;

import classes.produtos.PastelDeBelem;
import interfaces.Salgado;
import padrao.templatemethod.Massa;

/**
 *
 * @author wolner
 */
public class AdapterDoce extends Massa implements Salgado{
    
    PastelDeBelem pdb;
    
    public AdapterDoce(PastelDeBelem pdb){
        this.pdb = pdb;
    }

    @Override
    public void recortarMassa() {
        pdb.aplicarMoldeCircular();
    }

    @Override
    public void dobrarMassa() {
        pdb.modelarMassa();
    }
    
    public double custo() {
        return pdb.preco();
    }
    
    public String descricao() {
        return pdb.rechear();
    }
    
    
}
