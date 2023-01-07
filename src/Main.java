import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a mi programa de suma!");
        Scanner inp = new Scanner(System.in);
        System.out.println("Por favor ingresa tu nombre");
        String nombre = inp.nextLine();
        boolean access = true;
        do {
                try{
                    System.out.println(nombre + " Si quiere sumar presiona marque 1, " +
                            "si quiere restar marque 2 " +
                            "si quiere multiplicar marque 3 " +
                            "y si quiere dividir marque 4 " +
                            "para salir presione 5");
                    int election = Integer.parseInt(inp.nextLine());
                    int numberOne;
                    int numberTwo;
            switch (election){
                case 1:
                    System.out.println("Ingresa un número " + nombre);
                    numberOne = Integer.parseInt(inp.nextLine());
                    System.out.println("Ingresa otro numero " + nombre);
                    numberTwo = Integer.parseInt(inp.nextLine());
                    System.out.println(numberOne + numberTwo);
                    break;
                case 2:
                    System.out.println("Ingresa un número " + nombre);
                    numberOne = Integer.parseInt(inp.nextLine());
                    System.out.println("Ingresa otro numero " + nombre);
                    numberTwo = Integer.parseInt(inp.nextLine());
                    System.out.println(numberOne - numberTwo);
                    break;
                case 3:
                    System.out.println("Ingresa un número " + nombre);
                    numberOne = Integer.parseInt(inp.nextLine());
                    System.out.println("Ingresa otro numero " + nombre);
                    numberTwo = Integer.parseInt(inp.nextLine());
                    System.out.println(numberOne * numberTwo);
                    break;
                case 4:
                    System.out.println("Ingresa un número " + nombre);
                    numberOne = Integer.parseInt(inp.nextLine());
                    System.out.println("Ingresa otro numero " + nombre);
                    numberTwo = Integer.parseInt(inp.nextLine());
                    try {
                        System.out.println(numberOne / numberTwo);
                    }catch (ArithmeticException ex){
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    access = false;
                    break;
            }
                }catch (NumberFormatException ex){
                    System.out.println("por favor ingrese un numero");
                }


        }while(access);
    }
}