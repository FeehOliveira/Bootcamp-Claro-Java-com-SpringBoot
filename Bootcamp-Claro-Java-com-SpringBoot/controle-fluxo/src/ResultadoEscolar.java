public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7) {

            System.out.println("Aprovado");
        }else if (nota > 5 && nota <7) {
            System.out.println("voce esta de recuperacao!");
        }
        
        else{
            System.out.println("Voce foi reprovado!");
        }
    }
}
