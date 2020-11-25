import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c; 
        System.out.println("Introduzca valor de a: ");
        a = sc.nextInt();
        System.out.println("Introduzca un caracter b: ");
        b = sc.nextInt();
        System.out.println("Introduzca un caracter c: ");
        c = sc.nextInt();

        if(a > b && b > c){ System.out.println(a + ">" + b + ">" + c);}
            else System.out.println(a + ">" + c + ">" + b);
        if(b > a && a > c){ System.out.println(b + ">" + a + ">" + c);}
            else System.out.println(b + ">" + c + ">" + a);
        if(c > b && b > a){ System.out.println(c + ">" + b + ">" + a);}
            else System.out.println(c + ">" + a + ">" + b);
    }
}