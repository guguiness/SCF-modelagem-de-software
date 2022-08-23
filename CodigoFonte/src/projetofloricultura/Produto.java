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
public class Produto {
    private float valor;
    private String nome;
    private int id;
    private String lote;
    private String data_de_validade;
    private String mensagem;
    private String descrição;
    //private Estoque estoque1;
    //private Venda venda1;

    Produto() {
      
    }


    public void CadastraProduto(float valor, String nome, int id, String lote, String data_de_validade, String mensagem, String descrição) {
            this.valor = valor;
            this.nome = nome;
            this.id = id;
            this.lote = lote;
            this.data_de_validade = data_de_validade;
            this.mensagem = mensagem;
            this.descrição = descrição;
    }
    public void DeletarProduto(){

    }
    public void EditaProduto(float valor, String nome, int id, String lote, String data_de_validade, String mensagem, String descrição) {
            this.valor = valor;
            this.nome = nome;
            this.id = id;
            this.lote = lote;
            this.data_de_validade = data_de_validade;
            this.mensagem = mensagem;
            this.descrição = descrição;
            System.out.println(" Produto Editado com sucesso");
    }

    public Produto(float valor, String nome, int id, String lote, String data_de_validade, String mensagem, String descrição) {
        this.valor = valor;
        this.nome = nome;
        this.id = id;
        this.lote = lote;
        this.data_de_validade = data_de_validade;
        this.mensagem = mensagem;
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "\nProduto{" + "valor=" + valor + ", nome=" + nome + ", id=" + id + ", lote=" + lote + ", data_de_validade=" + data_de_validade + ", mensagem=" + mensagem + ", descrição=" + descrição + '}';
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getData_de_validade() {
        return data_de_validade;
    }

    public void setData_de_validade(String data_de_validade) {
        this.data_de_validade = data_de_validade;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
