public class Main{ 
	  public static void main(String[] args) {
	  Aviao aviao = new Aviao();
    aviao.setAltitude(10);
    aviao.setVelocidade(900);
  
  
  System.out.println("Altitude inicial:"+aviao.getAltitude()+"Km");
  System.out.println("Velocidade inicial:"+aviao.getVelocidade()+"Km/h");

System.out.println("                             ");

  aviao.reduzirAltitude(1);
  aviao.reduzirVelocidade(100);
  System.out.println ("Altitude atual:"+aviao.getAltitude()+"Km");
  System.out.println ("Velocidade atual:"+aviao.getVelocidade()+"Km/h");
 

    }
  }
