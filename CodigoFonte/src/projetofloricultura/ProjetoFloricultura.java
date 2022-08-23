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
public class ProjetoFloricultura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Planta pp1 = new Planta();
        Planta pp2 = new Planta();
        Planta pp3 = new Planta();
        Listar lis = new Listar();
        Listar lis1 = new Listar();
        
       p1.CadastraProduto(10, "Rosa", 0, "Dois", "12/12/1222", "Amo vc", "Flores muito bonitas");
       p2.CadastraProduto(20, "Florzona azul", 110, "TRES Dois", "12/12/1222", "Amo vc", "FlAAAores muito bonitas");
       p3.CadastraProduto(30, "Balinhas", 110, "TRES Dois", "12/12/1222", "Amo vc", "FlAAAores muito bonitas");
       
       
       pp1.CadastraPlanta("Petunia", 2, "Petunia", "pequeno","azul", "02/12/1222", "Nao", "12/12/1222", 0);
       
       lis.salvar((p1.toString()));
       lis.salvar((p2.toString()));
       lis.salvar((p3.toString()));
       lis1.salvar((pp1.toString()));
       lis1.salvar((pp2.toString()));
       lis1.salvar((pp3.toString()));
       lis1.Listar();
       lis1.Excluir(0);
       lis1.Listar();
       
       lis.Listar();
       lis.Excluir(1);
       lis.Listar();
       
        p2.EditaProduto(20, "Florzonauuiui", 110, "TRES Dois", "12/12/1222", "Amo vc", "FlAAAores muito bonitas");
        lis.salvar((p2.toString()));
        lis.Listar();
    }
    
}
