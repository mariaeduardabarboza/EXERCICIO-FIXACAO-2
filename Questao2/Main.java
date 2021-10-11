
public class Main{ 
	  public static void main(String[] args) {
	  Post post = new Post("FORA BOLSONARO", "https://edition.cnn.com/" );
    post.curtir();
    post.curtir();
    post.curtir();

  System.out.println("Número de Curtidas:"+post.getNumeroCurtidas());
  
  post.compartilhar();
  post.compartilhar();
  System.out.println("Número de Compartilhamentos:"+post.getNumeroCompartilhamentos());
    }
  }

