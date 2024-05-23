public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);

        //&smartTv.ligar();

        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);

        smartTv.mudarCanal(46);



    }
}
