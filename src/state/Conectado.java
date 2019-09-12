/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author alunoces
 */
public class Conectado implements Conexao{
    
    @Override  
    public Conexao vaiProEstado1() {  
        return Estados.ESTADO_1;  
    }  
  
    @Override  
    public Conexao vaiProEstado2() {  
        return Estados.ESTADO_2;  
    }  
  
    @Override  
    public Conexao vaiProEstado3() {  
        return Estados.ESTADO_3;  
    }  
  
    @Override
    public Conexao vaiProEstado4() {
        return Estados.ESTADO_4;     
    }
    
    @Override
    public Conexao vaiProEstado5() {
        return Estados.ESTADO_5;     
    }
        
    @Override  
    public String toString() {  
        return "Rede Interna de Comunicação: " + getClass().getSimpleName();  
    }  

}
