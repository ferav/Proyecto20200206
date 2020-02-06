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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Termino> ecuacion1 = new ArrayList<>();
        ecuacion1.add(new Termino(2, 'x'));
        ecuacion1.add(new Termino(9, 'y'));
        ecuacion1.add(new Termino(2));
        
        
        ArrayList<Termino> ecuacion2 = new ArrayList<>();
        ecuacion2.add(new Termino(16, 'x'));
        ecuacion2.add(new Termino(5, 'y'));
        ecuacion2.add(new Termino('z'));
        ecuacion2.add(new Termino(36));
        
        Ecuacion ecuacion = new Ecuacion();
        ArrayList<Termino> res = ecuacion.sumarEcuaciones(ecuacion1, ecuacion2);
        
        for(int i =0;i < res.size();i++)
        {
            System.out.println(res.get(i).coeficiente +""+ res.get(i).letra);
        }
    }
    
}
