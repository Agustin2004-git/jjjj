import java.util.Scanner;

public class MGAEjercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextByte();
        System.out.println("intyroduce el segundo numero");
        int numero2 = teclado.nextByte();
        if (numero1 > numero2) {
            System.out.println("El numero mayor es el" + numero1);
            System.out.println("El numero menor es el " + numero2);
        }else (numero2>numero1){
            System.out.println("El numero mayor es el" + numero2);
            System.out.println("El numero menor es el " + numero1);
        }


    }
}
