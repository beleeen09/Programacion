import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        System.out.print("Introduzca la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.print("¿Que nota quiere sacar en el trimestre?: ");
        nota2 = sc.nextDouble();
        nota3 = (nota2-(0.4*nota1))/0.6; 
        if(nota3 > 10 || nota3 < 0){
            System.out.println("Imposible que saques esa nota: ");
        }else{
        System.out.println("Para sacar: " + nota2 + "en el trimestre debes sacar un: " + nota3);
        }
        
    }	

}
    