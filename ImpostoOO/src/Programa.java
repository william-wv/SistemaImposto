public class Programa {
	
	public static void main(String[] args) {
		
		ColetadorDeDados coletador = new ColetadorDeDados();
		Contribuinte c = coletador.coletarDados();		
				
		Calculadora calc = new Calculadora();
		DividaAtiva divida =  calc.calcula(c);		
		
		System.out.println("taxa de imposto aplicada: "+String.format("%.2f", divida.getTaxaAplicada())+"%");
		System.out.println("valor devido R$: "+ (String.format("%.2f", divida.getValorDevido())));
	}

}
