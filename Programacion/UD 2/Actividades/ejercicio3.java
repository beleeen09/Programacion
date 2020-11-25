import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {	
        Scanner sc = new Scanner(System.in);
        int X, Y;
        System.out.print("Introduzca valor de X: ");
        X = sc.nextInt();
        System.out.print("Introduzca Valor de Y: ");
        Y = sc.nextInt();

        System.out.println(X-Y);

        System.out.println(X+Y);

        System.out.println(X/Y);

        System.out.println(X*Y);
	}
}