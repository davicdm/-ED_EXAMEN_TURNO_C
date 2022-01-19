/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoed_48329558a;
import java.util.*;
/**
 *
 * @author Davinia
 */
public class EmpleadoED_48329558A {
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    public EmpleadoED_48329558A(String nombreCompleto, String dni) {
    this.nombreCompleto = nombreCompleto;
    this.dni = dni;
 }
    public double getSalarioEsteMes(int horasExtra) {
    double cantidadExtra, salarioFinal;
    cantidadExtra = horasExtra * this.salarioBasePorHora *
    FACTOR_HORA_EXTRA;
    salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
    salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
    return salarioFinal;
 }

 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) {
 EmpleadoED_48329558A emp = new EmpleadoED_48329558A("DAVINIA FRANCÉS",
"48329558A");
 int horasExtra = 2;
 System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
 + " euros, al hacer " + horasExtra + " horas extra.");
 }
    
}
