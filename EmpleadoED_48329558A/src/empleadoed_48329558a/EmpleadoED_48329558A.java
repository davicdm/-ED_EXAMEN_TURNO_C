
package empleadoed_48329558a;
import java.util.*;
/**
 *EJERCICIO PRÁCTICO EXAMEN EVAL 1ED
 * @author Davinia Francés 48329558A
 * @version 1.0
 */
public class EmpleadoED_48329558A {
    
 /**
   * @param factor_hora_extra
   * @param nombre completo
   * @param salarioBase
   */    
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
/**
 * 
 * @param nombre completo en mayúsculas
 * @param dni 
 */  
    
    public EmpleadoED_48329558A(String nombreCompleto, String dni) {
    this.nombreCompleto = nombreCompleto;
    this.dni = dni;
 }

/**
 * Calcula el salario bruto mensual en función del salario base por hora y las horas extras.
 * @param precio por hora de la hora extra se determina con la
constante FACTOR_HORA_EXTRA
 * @param número de horas extra dedicadas redondeado a la baja (entero)
 * @return el salario bruto mensual en euros con dos decimales
 */
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
