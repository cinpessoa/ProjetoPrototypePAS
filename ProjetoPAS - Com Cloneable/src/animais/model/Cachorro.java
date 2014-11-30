/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animais.model;

/**
 *
 * @author CINTHIA
 */
public class Cachorro implements Animal {
    private String nome;
  
    public Cachorro(){
        System.out.println("Cachorro");
    }
    
    public void comer(){
        System.out.println(nome + " está comendo...");
    }
    
    public void andar(){
        System.out.println(nome + " está andando...");
    }
    //Implementando método clonar da interface FabricaAnimais
    public Animal clonar(){
        System.out.println("O cachorro está sendo clonado");
        Cachorro cachorro = null;
        
        try {
            // Chama o clone da superclasse FabricaAnimais e "converte" ao tipo FabricaCachorro.
            cachorro = (Cachorro) super.clone();
        // Se FabricaAnimais não extender a Cloneable, dá erro.
        }catch(CloneNotSupportedException e) {	               
	    System.out.println("Não foi possível clonar");
	    e.printStackTrace();
        }
        return cachorro;
        
    }
    public String toString(){
        return "O cachorro "+getNome()+" foi criado";
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
