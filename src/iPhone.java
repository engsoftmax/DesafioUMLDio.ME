public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void navegarInternet(String url) {
        System.out.println("Navegando para: " + url);
    }

    public void play() {
        System.out.println("Play");
    }

    public void pause() {
        System.out.println("Pause");
    }

    public void proximo() {
        System.out.println("Próxima música");
    }

    public void anterior() {
        System.out.println("Música anterior");
    }

    public void ligar() {
        System.out.println("Ligando o telefone");
    }

    public void desligar() {
        System.out.println("Desligando o telefone");
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    public void voltar() {
        System.out.println("Voltando");
    }
}
