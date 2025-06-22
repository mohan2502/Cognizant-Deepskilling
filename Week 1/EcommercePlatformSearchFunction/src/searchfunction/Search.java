package searchfunction;

import java.util.*;

public class Search {

	 public static Product linearSearch(Product[] products, String productName) {
	     for (Product product : products) {
	         if (product.productName.equalsIgnoreCase(productName)) {
	             return product;
	         }
	     }
	     return null;
	 }
	
	 public static Product binarySearch(Product[] products, String productName) {
	     int left = 0;
	     int right = products.length - 1;
	
	     while (left <= right) {
	         int mid = left + (right - left) / 2;
	         int cmp = products[mid].productName.compareToIgnoreCase(productName);
	
	         if (cmp == 0) {
	             return products[mid];
	         } else if (cmp < 0) {
	             left = mid + 1;
	         } else {
	             right = mid - 1;
	         }
	     }
	     return null;
	 }
	
	 public static void sortByName(Product[] products) {
	     Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
	 }
}
