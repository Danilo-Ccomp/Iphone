public interface ReprodutorMusical {
    default void tocar(){
        System.out.println("Tocando musica");
    }
    default void selecionarMusica(String musica){
        System.out.println("Tocar " + musica);
    }
    default void pausar(){
        System.out.println("Pausando musica");
    }
}
