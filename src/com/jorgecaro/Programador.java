package com.jorgecaro;

/**
 * Created by Jorge Caro on 30/03/2017.
 */
public class Programador extends Empleado {

    private int LineaCodigo;
    private String LenguajeDominante;

    //Constructores

    //Por defecto

    public Programador(){

    }

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineaCodigo, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        LineaCodigo = lineaCodigo;
        LenguajeDominante = lenguajeDominante;
    }

    //Conveniencia


    public Programador(int lineaCodigo, String lenguajeDominante) {
        LineaCodigo = lineaCodigo;
        LenguajeDominante = lenguajeDominante;
    }

    //Getter y Setter


    public int getLineaCodigo() {
        return LineaCodigo;
    }

    public void setLineaCodigo(int lineaCodigo) {
        LineaCodigo = lineaCodigo;
    }

    public String getLenguajeDominante() {
        return LenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        LenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador "+ super.toString() + "Programador{" +
                "LineaCodigo=" + LineaCodigo +
                ", LenguajeDominante='" + LenguajeDominante + '\'' +
                '}';
    }
}
