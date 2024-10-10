/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_programada_1;

import java.util.ArrayList;

/**
 *
 * @author rperez
 */
public abstract class Transaccion {
    
    protected double monto;
    protected String descripcion;
    protected String fecha;

    public Transaccion(double monto, String descripcion, String fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public abstract double calcularImpuesto(double monto);
    public abstract void procesarTransaccion(ArrayList Ingresos)throws ExcepcionTransaccion;

    @Override
    public String toString() {
        return "Monto: " + monto + ",Descripcion: " + descripcion + ", Fecha: " + fecha; 
    }
    
    
    
    
}
