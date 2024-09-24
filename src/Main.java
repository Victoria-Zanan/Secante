

import org.mariuszgromada.math.mxparser.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isCallSuccessful = License.iConfirmNonCommercialUse("Ana Victória");
        boolean isConfirmed = License.checkIfUseTypeConfirmed();
        String message = License.getUseTypeConfirmationMessage();

        mXparser.consolePrintln("isCallSuccessful = " + isCallSuccessful);
        mXparser.consolePrintln("isConfirmed = " + isConfirmed);
        mXparser.consolePrintln("message = " + message);

        Secante metodo = new Secante();

        Scanner teclado = new Scanner(System.in);
        System.out.println("expressão: ");
        String expressao = teclado.nextLine();

        System.out.println("x1: ");
        int x1 = teclado.nextInt();
        System.out.println("x2: ");
        int x2 = teclado.nextInt();
        System.out.println("erro: ");

        double erro = teclado.nextDouble();

        double result = metodo.secante(x1, x2, erro, expressao);

        if (result == 0) {
            System.out.println("Não há raízes neste intervalo");
        } else {
            System.out.println("A raiz é: " + result);
        }
    }
}