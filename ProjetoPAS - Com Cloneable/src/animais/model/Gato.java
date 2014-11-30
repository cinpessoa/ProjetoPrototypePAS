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
public class Gato implements Animal {
    private String nome;
    
    public Gato(){
        System.out.println("Gato");
    }
    
    public void comer(){
        System.out.println(nome + " está comendo...");
    }
    
    public void andar(){
        System.out.println(nome + " está andando...");
    }
    
    //Implementando método clonar da interface FabricaAnimais
    @Override
    public Animal clonar(){
        System.out.println("O gato está sendo clonado");
        Gato gato = null;
        
        try {
            // Chama o clone da superclasse FabricaAnimais e "converte" ao tipo FabricaGato.
            gato = (Gato) super.clone();
        // Se FabricaAnimais não extender a Cloneable, dá erro.
        }catch(CloneNotSupportedException e) {	               
	    System.out.println("Não foi possível clonar");
	    e.printStackTrace();
        }
        return gato;
        
    }
    public String toString(){
        return "O gato "+getNome()+" foi criado";
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
