import java.util.Scanner;

public class CalcularTroco {

    public static void main(String[] args) {

        int centavos = pegarCentavos();
        int quarters = calcularMoedas25cents(centavos);
        centavos = centavos - (quarters * 25);
        System.out.println("qnt de moedas de 25 centavos >> " + quarters);

        int dimes = calcularMoedas10cents(centavos);
        centavos = centavos - (dimes * 10);
        System.out.println("qnt de moedas de 10 centavos >> " + dimes);

        int nickels = calcularMoedas5cents(centavos);
        centavos = centavos - (nickels * 5);
        System.out.println("qnt de moedas de 5 centavos >> " + nickels);

        int pennies = calcularMoedas1cents(centavos);
        centavos = centavos - (pennies * 1);
        System.out.println("qnt de moedas de 1 centavos >> " + pennies);


        int coins = quarters + dimes + nickels + pennies;
        System.out.println("qnt de moedas devolvidas >> " + coins);

    }


    private static int pegarCentavos() {

        Scanner meuNumero = new Scanner(System.in);
        System.out.println("Digite o número do troco: ");

        int centavos = meuNumero.nextInt();
        if(centavos == 0) {
            System.out.println("O valor do troco é 0 centavos.");
        } else if(centavos < 0) {
            System.out.println("O valor do troco é MENOR que 0 centavos.");
        }
        return centavos;
    }

    private static int calcularMoedas25cents(int centavos) {
        int i = centavos / 25;
        return i;
    }

    private static int calcularMoedas10cents(int centavos) {
        int i = centavos / 10;
        return i;
    }


    private static int calcularMoedas5cents(int centavos) {
        int i = centavos / 5;
        return i;
    }


    private static int calcularMoedas1cents(int centavos) {
        int i = centavos / 1;
        return i;
    }
}
