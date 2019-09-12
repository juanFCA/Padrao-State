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
public class StateConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {  
            new StateConexao().executa();  
        } catch (Throwable t) {  
            t.printStackTrace();  
        } 
    }
    
    private void executa() {  
        Conexao estado = Estados.ESTADO_1;  
        System.out.println(estado);  
  
        estado = estado.vaiProEstado2();  
        System.out.println(estado);  
  
        estado = estado.vaiProEstado3();  
        System.out.println(estado);  
        
        estado = estado.vaiProEstado4();  
        System.out.println(estado);  
        
        estado = estado.vaiProEstado5();  
        System.out.println(estado);  
        
        estado = estado.vaiProEstado1();  
        System.out.println(estado);  
    }  
    
}
