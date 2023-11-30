package Services;

//#2 criando o 3º compontente que vai depender dos outros 2

public class PayServices {
	//Declarando as dependencias
	TaxServices taxServices;
	DeliverServices deliverServices;	
	
	
	//Construtor
	public PayServices(DeliverServices deliverServices, TaxServices taxServices) {
		this.taxServices = taxServices;
		this.deliverServices = deliverServices;
	}



	// metodo que calcula o preço final, utilizando os metodos das dependencias declaradas.
	public double finalPrice(double cost, String state) {
		return cost + deliverServices.fee(state)+ taxServices.tax(cost);

	}
}
