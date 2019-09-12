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
public class Estados {
    
    public static final Conexao ESTADO_1 = new Desconectado(); 
    public static final Conexao ESTADO_2 = new Conectar();  
    public static final Conexao ESTADO_3 = new RequisitarConexao(); 
    public static final Conexao ESTADO_4 = new Conectado(); 
    public static final Conexao ESTADO_5 = new Desconectar(); 
}
