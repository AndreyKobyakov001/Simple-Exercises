/*
 * @author Andrey Kobyakov
 */


public class Main {
  
    /*
     * Converts a temperature from Celsius to Fahrenheit.
     * @param t
     * @return double
     */
    public static double celsiusToFahrenheit(double t) {//for a measurement in celsius
      double fTemp = (t * 9 / 5) + 32;//the thing is converted to fahrenheit
      return fTemp;
    }
  
  
    /*
     * Converts a temperature from Fahrenheit to Celsius.
     *
     * @param t
     * @return double
     */
    public static double fahrenheitToCelsius(double t) {//and vice versa
      double cTemp = (t - 32) * 5 / 9;//for the opposite
      return cTemp;
    }
  
  
    /*
     * 
     * @param args the command line arguments
     * @return void
     */
    public static void main(String[] args) {
      System.out.printf("10 degrees Celsius is %.1f degrees Fahrenheit.\n", celsiusToFahrenheit(10));
      System.out.printf("10 degrees Fahrenheit is %.1f degrees Fahrenheit.\n", fahrenheitToCelsius(10));
      System.out.printf("-10 degrees Celsius is %.1f degrees Fahrenheit.\n", celsiusToFahrenheit(-10));
      System.out.printf("-10 degrees Fahrenheit is %.1f degrees Fahrenheit.\n", fahrenheitToCelsius(-10));
      System.out.printf("0 degrees Celsius is %.1f degrees Fahrenheit.\n", celsiusToFahrenheit(0));
      System.out.printf("0 degrees Fahrenheit is %.1f degrees Fahrenheit.\n", fahrenheitToCelsius(0));
    }
  }