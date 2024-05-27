package com.politecnicomalaga.artefactos;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class GestorJSON {
    public static boolean writeText(String fileName, String data) {
        FileWriter fo = null;
        PrintWriter pw = null;
        boolean resultado = false;

        try {
            fo = new FileWriter(fileName);
            pw = new PrintWriter(fo);

            pw.print(data);
            pw.flush();

            fo.close();
            fo = null;
            resultado = true;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }

        return resultado;
    }
    public static String readText(String fileName) {
        String resultado = "";
        FileReader fi = null;
        Scanner sc = null;

        try {
            fi = new FileReader(fileName);
            sc = new Scanner(fi);

            while (sc.hasNext()) {
                resultado += sc.nextLine() + "\n";
            }

            fi.close();
            fi = null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fi != null) {
                try {
                    fi.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }

        return resultado;
    }


    public static boolean cargarSensor(Artefacto art, String jsonfile) {
        try {
            String json = GestorJSON.readText(jsonfile);
            Gson trabajador = new Gson();
            Sensor sen = trabajador.fromJson(json, Sensor.class);
            return art.addSensor(sen);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean grabarSensor(Sensor sen, String jsonfile) {
        try {
            if (sen != null) {
                Gson trabajador = new Gson();
                String json = trabajador.toJson(sen);
                return GestorJSON.writeText(jsonfile, json);
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean grabarArtefacto(Artefacto art, String jsonfile) {
        try {
            if (art != null) {
                Gson trabajador = new Gson();
                String json = trabajador.toJson(art);
                return GestorJSON.writeText(jsonfile, json);
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean cargarArtefacto(Map<Integer, Artefacto> destino, String jsonfile) {
        try {
            String json = GestorJSON.readText(jsonfile);
            Gson trabajador = new Gson();
            Artefacto art = trabajador.fromJson(json, Artefacto.class);
            if (destino.get(art.getProductID()) != null) return false;
            destino.put(art.getProductID(), art);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
