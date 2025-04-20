import java.util.Scanner;

public class MGAEjercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextByte();
        System.out.println("intyroduce el segundo numero");
        int numero2 = teclado.nextByte();
        for (numero1>numero2){
            System.out.println(numero1);
            System.out.println(numero2);
        }

    }

}
