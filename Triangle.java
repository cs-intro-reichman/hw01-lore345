public class Triangle {
public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
int b  = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
boolean isTriangle= ((a+b)>c && (b+c)>a && (c+a)>b);


System.out.println("% java Triangle " +a+" "+b+" "+c);
System.out.println(a+ ", " +b+ ", " + c + ": " +isTriangle);





}}