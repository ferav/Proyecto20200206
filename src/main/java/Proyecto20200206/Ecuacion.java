/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200206;

import com.sun.org.apache.xpath.internal.operations.Variable;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Ecuacion {
    
    public Ecuacion()
    {
    }
    public ArrayList sumarEcuaciones(ArrayList<Termino> ecuacion1, ArrayList<Termino> ecuacion2)
    {
        ArrayList<Termino> ecuacionAux = ecuacion2;
        ArrayList<Termino> res = new ArrayList<>();
        for(int posEcu1 = 0; posEcu1 < ecuacion1.size() ; posEcu1++)
        {
            Termino termino = ecuacion1.get(posEcu1);
            for(int posEcu2 = 0 ; posEcu2 < ecuacionAux.size() ; posEcu2++ )
            {
                Termino termino2 = ecuacionAux.get(posEcu2);
                if(termino.letra == termino2.letra)
                {
                    termino.coeficiente = termino.coeficiente + termino2.coeficiente;
                    ecuacionAux.remove(posEcu2);
                    break;
                }
            }
            res.add(termino);  
        }
        if(ecuacionAux.size() > 0)
        {
            Termino terminoAux = res.get(res.size()-1);
            res.remove(res.size()-1);
            for(int posIni = 0; posIni < ecuacionAux.size() ; posIni++)
            {
                res.add(ecuacionAux.get(posIni));
            }
            res.add(terminoAux);
        }
        return res;  
    }
    
    
}
