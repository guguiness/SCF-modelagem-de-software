/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofloricultura;

import java.util.ArrayList;

/**
 *
 * @author Meu
 */
public class Listar {
     ArrayList<String> list=new ArrayList<String>();
    
    public void salvar(String s )
    {
        list.add(s);
    }
    public void Listar()
    {
        System.out.println(list);
    }
    
    public void Excluir(int a)
    {
        list.remove( a);
    }
}
