package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;

	/*método resposnsavel para calcular o preço com base na quantidade*/
	public double totalValueStock(){
		 return price * quantity;
	}
	
	/*método para adicionar à quantidade*/
	/*recebe como parametro a quantidade digitada*/
	public void addProduct(int quantity) {
		this.quantity += quantity;     /* mesma coisa que this.price = price * quantity;*/
	}
	
	/*para remover do estoque*/
	public void removeProduct(int quantity){
		this.quantity -= quantity;
	}
	
	/*método toString RETORNA ATRAVES DO MÉTODO a string para imprimir em program MAIN*/
	public String toString() {
		return name 
			+ ", $"
			+ String.format("price: %.2f", price)
			+ ", "
			+ quantity + " units, total: $ "
			+ String.format("%.2f", totalValueStock()); 
		
			/*objeto String.format()  = serve para formatar o print casas decimais
			 * (%.2f)*/
	}
	
}

