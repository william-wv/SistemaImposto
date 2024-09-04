import java.util.Scanner;

public class ColetadorDeDados {

	public Contribuinte coletarDados() {
		Scanner entrada = new Scanner(System.in);

		
		
		
		System.out.println("digite sua renda anual");
		String rendaAnual = entrada.nextLine();

		System.out.println("Digite seu estado civil (casado|solteiro)");
		String estadoCivil = entrada.nextLine();

		System.out.println("Possui filho?(s|n)");
		String possuiFilho = entrada.nextLine();

		
		
		
		
		
		entrada.close();

		Contribuinte c = new Contribuinte();
		c.setRendaAnual(Double.parseDouble(rendaAnual));
		c.setEstadoCivil(estadoCivil);

		if (possuiFilho.equals("n")) {
			c.setTemFilho(false);
		} else {
			c.setTemFilho(true);
		}
		return c;

	}

}
