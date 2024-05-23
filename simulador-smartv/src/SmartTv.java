public class SmartTv {

   boolean ligada = false;

    int canal = 1;

    int volume = 20;

    public void ligar(){

        ligada = true;

    }

    public void desligar(){

        ligada = false;

    }

    public void aumentarVolume(){

        if(ligada == true){
            volume++;
        } else {
            System.out.println("Tv estah desligada");
        }
         
    }

    public void diminuirrVolume(){

        if(ligada == true){
            volume--;
        } else {
            System.out.println("Tv estah desligada");
        }
         
    }

    public void aumentarCanal(){

        canal++;

    }
    
    public void diminuirrCanal(){

        canal--;

    }

    public void mudarCanal(int canalNovo){

        canal = canalNovo;
        
    }
}
