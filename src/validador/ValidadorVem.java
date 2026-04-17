package validador;

public class ValidadorVem {
    private double saldo;
    private int numeroCartao;
    private double tarifa;

        public ValidadorVem(int numeroCartao, double saldo, double tarifa){
            this.numeroCartao = numeroCartao;
            this.saldo = saldo;
            this.tarifa = tarifa; //
        }
        public void pagarPassagem() {
            if(saldo >= tarifa) {
                saldo = saldo - tarifa;
                System.out.println("PASSAGEM LIBERADA");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        }

        public double getSaldo() {
            return saldo;
    }

        public int getNumeroCartao() {
            return numeroCartao;
    }

        public double getTarifa() {
            return tarifa;
    }
}
