package searchfunction;

public class Main {
 public static void main(String[] args) {
     Product[] products = {
         new Product(1, "Laptop", "Electronics"),
         new Product(2, "Shirt", "Clothing"),
         new Product(3, "Mobile", "Electronics"),
         new Product(4, "Table", "Furniture"),
         new Product(5, "Pen", "Stationery")
     };

     System.out.println("Linear Search for 'Mobile':");
     Product foundLinear = Search.linearSearch(products, "Mobile");
     System.out.println(foundLinear != null ? foundLinear : "Not Found");

     Search.sortByName(products);

     System.out.println("\nBinary Search for 'Mobile':");
     Product foundBinary = Search.binarySearch(products, "Mobile");
     System.out.println(foundBinary != null ? foundBinary : "Not Found");
 	}
}
