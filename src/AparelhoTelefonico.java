public interface AparelhoTelefonico {

    default void ligar(String numero){
        System.out.println("ligando para "+numero);
    }
    default void atender(){
        System.out.println("Ligação Atendida");
    }
    default void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio Voz");
    }
}
