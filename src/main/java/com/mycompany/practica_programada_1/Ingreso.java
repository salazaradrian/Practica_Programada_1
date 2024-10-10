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
public class Ingreso extends Transaccion {
    

    public Ingreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
    }
    
    @Override
    public double calcularImpuesto(double monto){
        return monto*0.13;
    }
    
    
    @Override
    public void procesarTransaccion(ArrayList Ingreso){
        
        Ingreso.add(this);
        
    }
    
    
}
