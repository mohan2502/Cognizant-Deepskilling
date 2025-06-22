package financialforecasting;

public class FinancialForecast {

	 public static double calculateFutureValue(double presentValue, double rate, int years) {
	     
	     if (years == 0) {
	         return presentValue;
	     }
	     return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
	 }
	
	 public static void main(String[] args) {
	     double presentValue = 10000.0; 
	     double rate = 0.05; 
	     int years = 10; 
	
	     double futureValue = calculateFutureValue(presentValue, rate, years);
	     System.out.printf("Future Value after %d years: ₹%.2f%n", years, futureValue);
	 }
}
