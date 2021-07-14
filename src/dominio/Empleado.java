package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }
    public String getNombre() {
        return nombre;
    }
    public Fecha getFechaN() {
        return fechaN;
    }
    public Fecha getFechaI() {
        return fechaI;
    }
    public void verDatosNacimiento() {
        System.out.println("Nombre: " + this.nombre.toUpperCase());
        System.out.println("Fecha de Nacimiento: "
          + fechaN.getAnio() + "/" + fechaN.getMes() + "/" + fechaN.getDia());
    }
    public void verDatosIngreso() {
        System.out.println("Fecha de Ingreso: " + fechaI.getAnio() + "/" + fechaI.getMes() + "/" + fechaI.getDia());
    }

    public void numeroAnios(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int cont = 0;
        int atotales = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while ((fecha.get(Calendar.YEAR) != fechaActual.get(Calendar.YEAR))) {
            fecha.add(Calendar.YEAR, 1);
            cont++;
        }
        atotales = cont;
        System.out.print(atotales +" años, ");
    }

    public void numeroDias(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int cont = 0;
        int dtotales = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while (true) {
            if ((fecha.get(Calendar.DAY_OF_MONTH) == fechaActual.get(Calendar.DAY_OF_MONTH)) && (fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)) && (fecha.get(Calendar.YEAR) == fechaActual.get(Calendar.YEAR))) {
                break;
            }
            fecha.add(Calendar.DAY_OF_MONTH, 1);
            cont++;
        }
        dtotales = cont % 365;
        System.out.print(dtotales + " días\n");
    }

    public void numeroMeses(int dia, int mes, int anio) {
        GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
        int cont = 0;
        int mtotales = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        while (true) {
            if ((fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH))&& (fecha.get(Calendar.YEAR) == fechaActual.get(Calendar.YEAR))) {
                break;
            }
            fecha.add(Calendar.MONTH, 1);
            cont++;
        }
        mtotales = cont % 12;
        System.out.print(mtotales + " meses, ");
    }

    @Override
    public String toString() {
        return this.nombre + "\n" + this.getFechaN() + "\n" + this.fechaI;
    }
}
