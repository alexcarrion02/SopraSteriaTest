/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author ArcAr
 */
public class Persona {
    private int edad;
    private char sexo;

    public Persona(int edad, char sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public boolean esMayorEdad(){
        return edad>=18?true:false;
    }
    public boolean esMujer(){
        return sexo=='F';
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}
