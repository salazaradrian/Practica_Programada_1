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
public class Egreso extends Transaccion{
    private double capital;
    
    public Egreso(double monto, String descripcion, String fecha) throws ExcepcionTransaccion{
        super(monto, descripcion, fecha);
        this.capital = capital;
        if (monto > capital){
            throw new ExcepcionTransaccion("El egreso excede el capital disponible");
        }
    }
    
    @Override
    public double calcularImpuesto(double monto){
        return monto*0;
    }
    
    
    @Override
    public void procesarTransaccion(ArrayList Egreso){
        Egreso.add(this);

    }
    
}
