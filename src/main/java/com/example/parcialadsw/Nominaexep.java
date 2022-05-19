package com.example.parcialadsw;

public class Nominaexep extends Exception{
    private String detalle;

    public Nominaexep(String detalle) {
        this.detalle = detalle;
    }
    public String toString(){
        return "Exepcion de empleado ["+ detalle+"]";
    }
}
