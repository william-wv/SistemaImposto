
public class Calculadora {

	public DividaAtiva calcula(Contribuinte contribuinte) {
		
		double taxa = 11.5;
		if(contribuinte.getEstadoCivil().equals("solteiro")) {
			taxa = taxa + 2.3;
		}
		
		if(contribuinte.isTemFilho() == false) {
			taxa = taxa + 1.1;
		}
		
		if(contribuinte.getRendaAnual() > 500000) {
			taxa = taxa + 9.5;
		}
		else if(contribuinte.getRendaAnual() > 100000) {
			taxa = taxa + 7.5;
		}
		else if(contribuinte.getRendaAnual() > 50000) {
			taxa = taxa + 6.5;
		}
		
		
		double valorDevido = (contribuinte.getRendaAnual() * taxa)/100;
		
		
		DividaAtiva divida = new DividaAtiva();
		divida.setTaxaAplicada(taxa);
		divida.setValorDevido(valorDevido);
		return divida;
		
	}

}
