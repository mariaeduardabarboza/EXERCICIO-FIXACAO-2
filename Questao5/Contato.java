public class Contato {
    private String nome;
    private int quantidadeDeMensagensNaoLidas;
    private String mensagensEnviadas;
    private String mensagensRecebidas;
    private String mensagensNaoLidas;

    public Contato(String nome) {
        this.nome = nome;
        this.quantidadeDeMensagensNaoLidas = 0;
        this.mensagensEnviadas = "";
        this.mensagensRecebidas = "";
        this.mensagensNaoLidas = "";
    }

    public void recebeMensagem(String mensagem) {
        setMensagensRecebidas(this.getMensagensRecebidas() + mensagem + "\n");
    }

    public void enviaMensagem(String mensagem) {
        System.out.println("***Notificacao***");
        this.quantidadeDeMensagensNaoLidas += 1;
        this.mensagensEnviadas += mensagem + "\n";
        setMensagensNaoLidas(this.getMensagensNaoLidas() + mensagem + "\n");

    }

    public void mostrarMensagensNaoLidas() {
        System.out.println(this.getNome()+ " te enviou: ");
        System.out.println(getMensagensNaoLidas());
        setQuantidadeDeMensagensNaoLidas(0);
        setMensagensNaoLidas("");

    }
    public void mostrarMensagens() {
        System.out.println(this.getNome()+ " te enviou: ");
        System.out.println(this.getMensagensEnviadas());

    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagensNaoLidas() {
        return this.mensagensNaoLidas;
    }
    public void setMensagensNaoLidas(String mensagensNaoLidas){
        this.mensagensNaoLidas = mensagensNaoLidas;
    }

    public void setQuantidadeDeMensagensNaoLidas(int quantidadeDeMensagensNaoLidas) {
        this.quantidadeDeMensagensNaoLidas = quantidadeDeMensagensNaoLidas;
    }
    public int getQuantidadeDeMensagensNaoLidas() {
        return this.quantidadeDeMensagensNaoLidas;
    }
    
    public String getMensagensEnviadas() {
        return this.mensagensEnviadas;
    }
    public void setMensagensEnviadas(String mensagensEnviadas) {
        this.mensagensEnviadas = mensagensEnviadas;
    }

    public String getMensagensRecebidas() {
        return mensagensRecebidas;
    }
    public void setMensagensRecebidas(String mensagensRecebidas) {
        this.mensagensRecebidas = mensagensRecebidas;
    }

}
