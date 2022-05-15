package com.example.parcialadsw;

public class Empleado {

    protected String nombre ;
    protected int documento;
    protected String dependencia;
    protected String cargo;
    protected float salariosMinimo;
    protected static float salarioMinimo = 1000000;


    public Empleado(String nombre, int documento, String dependencia, String cargo, float salariosMinimo) {
        this.nombre = nombre;
        this.documento = documento;
        this.dependencia = dependencia;
        this.cargo = cargo;
        this.salariosMinimo = salariosMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalariosMinimo() {
        return salariosMinimo;
    }

    public void setSalariosMinimo(float salariosMinimo) {
        this.salariosMinimo = salariosMinimo;
    }

    public static float getSalarioMinimo() {
        return salarioMinimo;
    }

    public double calcularSalario(){
        double sala=0;
        sala = (this.salariosMinimo * salarioMinimo)* 0.88;
        return sala;
    }


}
