package com.example.parcialadsw;

public class profesorexep extends Exception{
    private String detalle;

    public profesorexep(String detalle) {
        this.detalle = detalle;
    }
    public String toString(){
        return "Exepcion de empleado ["+ detalle+"]";
    }
}
