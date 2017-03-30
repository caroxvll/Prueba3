package com.jorgecaro;

/**
 * Created by Jorge Caro on 30/03/2017.
 */
public class Empleado {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    //Constructores

    //Por defecto

    public Empleado(){

    }

    //Conveniencia


    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Metodos

    public String DevolverEdad(){
        if (getEdad()<=21){
            return "Principiante";
        }else if (getEdad()>21&&getEdad()<=35){
            return "Intermedio";
        }else {
            return "Senior";
        }
    }

    public void AumentarSalario(double incremento){
        salario *= incremento;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", casado=" + casado +
                ", salario=" + salario +
                '}';
    }
}
