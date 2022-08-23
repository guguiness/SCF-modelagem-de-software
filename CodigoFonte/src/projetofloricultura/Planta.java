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
public class Planta {
private  String  nome ;
private int id;
private  String  nome_cientifico;
private  String  porte;
private  String  cor;
private   String data_manu;
private  String  virar_produto;
private String   data_colhimento;
private int quantidade;

    Planta() {
        
    }

    @Override
    public String toString() {
        return "\nPlanta{" + "nome=" + nome + ", id=" + id + ", nome_cientifico=" + 
                nome_cientifico + ", porte=" + porte + ", cor=" + cor + ", data_manu=" + 
                data_manu + ", virar_produto=" + virar_produto + ", data_colhimento=" + 
                data_colhimento + ", quantidade=" + quantidade + '}';
    }

public void CadastraPlanta(String nome, int id, String nome_cientifico, 
        String porte, String cor, String data_manu, String virar_produto, 
        String data_colhimento, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.nome_cientifico = nome_cientifico;
        this.porte = porte;
        this.cor = cor;
        this.data_manu = data_manu;
        this.virar_produto = virar_produto;
        this.data_colhimento = data_colhimento;
        this.quantidade = quantidade;
}
public void DeletarPlanta(){
    
}
public void EditaPlanta(String nome, int id, String nome_cientifico, String porte, String cor, String data_manu, String virar_produto, String data_colhimento, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.nome_cientifico = nome_cientifico;
        this.porte = porte;
        this.cor = cor;
        this.data_manu = data_manu;
        this.virar_produto = virar_produto;
        this.data_colhimento = data_colhimento;
        this.quantidade = quantidade;
        System.out.println("Editado com sucesso. ");
}
public void ListarPlanta (){
    
}

    public Planta(String nome, int id, String nome_cientifico, String porte, String cor, String data_manu, String virar_produto, String data_colhimento, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.nome_cientifico = nome_cientifico;
        this.porte = porte;
        this.cor = cor;
        this.data_manu = data_manu;
        this.virar_produto = virar_produto;
        this.data_colhimento = data_colhimento;
        this.quantidade = quantidade;
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

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getData_manu() {
        return data_manu;
    }

    public void setData_manu(String data_manu) {
        this.data_manu = data_manu;
    }

    public String getVirar_produto() {
        return virar_produto;
    }

    public void setVirar_produto(String virar_produto) {
        this.virar_produto = virar_produto;
    }

    public String getData_colhimento() {
        return data_colhimento;
    }

    public void setData_colhimento(String data_colhimento) {
        this.data_colhimento = data_colhimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



}
