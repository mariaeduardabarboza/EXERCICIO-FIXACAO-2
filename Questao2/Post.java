public class Post {
	
	    private String texto;
	    private String link;
	    private int numeroCurtidas;
            private int numeroCompartilhamentos;

public String getTexto() {
 return texto;
 }

 public void setTexto(String texto) {
 this.texto = texto;
 }

 public String getLink() {
 return link;
 }
  public void setLink(String link) {
 this.link = link;
 }
 public int getNumeroCurtidas() {
 return this.numeroCurtidas;
 }

 public void setNumeroCurtidas(int numeroCurtidas) {
 this.numeroCurtidas = numeroCurtidas;
 }
 public int getNumeroCompartilhamentos() {
 return this.numeroCompartilhamentos;
 }

 public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
 this.numeroCompartilhamentos = numeroCompartilhamentos;
 }
 public void curtir() {
this.numeroCurtidas +=1;
 }
public void compartilhar() {
this.numeroCompartilhamentos +=1;
 }
}
