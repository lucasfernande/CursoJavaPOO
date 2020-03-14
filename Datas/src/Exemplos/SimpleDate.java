package Exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat fds2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fds.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		Date x5 = Date.from(Instant.parse("2020-03-06T12:32:55Z"));

		Date y2 = fds2.parse("05/03/2018 12:19:07");

		System.out.println(fds.format(x1));
	}

}
