public class Main {
    public static void main(String[] args) throws Exception {
        Contato contato = new Contato();
        contato.setNome ("Maria");

        System.out.println();
        contato.recebeMensagem("Oi");

        System.out.println();
        System.out.println("Voce tem " + contato.getQuantidadeDeMensagensNaoLidas() + " mensagens nao lidas com "
                + contato.getNome() + "!");

        System.out.println();
        contato.enviaMensagem("Olá.");
        contato.enviaMensagem("Como você está?");
        contato.enviaMensagem("Tudo bem com a família?");
        contato.enviaMensagem("Saudades.");
        contato.enviaMensagem("Te vejo por ai!");


        System.out.println();
        System.out.println("Voce tem " + contato.getQuantidadeDeMensagensNaoLidas() + " mensagens não lidas com "
                + contato.getNome() + "!");

      
        System.out.println();
        contato.mostrarMensagensNaoLidas();

     
        System.out.println();
        System.out.println("Voce tem " + contato.getQuantidadeDeMensagensNaoLidas() + " mensagens não lidas com "
                + contato.getNome() + "!");

    }
}
