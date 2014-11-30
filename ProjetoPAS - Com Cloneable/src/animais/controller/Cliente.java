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
       Animal clone;        
       FabricaCloneDeAnimais fabricaClone = new FabricaCloneDeAnimais();
       switch(tipo){
            case 0:
                
               Cachorro toto = new FabricaCachorro().criarCachorro();  
              
               clone = fabricaClone.getClone(toto);
               clone.setNome(nome);
               clone.andar();
               clone.comer();
               
               System.out.println("Hashcode Original: "+ toto.hashCode());
               System.out.println("Hashcode Clone: "+ clone.hashCode());
               
               return clone;
            case 1:
                Animal mimi = new FabricaGato().criarGato();
                clone = fabricaClone.getClone(mimi);
                clone.setNome(nome);
                clone.andar();
                clone.comer();
                
               System.out.println("Hashcode Original: "+ mimi.hashCode());
               System.out.println("Hashcode Clone: "+ clone.hashCode());
               
                return clone;
            case 2:
               Animal saralee = new FabricaVaca().criarVaca();
               clone = fabricaClone.getClone(saralee);
               clone.setNome(nome); 
               clone.andar();
               clone.comer();
               
               System.out.println("Hashcode Original: "+ saralee.hashCode());
               System.out.println("Hashcode Clone: "+ clone.hashCode());
               
               
               return clone;
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
