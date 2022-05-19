package com.example.parcialadsw;

public class empleadoexep extends Exception{
    private String detalle;


    public empleadoexep(String detalle) {
        this.detalle = detalle;
    }
    public String toString(){
        return "Exepcion de empleado ["+ detalle+"]";
    }
}
