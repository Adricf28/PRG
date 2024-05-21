package com.politecnicomalaga.buscagen;

import java.util.Iterator;
import java.util.Queue;

public class Gen {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    // ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////
   
    protected String datos;
    protected byte mutaciones;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    // Comportamiento
    //
    /////////////////////////////////////////////////////////////////////////////////////
    public Gen(String datos, byte mutaciones) {
        this.datos = datos;
        this.mutaciones = mutaciones;
    }


    public String getDatos() {
        return datos;
    }

    public String compara(Queue<Character> cola) {
    	
    	int i=0;
    	int errores =0;
    	
        //como no tenemos index, i, j o equivalente contador no tenemos nada detrás del ; final del for
        //Este tipo especial de for/while es un bucle con iterador, y se usa en estructuras de datos
        //que han implementado el interface "iterable"
    	for (Iterator<Character> iterator = cola.iterator(); iterator.hasNext() && errores<=mutaciones;) {
            Character value = iterator.next();

            if (value != datos.charAt(i) && value != 'N') { //N es el  caracter comodín
                errores++;
            } 
            i++;
    	}
    	if (errores > mutaciones) {
    		return "";
    	} else {
    		return cola.toString().replaceAll("[^a-zA-Z]", "")+";"+String.valueOf(errores);
    	}
    }
	
	
    public byte getMutaciones() {
        return mutaciones;
    }
}
