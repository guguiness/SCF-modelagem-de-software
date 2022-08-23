/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofloricultura;

/**
 *
 * @author Meu
 */
public class Pessoa {
String nome ;
String cpf ;
String data_nasc ;
String email ;
String celular ;
Endereco endereço;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", data_nasc=" + data_nasc + ", email=" + email + ", celular=" + celular + ", endere\u00e7o=" + endereço + '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public Pessoa(String nome, String cpf, String data_nasc, String email, String celular, String rua, String cidade, String numero, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.email = email;
        this.celular = celular;
        this.endereço.setRua(rua);
        this.endereço.setCidade(cidade);
        this.endereço.setNumero(numero);
        this.endereço.setEstado(estado);
        
    }




}
