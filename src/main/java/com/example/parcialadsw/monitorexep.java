package com.example.parcialadsw;

public class monitorexep extends Exception{
    private String detalle;

    public monitorexep(String detalle) {
        this.detalle = detalle;
    }
    public String toString(){
        return "Exepcion de empleado ["+ detalle+"]";
    }
}
