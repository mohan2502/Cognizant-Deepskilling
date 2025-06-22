package singleton;

public class Main {
	    public static void main(String[] args) {
	    	
	        Logger logger1 = Logger.getInstance();
	        logger1.log("First log message");

	        Logger logger2 = Logger.getInstance();
	        logger2.log("Second log message");
	        
	        if (logger1 == logger2) {
	            System.out.println("Only one instance of Logger is used across the application.");
	        } else {
	            System.out.println("Different instances exist! Singleton pattern is broken.");
	        }
	}
}