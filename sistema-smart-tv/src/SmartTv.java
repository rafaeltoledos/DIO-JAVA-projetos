public class SmartTv { //classe SmartTv
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal /*parâmetro do método, variável local, disponível apenas neste método*/) { //método
        canal = novoCanal;
    }
    public void aumentarCanal() { //método
        canal++;
    }
    public void diminuirCanal() { //método
        canal--;
    }
    public void aumentarVolume(){ //método
        volume++;
        //volume = volume + 1
        System.out.println("Aumentando para: " + volume);
    }
    public void diminuirVolume(){ //método
        volume--;
        //volume = volume - 1
        System.out.println("Diminuindo para: " + volume);
    }
    public void ligar() { //método
        ligada=true;
    }
    public void desligar() { //método
        ligada=false;
    }
}
