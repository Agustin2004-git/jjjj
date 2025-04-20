import java.util.Scanner;

public class MGAEjercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opcion?");
        System.out.println("!! Abrazooooo!!");
        System.out.println("!!Huevo en la cabeza");
        System.out.println("!!Elige una chuche!!");
        System.out.println("!!Pintar la cara!!");
        int opcion = teclado.nextByte();
        do {
            switch ( int opcion){
                case 1:
                    System.out.println("!! Abrazooooo!!");
                case 2:
                    System.out.println("!!Huevo en la cabeza");
                case 3:
                    System.out.println("!!Elige una chuche!!");
                case 4:
                    System.out.println("!!Pintar la cara!!");
                    break;
            }
        }while(opcion != 5){
            System.out.println("opcion incorrecta");
        }


    }
}
