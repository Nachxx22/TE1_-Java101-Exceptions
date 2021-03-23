import java.util.Scanner;

public class Try {
    public static void Trytest() {
        int a;
        int b;
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Ingrese el primer número");
            a = reader.nextInt();
            System.out.println("Ingrese el segundo número");
            b = reader.nextInt();
            if (a + b > 0) {
                System.out.println("suma realizada");
                int j = a + b;
                System.out.println(j);
            }
            if (a < 0) {
                System.out.println("primer numero ingresado es negativo");
            }
            if (b < 0) {
                System.out.println("segundo numero ingresado es negativo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Un dato ingresado no es un número");
        } finally {
            System.out.println("Proceso terminado");
        }
    }

}
