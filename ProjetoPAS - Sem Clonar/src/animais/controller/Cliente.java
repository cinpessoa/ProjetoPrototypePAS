/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animais.controller;

import animais.model.Animal;
import animais.model.Cachorro;
import animais.model.FabricaCachorro;
import animais.model.FabricaCloneDeAnimais;
import animais.model.FabricaGato;
import animais.model.FabricaVaca;
import animais.model.Gato;
import animais.model.Vaca;
//import prototype.Gato;
//import prototype.Vaca;

/**
 *
 * @author CINTHIA
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    
    public Animal nomear(int tipo, String nome){
       
       switch(tipo){
            case 0:
               
               Cachorro toto = new FabricaCachorro().criarCachorro();  
               
               toto.setNome(nome);
               toto.andar();
               toto.comer();
               return toto;
                
            case 1:
                Gato mimi = new FabricaGato().criarGato();
                
                mimi.setNome(nome);
                mimi.andar();
                mimi.comer();
                return mimi;
                
            case 2:
               
               Vaca saralee = new FabricaVaca().criarVaca();
               
               saralee.setNome(nome); 
               saralee.andar();
               saralee.comer();
               return saralee;
        }
        return null;
        
    }
    
    public static void main(String[] args) {
        animais.view.Criar i = new animais.view.Criar();
        i.setVisible(true);
        
        
        //cria uma instância de FabricaCachorro, Vaca e Gato
        /*FabricaAnimais toto = new FabricaCachorro();
        FabricaAnimais saralee = new Vaca();
        FabricaAnimais mimi = new Gato();
        
        FabricaAnimais clone;
        
        clone = fabricaClone.getClone(toto);
        System.out.println(clone);
        
        clone = fabricaClone.getClone(saralee);
        System.out.println(clone);
        
        clone = fabricaClone.getClone(mimi);
        System.out.println(clone);*/
        
        

        

    }
    
}
