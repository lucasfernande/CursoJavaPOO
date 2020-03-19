package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue); // Instanciando um novo contrato

		System.out.print("Enter number of installments: ");
		int n = sc.nextInt(); // Entrando o número de parcelas e meses

		ContractService contractService = new ContractService(new PaypalService()); // Instanciando o serviço de contrato e dentro dele instanciando o paypalService

		contractService.processContract(contract, n); // Chamando o processamento do contrato

		System.out.println("Installments:");
		for (Installment x : contract.getInsts()) {
			System.out.println(x);
		}

		sc.close();
	}

}
