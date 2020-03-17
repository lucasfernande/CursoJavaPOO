package Exemplos;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class SomaDeDatas {

	public static void main(String[] args) {


		
		/*SOMA DE DATAS*/
	
		SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-03-06T12:42:07Z"));
		
		System.out.println(fds.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(fds.format(d));
		
		System.out.println("--------------------------");
		/* OBTER UMA UNIDADE DE TEMPO */
		
		Calendar cale = Calendar.getInstance();
		cale.setTime(d);
	    int minutes = cal.get(Calendar.MINUTE);
	    int segundos = cal.get(Calendar.SECOND);
	    int miliseg = cal.get(Calendar.MILLISECOND);
	    int mes = 1 + cal.get(Calendar.MONTH);
	    System.out.println("Minutos: " + minutes);
	    System.out.println("Segundos: " + segundos);
	    System.out.println("Milisegundos: " + miliseg);
	    System.out.println("Mês: " + mes);

	}

}
