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
    public class Endereco {
    private String  rua ;
    private String cidade ;
    private String numero ;
    private String estado ;

    public Endereco(String rua, String cidade, String numero, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", cidade=" + cidade + ", numero=" + numero + ", estado=" + estado + '}';
    }

    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
