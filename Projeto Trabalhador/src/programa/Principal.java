package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrab;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formdata = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String nomedep = sc.nextLine();
		
		System.out.println("Digite os dados do trabalhador");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String niveltrab = sc.nextLine();
		System.out.print("Salário base: ");
		double salariobase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, NivelTrab.valueOf(niveltrab), salariobase, new Departamento(nomedep));
		/* Instanciando um novo objeto do tipo Trabalhador, dados do objeto: nome digitado, uma instancia de NivelTrab no valor digitado e salario base.
		 *  Associado a esse objeto, terá outro objeto do tipo Departamento, e o nome desse departamento será o nome digitado */
		
		System.out.print("Quantos contratos esse trabalhador vai ter?");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Digite os dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = formdata.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPhora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorPhora, horas);
			trabalhador.addContrato(contrato); /* Associando o contrato com o trabalhador, o FOR irá se repetir até
			                                      todos os contratos serem associados ao trabalhador */ 
		}
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
		
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println();
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("Salário em " + mesEAno + ": " + String.format("%.2f", trabalhador.income(mes, ano)));
		
		sc.close();

	}

}
