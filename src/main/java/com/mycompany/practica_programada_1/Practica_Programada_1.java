/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica_programada_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rperez
 */
public class Practica_Programada_1 {

    public static void main(String[] args) {
        ArrayList<Transaccion> Ingresos = new ArrayList<>();
        ArrayList<Transaccion> Egresos = new ArrayList<>();
        Gestion_de_transacciones gestion = new Gestion_de_transacciones();

        boolean continuar = true;

        // Bucle para el menú
        while (continuar) {
            String[] opciones = {"Registrar Ingreso", "Registrar Egreso", "Ver Ingresos", "Ver Egresos", "Salir"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
                    "Menú de Gestión de Transacciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == null || opcion.equals("Salir")) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Gracias, Chao!");
                break;
            }

            switch (opcion) {
                case "Registrar Ingreso":
                    try {
                        String montoIngresoTexto = JOptionPane.showInputDialog("Ingrese el monto:");
                        double montoIngreso = Double.parseDouble(montoIngresoTexto);
                        String descripcionIngreso = JOptionPane.showInputDialog("Ingrese la descripción:");
                        String fechaIngreso = JOptionPane.showInputDialog("Ingrese la fecha (dd/mm/aaaa):");

                        Ingreso nuevoIngreso = new Ingreso(montoIngreso, descripcionIngreso, fechaIngreso);
                        nuevoIngreso.procesarTransaccion(Ingresos);
                        JOptionPane.showMessageDialog(null, "Ingreso registrado exitosamente");

                    } catch (ExcepcionTransaccion e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El monto debe ser un número valido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "Registrar Egreso":
                    try {
                        String montoEgresoTexto = JOptionPane.showInputDialog("Ingrese el monto:");
                        double montoEgreso = Double.parseDouble(montoEgresoTexto);
                        String descripcionEgreso = JOptionPane.showInputDialog("Ingrese la descripción:");
                        String fechaEgreso = JOptionPane.showInputDialog("Ingrese la fecha (dd/mm/aaaa):");

                        Egreso nuevoEgreso = new Egreso(montoEgreso, descripcionEgreso, fechaEgreso);
                        nuevoEgreso.procesarTransaccion(Egresos);
                        JOptionPane.showMessageDialog(null, "Egreso registrado exitosamente");

                    } catch (ExcepcionTransaccion e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El monto debe ser un número valido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "Ver Ingresos":
                    StringBuilder listaIngresos = new StringBuilder("\n Lista de Ingresos \n");
                    if (Ingresos.isEmpty()) {
                        listaIngresos.append("No hay ingresos registrados");
                    } else {
                        for (Transaccion ingreso : Ingresos) {
                            listaIngresos.append(ingreso).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaIngresos.toString());
                    break;

                case "Ver Egresos":
                    StringBuilder listaEgresos = new StringBuilder("\n Lista de Egresos \n");
                    if (Egresos.isEmpty()) {
                        listaEgresos.append("No hay egresos registrados");
                    } else {
                        for (Transaccion egreso : Egresos) {
                            listaEgresos.append(egreso).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaEgresos.toString());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida, dele mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
