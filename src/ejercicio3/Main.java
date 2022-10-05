/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author ArcAr
 */
public class Main {
    final static int HORAS_CALCULO=40;
    public static void main(String[] args) {
        double tarifa=25,horasTrabajadas=50,sueldo;
        sueldo=calcularSueldo(tarifa,horasTrabajadas);
        System.out.println("sueldo->"+sueldo);
    }
    /**
     * Metodo para calcular el sueldo en base a las horas
     * @param tarifa
     * @param horasTrabajadas
     * @return 
     */
    private static double calcularSueldo(double tarifa, double horasTrabajadas) {
        double res=0;
        double horasMas=0;
        try {
            if(horasTrabajadas>HORAS_CALCULO){
                horasMas=horasTrabajadas-HORAS_CALCULO;
                res=(tarifa*40)+(horasMas*tarifa*1.5);
            }
            else{
                res=tarifa*horasTrabajadas;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
