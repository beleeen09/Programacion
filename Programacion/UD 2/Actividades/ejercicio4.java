import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chicos, chicas;
        System.out.print("Introduzca cantidad de chicos: ");
        chicos = sc.nextInt();
        System.out.print("Introduzca cantidad de chicas: ");
        chicas = sc.nextInt();	
        int a = 100;
        System.out.println(chicos+chicas);
     
        System.out.println(chicos*a/(chicos+chicas));

        System.out.println(chicas*a/(chicos+chicas));
	}

}
