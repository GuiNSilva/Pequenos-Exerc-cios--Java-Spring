package application;
import Services.DeliverServices;
import Services.PayServices;
import Services.TaxServices;

/* #4 Programa teste, aqui e onde deve ser instaciadas as 
	  dependencias*/
public class Programa {

	public static void main(String[] args) {
		// Precisa instanciar as Dependencias
		DeliverServices deliverServices = new DeliverServices();
		TaxServices taxServices = new TaxServices();

		// instancia do serviço PayServices passando as dependencias instanciadas
		// como argumentos.
		PayServices payServices = new PayServices(deliverServices, taxServices);

		// chamando o metodo finalPrice de PayServices
		System.out.println("Resultado = " + payServices.finalPrice(300.0, "Mg"));

	}

}
