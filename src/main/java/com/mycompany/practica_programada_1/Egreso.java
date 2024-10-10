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
    
    public Egreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
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
