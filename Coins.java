public class Coins {
public static void main(String[] args) {
int coins = Integer.parseInt(args[0]);
int cents = coins % 25;
int quaters = coins / 25;

System.out.println("% java Coins "+coins);
System.out.println("Use "+quaters+" quaters and "+cents+ " cents");


}}