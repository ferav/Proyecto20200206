/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200206;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Buscador {
    
    public Buscador()
    {
    }
    public int buscarValorBusquedaBinaria(ArrayList<Integer> lista, int valor)
    {
        int n = lista.size();
        int centro,inicio = 0,fin = n-1;
        while(inicio <= fin)
        {
            centro=( fin + inicio)/2;
            if( lista.get(centro) == valor ) 
                return centro;
            else 
                if(valor < lista.get(centro)){
                fin = centro - 1;
                }
                else 
                {
                    inicio = centro + 1;
                }
        }
        return -1; 
    }
    
    public int buscarValorBusquedaLineal(ArrayList<Integer> lista, int valor)
    {
        int res = -1;
        for(int i = 0 ; i < lista.size() ; i++)
        {
            System.out.println(lista.get(i));
            
            if( lista.get(i) == valor)
            {
                res = i;
                break;
                
            }
        }
        return res;
    }

    public ArrayList<Integer> buscarPosicionDeSecuencias(ArrayList<Integer> lista, ArrayList<Integer> secuencia)
    {
        int pos = -1;
        ArrayList<Integer> res = new ArrayList();
        for(int i = 0 ; i < lista.size() ;i++)
        {
            
            if( lista.get(i) == secuencia.get(0))
            {
                
                pos = i;
                for(int j = 1; j < secuencia.size(); j++)
                {
                    if(secuencia.get(j) != lista.get(i+j))
                    {
                        pos = -1;
                        break;
                    }
                }
                if (pos != -1 )
                {
                    res.add(pos);
                }
            }
        }
        for(int i = 0; i<res.size() ;i++)
        {
            System.out.println("lista secuaencial:"+res.get(i));
        }
        return res;
    }
}
