/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
Para resolver este problema, você deve criar
uma CLASSE conforme projeto ao ado:

*/

package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*instanciar a classe Product*/
		Product product = new Product();
		
		/*CAPTURA DOS DADOS*/
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();		
		System.out.println("Price: ");
		product.price = sc.nextDouble();		
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		/*ENTRADA DE ADIÇÃO quantidade de produto*/
		System.out.print("Enter the number of products to be ADDED in stock: ");
		int quantity = sc.nextInt(); // variavel para receber a quantidade
		product.addProduct(quantity);// manda o valor da variavél para o método de product.
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		
		
		/*REMOÇÃO DE PRODUTOS - mesma coisa porém..*/
		System.out.print("Enter the number of products to be REMOVE in stock: ");
		quantity = sc.nextInt(); //
		product.removeProduct(quantity);//chama método de remoção da classe Product
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		sc.close();

	}

}
