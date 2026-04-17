package validador;

public class ValidadorVem {
    public double saldo;
    public int numeroCartao;
    public double tarifa;

        public ValidadorVem(int numeroCartao, double saldo, double tarifa){
            this.numeroCartao = numeroCartao;
            this.saldo = saldo;
            this.tarifa = tarifa;
        }
        public void pagarPassagem() {
            if(saldo >= tarifa) {
                saldo = saldo - tarifa;
                System.out.println("PASSAGEM LIBERADA");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        }
    }