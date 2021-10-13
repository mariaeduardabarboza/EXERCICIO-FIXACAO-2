public class Aviao {
	
      private int altitude;
      private int velocidade;
   
 public int getAltitude() {
 return altitude;
 }
 public void setAltitude(int altitude) {
 this.altitude = altitude;
 }
 public int getVelocidade() {
 return velocidade;
 }
 public void setVelocidade(int velocidade) {
 this.velocidade = velocidade;
 }

 public void reduzirAltitude(int altitude) {
 this.altitude = this.getAltitude()- altitude;
 }
public void reduzirVelocidade(int velocidade) {
this.velocidade = this.getVelocidade() - velocidade;
 }
}


  
