public interface Navegadorinternet {

    default void exibirPagina(String url){
        System.out.println("Exibindo Pagina: " + url);
    }

    default void adcionarAba(){
        System.out.println("Aba Adicionada");
    }

    default void atualizarAba(){
        System.out.println("Aba Atualizada");
    }
}
