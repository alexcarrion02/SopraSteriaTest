/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ArcAr
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> aMostrar = new ArrayList<>();
        int NUMERO = 7; //Numero de prueba
        aMostrar=obtenerNumerosDescendente(NUMERO,esPar(NUMERO));
        System.out.println(aMostrar.toString());

    }

    /**
     * Método que devuelve true en caso de ser par, en caso contrario false
     *
     * @param num
     * @return
     */
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
    /**
     * Método que obtiene una lista de números(pares o impares) dependiendo el parametro par
     * @param num
     * @param par
     * @return 
     */
    private static ArrayList<Integer> obtenerNumerosDescendente(int num, boolean par) {
        ArrayList<Integer> al=new ArrayList<>();
        try {
                int valorFinBucle=par?0:1;
                for (int i = num; i >= valorFinBucle; i--) {
                    if(par){
                        if(esPar(i)){
                            al.add(i);
                        }
                    }
                    else{
                        if(!esPar(i)){
                            al.add(i);
                        }
                    }
                      
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return al;
    }
}
