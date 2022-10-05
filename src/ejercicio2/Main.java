/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ArcAr
 */
public class Main {

    protected static int resultadoA = 0, resultadoB = 0, resultadoC = 0, resultadoD = 0;
    protected static double porcentajeE = 0, porcentajeF = 0;

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas = AgregarPersonasRandom();
        analisDeDatos(personas);
        System.out.println("Cantidad de personas mayores de edad (18 años o más)->" + resultadoA);
        System.out.println("Cantidad de personas menores de edad->" + resultadoB);
        System.out.println("Cantidad de personas masculinas mayores de edad->" + resultadoC);
        System.out.println("Cantidad de personas femeninas menores de edad->" + resultadoD);
        System.out.println("Mayores de edad (en %)->" + porcentajeE + "%");
        System.out.println("Mujeres respecto al total(en %)->" + String.format("%.2f", porcentajeF) + "%");
    }

    /**
     * Método que genera personas random
     *
     * @return
     */
    private static ArrayList<Persona> AgregarPersonasRandom() {
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            for (int i = 0; i < 50; i++) {
                Persona p = new Persona(new Random().nextInt(90) + 1, new Random().nextBoolean() ? 'M' : 'F');
                personas.add(p);
            }
        } catch (Exception e) {
        }

        return personas;
    }

    /**
     * Metodo para el analisis de datos
     *
     * @param personas
     */
    private static void analisDeDatos(ArrayList<Persona> personas) {
        try {
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).esMayorEdad()) {

                    resultadoA = resultadoA + 1;
                    if (!personas.get(i).esMujer()) {
                        resultadoC = resultadoC + 1;
                    }
                }
                if (!personas.get(i).esMayorEdad()) {
                    resultadoB = resultadoB + 1;
                    if (personas.get(i).esMujer()) {
                        resultadoD = resultadoD + 1;
                    }
                }
                if (personas.get(i).esMujer()) {
                    porcentajeF = porcentajeF + 1;
                }

            }

            porcentajeE = ((double) resultadoA / (double) personas.size()) * 100;
            porcentajeF = (porcentajeF / personas.size()) * 100;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
