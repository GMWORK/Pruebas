/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecctionrest;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author kevin
 */
public class DataTimeClass {
    private String logFecha;

    public DataTimeClass(String logFecha) {
        this.logFecha = logFecha;
    }

    public String getLogFecha() {
        return logFecha;
    }

    public void setLogFecha(String logFecha) {
        this.logFecha = logFecha;
    }
    
    public void mostrarFechaHoraSistema(){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        System.out.println(/*"Fecha Actual: "*/fecha.getTime()
                           /*+ dia + "/" + (mes+1) + "/" + año*/);
        /*System.out.printf("Hora Actual: %02d:%02d:%02d %n",
                                              hora, minuto, segundo);*/
    }
}
