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
public interface Animal extends Cloneable {
    public Animal clonar();
    public void comer();
    public void andar();
    public void setNome(String nome);
    public String getNome();
    
    
}
