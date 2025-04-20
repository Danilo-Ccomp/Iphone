public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegadorinternet {
    public static void main(String[] args) {
        var MeuIphone = new Iphone();

        MeuIphone.ligar("Bom Dia & Cia");
        MeuIphone.tocar();
        MeuIphone.atender();
    }
}
