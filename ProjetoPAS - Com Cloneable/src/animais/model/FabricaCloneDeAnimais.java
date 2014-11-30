/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animais.model;

/**
 *
 * @author HOME
*/ 
public class FabricaCloneDeAnimais {
       public Animal getClone(Animal tipoAnimal) {
        return tipoAnimal.clonar();
    }


}


