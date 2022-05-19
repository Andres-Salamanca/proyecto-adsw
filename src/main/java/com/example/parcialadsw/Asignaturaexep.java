package com.example.parcialadsw;

public class Asignaturaexep extends Exception{
    private String detalle;

    public Asignaturaexep(String detalle) {
        this.detalle = detalle;
    }
    public String toString(){
        return "Exepcion de empleado ["+ detalle+"]";
    }
}
