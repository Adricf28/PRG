package com.politecnicomalaga.buscagen;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controlador {

    /////////////////////////////////////////////////////////////////////////////////////
    //
    // ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////
    
    private static final byte FASTA_HEAD_LINES = 10;

    //Instancia UNICA. Este es el "singleton"
    private static Controlador singleton;

    
    /////////////////////////////////////////////////////////////////////////////////////
    //
    // Comportamiento
    //
    /////////////////////////////////////////////////////////////////////////////////////
    
    private Controlador() {

    }

    public static Controlador getSingleton() {
            if (singleton == null) {
                    singleton = new Controlador();
            }
            return singleton;
    }


    public void realizaBusqueda(String gen, String mutaciones,String fichero) {
             Fasta miFasta = new Fasta(new Gen(gen,Byte.valueOf(mutaciones)),fichero);

             escribeFichero(miFasta.buscaGen());

    }

    private void escribeFichero(String resultado) {
            FileWriter fw=null; 
            try {
              fw = new FileWriter("resultado.txt");
              fw.write(resultado);
              fw.flush();
            } catch(IOException e) {
                    e.printStackTrace();
            } finally {
                if (fw!= null)
                    try {
                        fw.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            }
    }

    public String cargaHeadFasta(String fichero) {
            String resultado = "";
            FileReader fr;
            Scanner sc;
            byte lines=0;

            try {
                fr = new FileReader(fichero);
                sc = new Scanner(fr);

                while(lines<FASTA_HEAD_LINES && sc.hasNextLine()) {
                    resultado += sc.nextLine() + "\n";
                    lines++;
                }

                fr.close();
                resultado += "......";

            } catch(IOException e) {
                e.printStackTrace();
            } 

            return resultado;
    }


}
