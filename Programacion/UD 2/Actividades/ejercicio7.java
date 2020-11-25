import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Introduzca el valor de x: ");
        x = sc.nextDouble();
        System.out.print("introduzca el valor de y: ");
        y = sc.nextDouble(); 
        double primera_parte = (1+(x*x/y));
        double segunda_parte = (x*x*x/(1+y));
        System.out.println("El resultado de z es: " + (primera_parte/segunda_parte));
        
    }	

}