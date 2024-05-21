package com.politecnicomalaga.buscagen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fasta {
	
    /////////////////////////////////////////////////////////////////////////////////////
    //
    // ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////
    
    protected Gen gen;
    protected String ficheroSeleccionado;
    protected String resultado;
    protected boolean bCalculado;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    // Comportamiento
    //
    /////////////////////////////////////////////////////////////////////////////////////
    
    public Fasta(Gen gen, String fichero) {
    	resultado = "";
    	bCalculado = false;
    	this.gen = gen;
    	this.ficheroSeleccionado = fichero;
    }
    
    public String buscaGen() {
    	String temporal;
    	String[] temporalDividido = new String[2];
    	int lineas=1;
    	Queue<Character> cola = new LinkedList<>();		
	
        resultado="";			    
    	if (!bCalculado) {
            bCalculado = true;

            BufferedReader buffer = null;
            //1. Abrimos el fichero
            try {
                InputStream in = new FileInputStream(ficheroSeleccionado);
                Reader reader = new InputStreamReader(in, Charset.defaultCharset());
                // buffer for efficiency
                buffer = new BufferedReader(reader);
                boolean bContinuar = true;

                //Cogemos la primera línea que es la descripción
                resultado = gen.getDatos()+";";
                resultado += gen.getMutaciones()+"\n";
                resultado += buffer.readLine()+"\n";

                //Construimos por primera vez la cola
                while (bContinuar) {
                    char r = (char)buffer.read();

                    if (cola.size()==gen.getDatos().length()) { //podemos buscar, cola preparada	   	        			  	   	        			
                        bContinuar = false;	   	        			
                    } else {
                        cola.offer(r);	//Equivalente a método add pero no eleva excepción
                                        //por llenar la cola. Mejor para colas variables en 
                                        //tamaño
                    }

                    if (r==-1) {  //Hemos llegado a EOF
                       buffer.close();
                       return "Gen más grande que el contenido del fichero. Imposible buscar";
                    }
                }
                
                //usamos la misma bandera, bContinuar, para controlar también este bucle
                //lo "reciclamos" para no tener dos boolean en funcionamiento
                //Este bucle recorre, ahora sí, todo el resto del fichero, caracter a caracter
                //para buscar el gen
                bContinuar=true;
                while (bContinuar) {
                    int ir = buffer.read();	   	        	
                    char r = (char)ir;

                    //3. Buscamos gen/mutación en la cola
                    temporal = gen.compara(cola);
                    if (!temporal.isEmpty()) {
                        temporalDividido = temporal.split(";");
                        temporal = temporalDividido[0] + ";" + String.valueOf(lineas) + ";" + temporalDividido[1]; 
                        resultado += temporal+"\n"; 
                    }

                    if (ir==-1) {  //llegamos a EOF
                        bContinuar = false;
                    } else if (r != '\n') {
                        //4 Avanzamos cola con el nuevo caracter
                        cola.poll();
                        cola.offer(r);	   	        			

                    } else {  //hemos encontrado \n es una nueva línea
                        lineas++;
                    }  //if
                }  //While
            } catch(IOException e) {
                e.printStackTrace();
                return "";	   		  			  		
            } finally {
                //5.Cerramos el fichero
                if (buffer != null)
                    try {
                        buffer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }  //try
    	} //if
    	return resultado;
    }
}
