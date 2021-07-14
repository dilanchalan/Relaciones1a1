
package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;

public class TestEmpleadoFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anioN, mesN, diaN;
        int anioI, mesI, diaI;
        String nombre;
        System.out.print("Nombre del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Año: ");
        anioN = entrada.nextInt();
        System.out.print("Mes: ");
        mesN = entrada.nextInt();
        System.out.print("Día: ");
        diaN = entrada.nextInt();
        fNacimiento = new Fecha(anioN, mesN, diaN);
        System.out.println("Digite la fecha de Ingreso a la empresa");
        System.out.print("Año: ");
        anioI = entrada.nextInt();
        System.out.print("Mes: ");
        mesI = entrada.nextInt();
        System.out.print("Día: ");
        diaI = entrada.nextInt();
        fIngreso = new Fecha(anioI, mesI, diaI);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("Datos Ingresados");
        empleado1.verDatosNacimiento();
        System.out.print("En la actualidad su edad es: ");
        empleado1.numeroAnios(diaN, mesN, anioN);    
        empleado1.numeroMeses(diaN, mesN, anioN);
        empleado1.numeroDias(diaN, mesN, anioN);
        empleado1.verDatosIngreso();
        System.out.print("La permanencia en la empresa es: ");
        empleado1.numeroAnios(diaI, mesI, anioI);
        empleado1.numeroMeses(diaI, mesI, anioI);
        empleado1.numeroDias(diaI, mesI, anioI);
    }
}
