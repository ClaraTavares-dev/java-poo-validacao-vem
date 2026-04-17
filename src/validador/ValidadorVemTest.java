package validador;

public class ValidadorVemTest {
    public static void main(String[] args) {

        validador.ValidadorVem[] cartoes = new validador.ValidadorVem[4];

        double tarifaPadrao = 4.10; //preço fixo

        cartoes[0] = new validador.ValidadorVem(1709,  20.00, tarifaPadrao);
        cartoes[1] = new validador.ValidadorVem(19900, 3.50, tarifaPadrao);
        cartoes[2] = new validador.ValidadorVem(12350, 4.10, tarifaPadrao);
        cartoes[3] = new validador.ValidadorVem(1765, 50.00, tarifaPadrao);


        for (int i = 0; i < cartoes.length; i++) {
            exibirValidacao(cartoes[i], "VALIDADOR DE VEM " + (i + 1));
        }
    }

    public static void exibirValidacao(validador.ValidadorVem cartaoVem, String titulo) {
        System.out.println("==============================");
        System.out.println(" "  + titulo);
        System.out.println("==============================");
        System.out.println("Cartão Nº:...................: " + cartaoVem.numeroCartao);
        System.out.printf("Tarifa do Ônibus:............: R$ %.2f%n", cartaoVem.tarifa);
        System.out.printf("Saldo Anterior:..............: R$ %.2f%n", cartaoVem.saldo);

        System.out.print("Status:......................: ");
        cartaoVem.pagarPassagem();

        System.out.printf("Saldo Atualizado:............: R$ %.2f%n", cartaoVem.saldo);
        System.out.println();
    }
}