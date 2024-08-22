public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("volume Atual? " + smartTv.ligada);

        smartTv.ligar();
        smartTv.mudarCanal();
        smartTv.mudarCanal();

        smartTv.voltarCanal();
        smartTv.mudarCanal();
        smartTv.voltarCanal();
        
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);

        System.out.println("Canal atual " + smartTv.canal);
  





    }
}
