/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Proyecto20200206.Buscador;
import Proyecto20200206.Ecuacion;
import Proyecto20200206.Termino;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class BuscadorTest {
    
    public BuscadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    //Prueba del Ejercicio 1
    @Test
    public void sumarEcuaciones()
    {
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
        
        assertTrue(res.get(0).getCoeficiente() == 18);
        
    }
    
    //Prueba del Ejercicio 4
    @Test
    public void buscarValorBusquedaBinaria()
    {
        ArrayList listaNumeros = new ArrayList();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(9);
        listaNumeros.add(14);
        Buscador buscadorBinario = new Buscador();
        int posicion = buscadorBinario.buscarValorBusquedaBinaria(listaNumeros,9);
        assertTrue(posicion == 3);
    }
    
    
    //Prueba del Ejercicio 3
    @Test
    public void buscarValorBusquedaLineal()
    {
        ArrayList listaNumeros = new ArrayList();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(9);
        listaNumeros.add(14);
        Buscador buscadorBinario = new Buscador();
        int posicion = buscadorBinario.buscarValorBusquedaLineal(listaNumeros,9);
        assertTrue(posicion == 3);
    }
    
    
    //Prueba del Ejercicio 2
    @Test
    public void buscarPosicionesDeSecuencia()
    {
        ArrayList listaBusqueda = new ArrayList();
        listaBusqueda.add(7);
        listaBusqueda.add(4);
        listaBusqueda.add(9);
        listaBusqueda.add(2);
        listaBusqueda.add(15);
        listaBusqueda.add(3);
        listaBusqueda.add(4);
        listaBusqueda.add(8);
        listaBusqueda.add(1);
        listaBusqueda.add(8);
        listaBusqueda.add(5);
        listaBusqueda.add(2);
        listaBusqueda.add(15);
        listaBusqueda.add(11);
        listaBusqueda.add(13);
        listaBusqueda.add(17);
        listaBusqueda.add(14);
        
        ArrayList listaSecuencial = new ArrayList();
        listaSecuencial.add(2);
        listaSecuencial.add(15);
        
        Buscador buscadorBinario = new Buscador();
        ArrayList<Integer> posiciones = buscadorBinario.buscarPosicionDeSecuencias(listaBusqueda, listaSecuencial);
        assertTrue( posiciones.get(0) == 3);
    }
    
    
}
