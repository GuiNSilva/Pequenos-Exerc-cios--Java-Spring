package Services;

/* #2 criando o 3º compontente do serviço 
que vai depender dos outros 2 componentes para
realizar o calculo, as dependencias não devem ser
instanciadas na classe para evitar o alto acoplamento, 
são apenas declaradas, e criado o construtor do serviço recebendo
os componentes como parametros, usando o conceito 
de injeção de dependencias */

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
