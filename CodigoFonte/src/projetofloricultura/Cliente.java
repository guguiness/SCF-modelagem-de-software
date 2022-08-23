/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofloricultura;

import java.util.Calendar;

/**
 *
 * @author Meu
 */
public class Cliente extends Pessoa {
    
    private Calendar cadas_cliente;
 
    public Cliente(Calendar cadas_cliente, String nome, String cpf, String data_nasc, String email, String celular, String rua, String cidade, String numero, String estado) {
        super(nome, cpf, data_nasc, email, celular, rua, cidade, numero, estado);
        this.cadas_cliente = cadas_cliente;
    }

    public Cliente(String nome, String cpf, String data_nasc, String email, String celular, String rua, String cidade, String numero, String estado) {
        super(nome, cpf, data_nasc, email, celular, rua, cidade, numero, estado);
    }


    public Calendar getCadas_cliente() {
        return cadas_cliente;
    }

    public void setCadas_cliente(Calendar cadas_cliente) {
        this.cadas_cliente = cadas_cliente;
    }
}