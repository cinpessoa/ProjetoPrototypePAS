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
