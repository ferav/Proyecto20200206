/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200206;

/**
 *
 * @author Administrador
 */
public class Termino {
    
    double coeficiente;
    char letra;
    public Termino(double co, char le){
        coeficiente = co;
        letra = le;
    }
    
    public Termino(double co){
        coeficiente = co;
        letra = ' ';
    }
    
    public Termino(char le){
        coeficiente = 1;
        letra = le;
        
    }
    public double getCoeficiente()
    {
        return coeficiente;
    }
}
