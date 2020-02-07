package applicationDAO;
import java.util.Scanner;
import entitiesTO.ProductTO;

public class ProductDAO {

	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		
		ProductTO product = new ProductTO(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println();
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Update data: " + product);
	
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+ product);
		sc.close();
	}
}
