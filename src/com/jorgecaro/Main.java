package com.jorgecaro;

public class Main {

    public static void main(String[] args) {

        Empleado e = new Empleado("Alfredo", "33", 23, true, 784.5);
        Programador p = new Programador("Alfredo", "33", 23, true, 700, 84, "PHP");

        System.out.println(e);
        e.setNombre("Paco");
        System.out.println(p);
        p.setLenguajeDominante("Java");

        e.AumentarSalario(5.1);
        p.AumentarSalario(5.1);
        System.out.println(e);
        System.out.println(p);
    }
}
