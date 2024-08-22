public class MinhaClasse {
    
    public static void main(String[] args) {

        String primeiroNome = "Felipe";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


        //Convertendo valores booleanos
        
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);
    }

    public static String nomeCompleto (String primeironome, String segundoNome) {

        return primeironome.concat(" ").concat(segundoNome);

    }

}
