package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Black","L1");
		
		
		
		/*product.setId(1);
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		product.color = "black";*/
		
		/*  Product product = new Product();
			product.setName("Laptop");
			product.setDescription("Laptop");
			product.setPrice("Laptop");
			product.setStockAmount("Laptop");
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);	

	}

}
