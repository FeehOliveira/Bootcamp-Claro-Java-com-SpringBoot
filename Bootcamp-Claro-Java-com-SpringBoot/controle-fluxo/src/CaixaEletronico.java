
public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }


    
    /*
     * Operador Ternario
     * double saldo = 25.0;
     double valorSolicitado = 17.0;

     Atualizando o saldo usando operador ternário
     saldo = (valorSolicitado < saldo) ? (saldo - valorSolicitado) : saldo;

     System.out.println(saldo);
     */
}
